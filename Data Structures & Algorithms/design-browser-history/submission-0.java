class BrowserHistory {

    private String homepage;

    private LinkedList<String> pages;

    private ArrayDeque<String> forwardPages;

    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        this.pages = new LinkedList<String>();
        this.pages.add(homepage);
        this.forwardPages = new ArrayDeque<String>();
    }

    public void visit(String url) {
        forwardPages.clear();
        pages.add(url);
    }

    public String back(int steps) {
        int i = 0;
        while (i < steps && pages.size() > 1) {
            forwardPages.push(pages.pollLast());
            i++;
        }
        return pages.getLast();
    }
    
    public String forward(int steps) {
        int i = 0;
        while (i < steps && forwardPages.size() > 0) {
            pages.add(forwardPages.pop());
            i++;
        }
        return pages.getLast();
    }
}