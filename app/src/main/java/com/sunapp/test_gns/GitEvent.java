package com.sunapp.test_gns;

import java.util.List;

public class GitEvent {

        private String id;

        private String type;

        private Actor actor;

        private Repo repo;

        private Payload payload;

        private Boolean _public;

        private String created_at;

        private Org org;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Actor getActor() {
            return actor;
        }

        public void setActor(Actor actor) {
            this.actor = actor;
        }

        public Repo getRepo() {
            return repo;
        }

        public void setRepo(Repo repo) {
            this.repo = repo;
        }

        public Payload getPayload() {
            return payload;
        }

        public void setPayload(Payload payload) {
            this.payload = payload;
        }

        public Boolean getPublic() {
            return _public;
        }

        public void setPublic(Boolean _public) {
            this._public = _public;
        }

        public String getCreatedAt() {
            return created_at;
        }

        public void setCreatedAt(String createdAt) {
            this.created_at = createdAt;
        }

        public Org getOrg() {
            return org;
        }

        public void setOrg(Org org) {
            this.org = org;
        }


    public class Actor {
        private Integer id;
        private String login;
        private String display_login;
        private String gravatar_id;
        private String url;
        private String avatar_url;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getDisplayLogin() {
            return display_login;
        }

        public void setDisplayLogin(String displayLogin) {
            this.display_login = displayLogin;
        }

        public String getGravatarId() {
            return gravatar_id;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatar_id = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAvatarUrl() {
            return avatar_url;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatar_url = avatarUrl;
        }

    }

    public class Author {

        private String email;
        private String name;
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Base {

        private String label;
        private String ref;
        private String sha;
        private User__ user;
        private Repo__ repo;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public User__ getUser() {
            return user;
        }

        public void setUser(User__ user) {
            this.user = user;
        }

        public Repo__ getRepo() {
            return repo;
        }

        public void setRepo(Repo__ repo) {
            this.repo = repo;
        }

    }

    public class Comments {

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Commit {

        private String sha;
        private Author author;
        private String message;
        private Boolean distinct;
        private String url;

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Boolean getDistinct() {
            return distinct;
        }

        public void setDistinct(Boolean distinct) {
            this.distinct = distinct;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Commits {

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }



    public class Head {


        private String label;

        private String ref;

        private String sha;

        private User_ user;

        private Repo_ repo;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public User_ getUser() {
            return user;
        }

        public void setUser(User_ user) {
            this.user = user;
        }

        public Repo_ getRepo() {
            return repo;
        }

        public void setRepo(Repo_ repo) {
            this.repo = repo;
        }

    }

    public class Html {


        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Issue {

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Links {


        private Self self;

        private Html html;

        private Issue issue;

        private Comments comments;

        private ReviewComments reviewComments;

        private ReviewComment reviewComment;

        private Commits commits;

        private Statuses statuses;

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Html getHtml() {
            return html;
        }

        public void setHtml(Html html) {
            this.html = html;
        }

        public Issue getIssue() {
            return issue;
        }

        public void setIssue(Issue issue) {
            this.issue = issue;
        }

        public Comments getComments() {
            return comments;
        }

        public void setComments(Comments comments) {
            this.comments = comments;
        }

        public ReviewComments getReviewComments() {
            return reviewComments;
        }

        public void setReviewComments(ReviewComments reviewComments) {
            this.reviewComments = reviewComments;
        }

        public ReviewComment getReviewComment() {
            return reviewComment;
        }

        public void setReviewComment(ReviewComment reviewComment) {
            this.reviewComment = reviewComment;
        }

        public Commits getCommits() {
            return commits;
        }

        public void setCommits(Commits commits) {
            this.commits = commits;
        }

        public Statuses getStatuses() {
            return statuses;
        }

        public void setStatuses(Statuses statuses) {
            this.statuses = statuses;
        }

    }

    public class MergedBy {


        private String login;

        private Integer id;

        private String nodeId;

        private String avatarUrl;

        private String gravatarId;

        private String url;

        private String htmlUrl;

        private String followersUrl;

        private String followingUrl;

        private String gistsUrl;

        private String starredUrl;

        private String subscriptionsUrl;

        private String organizationsUrl;

        private String reposUrl;

        private String eventsUrl;

        private String receivedEventsUrl;

        private String type;

        private Boolean siteAdmin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

    }

    public class Org {


        private Integer id;

        private String login;

        private String gravatarId;

        private String url;

        private String avatarUrl;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

    }

    public class Owner {


        private String login;

        private Integer id;

        private String nodeId;

        private String avatarUrl;

        private String gravatarId;

        private String url;

        private String htmlUrl;

        private String followersUrl;

        private String followingUrl;

        private String gistsUrl;

        private String starredUrl;

        private String subscriptionsUrl;

        private String organizationsUrl;

        private String reposUrl;

        private String eventsUrl;

        private String receivedEventsUrl;

        private String type;
        private Boolean siteAdmin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

    }

    public class Owner_ {


        private String login;

        private Integer id;

        private String nodeId;

        private String avatarUrl;

        private String gravatarId;

        private String url;

        private String htmlUrl;

        private String followersUrl;

        private String followingUrl;

        private String gistsUrl;

        private String starredUrl;

        private String subscriptionsUrl;

        private String organizationsUrl;

        private String reposUrl;

        private String eventsUrl;

        private String receivedEventsUrl;

        private String type;

        private Boolean siteAdmin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

    }

    public class Payload {


        private Integer pushId;

        private Integer size;

        private Integer distinctSize;

        private String ref;

        private String head;

        private String before;

        private List<Commit> commits = null;

        private String action;

        private Integer number;

        private PullRequest pullRequest;

        public Integer getPushId() {
            return pushId;
        }

        public void setPushId(Integer pushId) {
            this.pushId = pushId;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getDistinctSize() {
            return distinctSize;
        }

        public void setDistinctSize(Integer distinctSize) {
            this.distinctSize = distinctSize;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public String getBefore() {
            return before;
        }

        public void setBefore(String before) {
            this.before = before;
        }

        public List<Commit> getCommits() {
            return commits;
        }

        public void setCommits(List<Commit> commits) {
            this.commits = commits;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public PullRequest getPullRequest() {
            return pullRequest;
        }

        public void setPullRequest(PullRequest pullRequest) {
            this.pullRequest = pullRequest;
        }

    }


    public class PullRequest {

        private String url;

        private Integer id;

        private String nodeId;

        private String htmlUrl;

        private String diffUrl;

        private String patchUrl;

        private String issueUrl;

        private Integer number;

        private String state;

        private Boolean locked;

        private String title;

        private User user;

        private String body;

        private String createdAt;

        private String updatedAt;

        private String closedAt;

        private String mergedAt;

        private String mergeCommitSha;

        private Object assignee;

        private List<Object> assignees = null;

        private List<Object> requestedReviewers = null;

        private List<Object> requestedTeams = null;

        private List<Object> labels = null;

        private Object milestone;

        private Boolean draft;

        private String commitsUrl;

        private String reviewCommentsUrl;

        private String reviewCommentUrl;

        private String commentsUrl;

        private String statusesUrl;

        private Head head;

        private Base base;

        private Links links;

        private String authorAssociation;

        private Object activeLockReason;

        private Boolean merged;

        private Object mergeable;

        private Object rebaseable;

        private String mergeableState;

        private MergedBy mergedBy;

        private Integer comments;

        private Integer reviewComments;

        private Boolean maintainerCanModify;

        private Integer commits;

        private Integer additions;

        private Integer deletions;

        private Integer changedFiles;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getDiffUrl() {
            return diffUrl;
        }

        public void setDiffUrl(String diffUrl) {
            this.diffUrl = diffUrl;
        }

        public String getPatchUrl() {
            return patchUrl;
        }

        public void setPatchUrl(String patchUrl) {
            this.patchUrl = patchUrl;
        }

        public String getIssueUrl() {
            return issueUrl;
        }

        public void setIssueUrl(String issueUrl) {
            this.issueUrl = issueUrl;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Boolean getLocked() {
            return locked;
        }

        public void setLocked(Boolean locked) {
            this.locked = locked;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getClosedAt() {
            return closedAt;
        }

        public void setClosedAt(String closedAt) {
            this.closedAt = closedAt;
        }

        public String getMergedAt() {
            return mergedAt;
        }

        public void setMergedAt(String mergedAt) {
            this.mergedAt = mergedAt;
        }

        public String getMergeCommitSha() {
            return mergeCommitSha;
        }

        public void setMergeCommitSha(String mergeCommitSha) {
            this.mergeCommitSha = mergeCommitSha;
        }

        public Object getAssignee() {
            return assignee;
        }

        public void setAssignee(Object assignee) {
            this.assignee = assignee;
        }

        public List<Object> getAssignees() {
            return assignees;
        }

        public void setAssignees(List<Object> assignees) {
            this.assignees = assignees;
        }

        public List<Object> getRequestedReviewers() {
            return requestedReviewers;
        }

        public void setRequestedReviewers(List<Object> requestedReviewers) {
            this.requestedReviewers = requestedReviewers;
        }

        public List<Object> getRequestedTeams() {
            return requestedTeams;
        }

        public void setRequestedTeams(List<Object> requestedTeams) {
            this.requestedTeams = requestedTeams;
        }

        public List<Object> getLabels() {
            return labels;
        }

        public void setLabels(List<Object> labels) {
            this.labels = labels;
        }

        public Object getMilestone() {
            return milestone;
        }

        public void setMilestone(Object milestone) {
            this.milestone = milestone;
        }

        public Boolean getDraft() {
            return draft;
        }

        public void setDraft(Boolean draft) {
            this.draft = draft;
        }

        public String getCommitsUrl() {
            return commitsUrl;
        }

        public void setCommitsUrl(String commitsUrl) {
            this.commitsUrl = commitsUrl;
        }

        public String getReviewCommentsUrl() {
            return reviewCommentsUrl;
        }

        public void setReviewCommentsUrl(String reviewCommentsUrl) {
            this.reviewCommentsUrl = reviewCommentsUrl;
        }

        public String getReviewCommentUrl() {
            return reviewCommentUrl;
        }

        public void setReviewCommentUrl(String reviewCommentUrl) {
            this.reviewCommentUrl = reviewCommentUrl;
        }

        public String getCommentsUrl() {
            return commentsUrl;
        }

        public void setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
        }

        public String getStatusesUrl() {
            return statusesUrl;
        }

        public void setStatusesUrl(String statusesUrl) {
            this.statusesUrl = statusesUrl;
        }

        public Head getHead() {
            return head;
        }

        public void setHead(Head head) {
            this.head = head;
        }

        public Base getBase() {
            return base;
        }

        public void setBase(Base base) {
            this.base = base;
        }

        public Links getLinks() {
            return links;
        }

        public void setLinks(Links links) {
            this.links = links;
        }

        public String getAuthorAssociation() {
            return authorAssociation;
        }

        public void setAuthorAssociation(String authorAssociation) {
            this.authorAssociation = authorAssociation;
        }

        public Object getActiveLockReason() {
            return activeLockReason;
        }

        public void setActiveLockReason(Object activeLockReason) {
            this.activeLockReason = activeLockReason;
        }

        public Boolean getMerged() {
            return merged;
        }

        public void setMerged(Boolean merged) {
            this.merged = merged;
        }

        public Object getMergeable() {
            return mergeable;
        }

        public void setMergeable(Object mergeable) {
            this.mergeable = mergeable;
        }

        public Object getRebaseable() {
            return rebaseable;
        }

        public void setRebaseable(Object rebaseable) {
            this.rebaseable = rebaseable;
        }

        public String getMergeableState() {
            return mergeableState;
        }

        public void setMergeableState(String mergeableState) {
            this.mergeableState = mergeableState;
        }

        public MergedBy getMergedBy() {
            return mergedBy;
        }

        public void setMergedBy(MergedBy mergedBy) {
            this.mergedBy = mergedBy;
        }

        public Integer getComments() {
            return comments;
        }

        public void setComments(Integer comments) {
            this.comments = comments;
        }

        public Integer getReviewComments() {
            return reviewComments;
        }

        public void setReviewComments(Integer reviewComments) {
            this.reviewComments = reviewComments;
        }

        public Boolean getMaintainerCanModify() {
            return maintainerCanModify;
        }

        public void setMaintainerCanModify(Boolean maintainerCanModify) {
            this.maintainerCanModify = maintainerCanModify;
        }

        public Integer getCommits() {
            return commits;
        }

        public void setCommits(Integer commits) {
            this.commits = commits;
        }

        public Integer getAdditions() {
            return additions;
        }

        public void setAdditions(Integer additions) {
            this.additions = additions;
        }

        public Integer getDeletions() {
            return deletions;
        }

        public void setDeletions(Integer deletions) {
            this.deletions = deletions;
        }

        public Integer getChangedFiles() {
            return changedFiles;
        }

        public void setChangedFiles(Integer changedFiles) {
            this.changedFiles = changedFiles;
        }

    }


    public class Repo {


        private Integer id;

        private String name;

        private String url;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Repo_ {


        private Integer id;

        private String nodeId;

        private String name;

        private String fullName;

        private Boolean _private;

        private Owner owner;

        private String htmlUrl;

        private Object description;

        private Boolean fork;

        private String url;

        private String forksUrl;

        private String keysUrl;

        private String collaboratorsUrl;

        private String teamsUrl;

        private String hooksUrl;

        private String issueEventsUrl;

        private String eventsUrl;

        private String assigneesUrl;

        private String branchesUrl;

        private String tagsUrl;

        private String blobsUrl;

        private String gitTagsUrl;

        private String gitRefsUrl;

        private String treesUrl;

        private String statusesUrl;

        private String languagesUrl;

        private String stargazersUrl;

        private String contributorsUrl;

        private String subscribersUrl;

        private String subscriptionUrl;

        private String commitsUrl;

        private String gitCommitsUrl;

        private String commentsUrl;

        private String issueCommentUrl;

        private String contentsUrl;

        private String compareUrl;

        private String mergesUrl;

        private String archiveUrl;

        private String downloadsUrl;

        private String issuesUrl;

        private String pullsUrl;

        private String milestonesUrl;

        private String notificationsUrl;

        private String labelsUrl;

        private String releasesUrl;

        private String deploymentsUrl;

        private String createdAt;

        private String updatedAt;

        private String pushedAt;

        private String gitUrl;

        private String sshUrl;

        private String cloneUrl;

        private String svnUrl;

        private Object homepage;

        private Integer size;

        private Integer stargazersCount;

        private Integer watchersCount;

        private String language;

        private Boolean hasIssues;

        private Boolean hasProjects;

        private Boolean hasDownloads;

        private Boolean hasWiki;

        private Boolean hasPages;

        private Integer forksCount;

        private Object mirrorUrl;

        private Boolean archived;

        private Boolean disabled;

        private Integer openIssuesCount;

        private Object license;

        private Integer forks;

        private Integer openIssues;

        private Integer watchers;

        private String defaultBranch;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Boolean getPrivate() {
            return _private;
        }

        public void setPrivate(Boolean _private) {
            this._private = _private;
        }

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            this.owner = owner;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Boolean getFork() {
            return fork;
        }

        public void setFork(Boolean fork) {
            this.fork = fork;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getForksUrl() {
            return forksUrl;
        }

        public void setForksUrl(String forksUrl) {
            this.forksUrl = forksUrl;
        }

        public String getKeysUrl() {
            return keysUrl;
        }

        public void setKeysUrl(String keysUrl) {
            this.keysUrl = keysUrl;
        }

        public String getCollaboratorsUrl() {
            return collaboratorsUrl;
        }

        public void setCollaboratorsUrl(String collaboratorsUrl) {
            this.collaboratorsUrl = collaboratorsUrl;
        }

        public String getTeamsUrl() {
            return teamsUrl;
        }

        public void setTeamsUrl(String teamsUrl) {
            this.teamsUrl = teamsUrl;
        }

        public String getHooksUrl() {
            return hooksUrl;
        }

        public void setHooksUrl(String hooksUrl) {
            this.hooksUrl = hooksUrl;
        }

        public String getIssueEventsUrl() {
            return issueEventsUrl;
        }

        public void setIssueEventsUrl(String issueEventsUrl) {
            this.issueEventsUrl = issueEventsUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getAssigneesUrl() {
            return assigneesUrl;
        }

        public void setAssigneesUrl(String assigneesUrl) {
            this.assigneesUrl = assigneesUrl;
        }

        public String getBranchesUrl() {
            return branchesUrl;
        }

        public void setBranchesUrl(String branchesUrl) {
            this.branchesUrl = branchesUrl;
        }

        public String getTagsUrl() {
            return tagsUrl;
        }

        public void setTagsUrl(String tagsUrl) {
            this.tagsUrl = tagsUrl;
        }

        public String getBlobsUrl() {
            return blobsUrl;
        }

        public void setBlobsUrl(String blobsUrl) {
            this.blobsUrl = blobsUrl;
        }

        public String getGitTagsUrl() {
            return gitTagsUrl;
        }

        public void setGitTagsUrl(String gitTagsUrl) {
            this.gitTagsUrl = gitTagsUrl;
        }

        public String getGitRefsUrl() {
            return gitRefsUrl;
        }

        public void setGitRefsUrl(String gitRefsUrl) {
            this.gitRefsUrl = gitRefsUrl;
        }

        public String getTreesUrl() {
            return treesUrl;
        }

        public void setTreesUrl(String treesUrl) {
            this.treesUrl = treesUrl;
        }

        public String getStatusesUrl() {
            return statusesUrl;
        }

        public void setStatusesUrl(String statusesUrl) {
            this.statusesUrl = statusesUrl;
        }

        public String getLanguagesUrl() {
            return languagesUrl;
        }

        public void setLanguagesUrl(String languagesUrl) {
            this.languagesUrl = languagesUrl;
        }

        public String getStargazersUrl() {
            return stargazersUrl;
        }

        public void setStargazersUrl(String stargazersUrl) {
            this.stargazersUrl = stargazersUrl;
        }

        public String getContributorsUrl() {
            return contributorsUrl;
        }

        public void setContributorsUrl(String contributorsUrl) {
            this.contributorsUrl = contributorsUrl;
        }

        public String getSubscribersUrl() {
            return subscribersUrl;
        }

        public void setSubscribersUrl(String subscribersUrl) {
            this.subscribersUrl = subscribersUrl;
        }

        public String getSubscriptionUrl() {
            return subscriptionUrl;
        }

        public void setSubscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
        }

        public String getCommitsUrl() {
            return commitsUrl;
        }

        public void setCommitsUrl(String commitsUrl) {
            this.commitsUrl = commitsUrl;
        }

        public String getGitCommitsUrl() {
            return gitCommitsUrl;
        }

        public void setGitCommitsUrl(String gitCommitsUrl) {
            this.gitCommitsUrl = gitCommitsUrl;
        }

        public String getCommentsUrl() {
            return commentsUrl;
        }

        public void setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
        }

        public String getIssueCommentUrl() {
            return issueCommentUrl;
        }

        public void setIssueCommentUrl(String issueCommentUrl) {
            this.issueCommentUrl = issueCommentUrl;
        }

        public String getContentsUrl() {
            return contentsUrl;
        }

        public void setContentsUrl(String contentsUrl) {
            this.contentsUrl = contentsUrl;
        }

        public String getCompareUrl() {
            return compareUrl;
        }

        public void setCompareUrl(String compareUrl) {
            this.compareUrl = compareUrl;
        }

        public String getMergesUrl() {
            return mergesUrl;
        }

        public void setMergesUrl(String mergesUrl) {
            this.mergesUrl = mergesUrl;
        }

        public String getArchiveUrl() {
            return archiveUrl;
        }

        public void setArchiveUrl(String archiveUrl) {
            this.archiveUrl = archiveUrl;
        }

        public String getDownloadsUrl() {
            return downloadsUrl;
        }

        public void setDownloadsUrl(String downloadsUrl) {
            this.downloadsUrl = downloadsUrl;
        }

        public String getIssuesUrl() {
            return issuesUrl;
        }

        public void setIssuesUrl(String issuesUrl) {
            this.issuesUrl = issuesUrl;
        }

        public String getPullsUrl() {
            return pullsUrl;
        }

        public void setPullsUrl(String pullsUrl) {
            this.pullsUrl = pullsUrl;
        }

        public String getMilestonesUrl() {
            return milestonesUrl;
        }

        public void setMilestonesUrl(String milestonesUrl) {
            this.milestonesUrl = milestonesUrl;
        }

        public String getNotificationsUrl() {
            return notificationsUrl;
        }

        public void setNotificationsUrl(String notificationsUrl) {
            this.notificationsUrl = notificationsUrl;
        }

        public String getLabelsUrl() {
            return labelsUrl;
        }

        public void setLabelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
        }

        public String getReleasesUrl() {
            return releasesUrl;
        }

        public void setReleasesUrl(String releasesUrl) {
            this.releasesUrl = releasesUrl;
        }

        public String getDeploymentsUrl() {
            return deploymentsUrl;
        }

        public void setDeploymentsUrl(String deploymentsUrl) {
            this.deploymentsUrl = deploymentsUrl;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getPushedAt() {
            return pushedAt;
        }

        public void setPushedAt(String pushedAt) {
            this.pushedAt = pushedAt;
        }

        public String getGitUrl() {
            return gitUrl;
        }

        public void setGitUrl(String gitUrl) {
            this.gitUrl = gitUrl;
        }

        public String getSshUrl() {
            return sshUrl;
        }

        public void setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
        }

        public String getCloneUrl() {
            return cloneUrl;
        }

        public void setCloneUrl(String cloneUrl) {
            this.cloneUrl = cloneUrl;
        }

        public String getSvnUrl() {
            return svnUrl;
        }

        public void setSvnUrl(String svnUrl) {
            this.svnUrl = svnUrl;
        }

        public Object getHomepage() {
            return homepage;
        }

        public void setHomepage(Object homepage) {
            this.homepage = homepage;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getStargazersCount() {
            return stargazersCount;
        }

        public void setStargazersCount(Integer stargazersCount) {
            this.stargazersCount = stargazersCount;
        }

        public Integer getWatchersCount() {
            return watchersCount;
        }

        public void setWatchersCount(Integer watchersCount) {
            this.watchersCount = watchersCount;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public Boolean getHasIssues() {
            return hasIssues;
        }

        public void setHasIssues(Boolean hasIssues) {
            this.hasIssues = hasIssues;
        }

        public Boolean getHasProjects() {
            return hasProjects;
        }

        public void setHasProjects(Boolean hasProjects) {
            this.hasProjects = hasProjects;
        }

        public Boolean getHasDownloads() {
            return hasDownloads;
        }

        public void setHasDownloads(Boolean hasDownloads) {
            this.hasDownloads = hasDownloads;
        }

        public Boolean getHasWiki() {
            return hasWiki;
        }

        public void setHasWiki(Boolean hasWiki) {
            this.hasWiki = hasWiki;
        }

        public Boolean getHasPages() {
            return hasPages;
        }

        public void setHasPages(Boolean hasPages) {
            this.hasPages = hasPages;
        }

        public Integer getForksCount() {
            return forksCount;
        }

        public void setForksCount(Integer forksCount) {
            this.forksCount = forksCount;
        }

        public Object getMirrorUrl() {
            return mirrorUrl;
        }

        public void setMirrorUrl(Object mirrorUrl) {
            this.mirrorUrl = mirrorUrl;
        }

        public Boolean getArchived() {
            return archived;
        }

        public void setArchived(Boolean archived) {
            this.archived = archived;
        }

        public Boolean getDisabled() {
            return disabled;
        }

        public void setDisabled(Boolean disabled) {
            this.disabled = disabled;
        }

        public Integer getOpenIssuesCount() {
            return openIssuesCount;
        }

        public void setOpenIssuesCount(Integer openIssuesCount) {
            this.openIssuesCount = openIssuesCount;
        }

        public Object getLicense() {
            return license;
        }

        public void setLicense(Object license) {
            this.license = license;
        }

        public Integer getForks() {
            return forks;
        }

        public void setForks(Integer forks) {
            this.forks = forks;
        }

        public Integer getOpenIssues() {
            return openIssues;
        }

        public void setOpenIssues(Integer openIssues) {
            this.openIssues = openIssues;
        }

        public Integer getWatchers() {
            return watchers;
        }

        public void setWatchers(Integer watchers) {
            this.watchers = watchers;
        }

        public String getDefaultBranch() {
            return defaultBranch;
        }

        public void setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
        }

    }

    public class Repo__ {

        private Integer id;

        private String nodeId;

        private String name;

        private String fullName;

        private Boolean _private;

        private Owner_ owner;

        private String htmlUrl;

        private Object description;

        private Boolean fork;

        private String url;

        private String forksUrl;

        private String keysUrl;

        private String collaboratorsUrl;

        private String teamsUrl;

        private String hooksUrl;

        private String issueEventsUrl;

        private String eventsUrl;

        private String assigneesUrl;

        private String branchesUrl;

        private String tagsUrl;

        private String blobsUrl;

        private String gitTagsUrl;

        private String gitRefsUrl;

        private String treesUrl;

        private String statusesUrl;

        private String languagesUrl;

        private String stargazersUrl;

        private String contributorsUrl;

        private String subscribersUrl;

        private String subscriptionUrl;

        private String commitsUrl;

        private String gitCommitsUrl;

        private String commentsUrl;

        private String issueCommentUrl;

        private String contentsUrl;

        private String compareUrl;

        private String mergesUrl;

        private String archiveUrl;

        private String downloadsUrl;

        private String issuesUrl;

        private String pullsUrl;

        private String milestonesUrl;

        private String notificationsUrl;

        private String labelsUrl;

        private String releasesUrl;

        private String deploymentsUrl;

        private String createdAt;

        private String updatedAt;

        private String pushedAt;

        private String gitUrl;

        private String sshUrl;

        private String cloneUrl;

        private String svnUrl;

        private Object homepage;

        private Integer size;

        private Integer stargazersCount;

        private Integer watchersCount;

        private String language;

        private Boolean hasIssues;

        private Boolean hasProjects;

        private Boolean hasDownloads;

        private Boolean hasWiki;

        private Boolean hasPages;

        private Integer forksCount;

        private Object mirrorUrl;

        private Boolean archived;

        private Boolean disabled;

        private Integer openIssuesCount;

        private Object license;

        private Integer forks;

        private Integer openIssues;

        private Integer watchers;

        private String defaultBranch;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Boolean getPrivate() {
            return _private;
        }

        public void setPrivate(Boolean _private) {
            this._private = _private;
        }

        public Owner_ getOwner() {
            return owner;
        }

        public void setOwner(Owner_ owner) {
            this.owner = owner;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Boolean getFork() {
            return fork;
        }

        public void setFork(Boolean fork) {
            this.fork = fork;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getForksUrl() {
            return forksUrl;
        }

        public void setForksUrl(String forksUrl) {
            this.forksUrl = forksUrl;
        }

        public String getKeysUrl() {
            return keysUrl;
        }

        public void setKeysUrl(String keysUrl) {
            this.keysUrl = keysUrl;
        }

        public String getCollaboratorsUrl() {
            return collaboratorsUrl;
        }

        public void setCollaboratorsUrl(String collaboratorsUrl) {
            this.collaboratorsUrl = collaboratorsUrl;
        }

        public String getTeamsUrl() {
            return teamsUrl;
        }

        public void setTeamsUrl(String teamsUrl) {
            this.teamsUrl = teamsUrl;
        }

        public String getHooksUrl() {
            return hooksUrl;
        }

        public void setHooksUrl(String hooksUrl) {
            this.hooksUrl = hooksUrl;
        }

        public String getIssueEventsUrl() {
            return issueEventsUrl;
        }

        public void setIssueEventsUrl(String issueEventsUrl) {
            this.issueEventsUrl = issueEventsUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getAssigneesUrl() {
            return assigneesUrl;
        }

        public void setAssigneesUrl(String assigneesUrl) {
            this.assigneesUrl = assigneesUrl;
        }

        public String getBranchesUrl() {
            return branchesUrl;
        }

        public void setBranchesUrl(String branchesUrl) {
            this.branchesUrl = branchesUrl;
        }

        public String getTagsUrl() {
            return tagsUrl;
        }

        public void setTagsUrl(String tagsUrl) {
            this.tagsUrl = tagsUrl;
        }

        public String getBlobsUrl() {
            return blobsUrl;
        }

        public void setBlobsUrl(String blobsUrl) {
            this.blobsUrl = blobsUrl;
        }

        public String getGitTagsUrl() {
            return gitTagsUrl;
        }

        public void setGitTagsUrl(String gitTagsUrl) {
            this.gitTagsUrl = gitTagsUrl;
        }

        public String getGitRefsUrl() {
            return gitRefsUrl;
        }

        public void setGitRefsUrl(String gitRefsUrl) {
            this.gitRefsUrl = gitRefsUrl;
        }

        public String getTreesUrl() {
            return treesUrl;
        }

        public void setTreesUrl(String treesUrl) {
            this.treesUrl = treesUrl;
        }

        public String getStatusesUrl() {
            return statusesUrl;
        }

        public void setStatusesUrl(String statusesUrl) {
            this.statusesUrl = statusesUrl;
        }

        public String getLanguagesUrl() {
            return languagesUrl;
        }

        public void setLanguagesUrl(String languagesUrl) {
            this.languagesUrl = languagesUrl;
        }

        public String getStargazersUrl() {
            return stargazersUrl;
        }

        public void setStargazersUrl(String stargazersUrl) {
            this.stargazersUrl = stargazersUrl;
        }

        public String getContributorsUrl() {
            return contributorsUrl;
        }

        public void setContributorsUrl(String contributorsUrl) {
            this.contributorsUrl = contributorsUrl;
        }

        public String getSubscribersUrl() {
            return subscribersUrl;
        }

        public void setSubscribersUrl(String subscribersUrl) {
            this.subscribersUrl = subscribersUrl;
        }

        public String getSubscriptionUrl() {
            return subscriptionUrl;
        }

        public void setSubscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
        }

        public String getCommitsUrl() {
            return commitsUrl;
        }

        public void setCommitsUrl(String commitsUrl) {
            this.commitsUrl = commitsUrl;
        }

        public String getGitCommitsUrl() {
            return gitCommitsUrl;
        }

        public void setGitCommitsUrl(String gitCommitsUrl) {
            this.gitCommitsUrl = gitCommitsUrl;
        }

        public String getCommentsUrl() {
            return commentsUrl;
        }

        public void setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
        }

        public String getIssueCommentUrl() {
            return issueCommentUrl;
        }

        public void setIssueCommentUrl(String issueCommentUrl) {
            this.issueCommentUrl = issueCommentUrl;
        }

        public String getContentsUrl() {
            return contentsUrl;
        }

        public void setContentsUrl(String contentsUrl) {
            this.contentsUrl = contentsUrl;
        }

        public String getCompareUrl() {
            return compareUrl;
        }

        public void setCompareUrl(String compareUrl) {
            this.compareUrl = compareUrl;
        }

        public String getMergesUrl() {
            return mergesUrl;
        }

        public void setMergesUrl(String mergesUrl) {
            this.mergesUrl = mergesUrl;
        }

        public String getArchiveUrl() {
            return archiveUrl;
        }

        public void setArchiveUrl(String archiveUrl) {
            this.archiveUrl = archiveUrl;
        }

        public String getDownloadsUrl() {
            return downloadsUrl;
        }

        public void setDownloadsUrl(String downloadsUrl) {
            this.downloadsUrl = downloadsUrl;
        }

        public String getIssuesUrl() {
            return issuesUrl;
        }

        public void setIssuesUrl(String issuesUrl) {
            this.issuesUrl = issuesUrl;
        }

        public String getPullsUrl() {
            return pullsUrl;
        }

        public void setPullsUrl(String pullsUrl) {
            this.pullsUrl = pullsUrl;
        }

        public String getMilestonesUrl() {
            return milestonesUrl;
        }

        public void setMilestonesUrl(String milestonesUrl) {
            this.milestonesUrl = milestonesUrl;
        }

        public String getNotificationsUrl() {
            return notificationsUrl;
        }

        public void setNotificationsUrl(String notificationsUrl) {
            this.notificationsUrl = notificationsUrl;
        }

        public String getLabelsUrl() {
            return labelsUrl;
        }

        public void setLabelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
        }

        public String getReleasesUrl() {
            return releasesUrl;
        }

        public void setReleasesUrl(String releasesUrl) {
            this.releasesUrl = releasesUrl;
        }

        public String getDeploymentsUrl() {
            return deploymentsUrl;
        }

        public void setDeploymentsUrl(String deploymentsUrl) {
            this.deploymentsUrl = deploymentsUrl;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getPushedAt() {
            return pushedAt;
        }

        public void setPushedAt(String pushedAt) {
            this.pushedAt = pushedAt;
        }

        public String getGitUrl() {
            return gitUrl;
        }

        public void setGitUrl(String gitUrl) {
            this.gitUrl = gitUrl;
        }

        public String getSshUrl() {
            return sshUrl;
        }

        public void setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
        }

        public String getCloneUrl() {
            return cloneUrl;
        }

        public void setCloneUrl(String cloneUrl) {
            this.cloneUrl = cloneUrl;
        }

        public String getSvnUrl() {
            return svnUrl;
        }

        public void setSvnUrl(String svnUrl) {
            this.svnUrl = svnUrl;
        }

        public Object getHomepage() {
            return homepage;
        }

        public void setHomepage(Object homepage) {
            this.homepage = homepage;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getStargazersCount() {
            return stargazersCount;
        }

        public void setStargazersCount(Integer stargazersCount) {
            this.stargazersCount = stargazersCount;
        }

        public Integer getWatchersCount() {
            return watchersCount;
        }

        public void setWatchersCount(Integer watchersCount) {
            this.watchersCount = watchersCount;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public Boolean getHasIssues() {
            return hasIssues;
        }

        public void setHasIssues(Boolean hasIssues) {
            this.hasIssues = hasIssues;
        }

        public Boolean getHasProjects() {
            return hasProjects;
        }

        public void setHasProjects(Boolean hasProjects) {
            this.hasProjects = hasProjects;
        }

        public Boolean getHasDownloads() {
            return hasDownloads;
        }

        public void setHasDownloads(Boolean hasDownloads) {
            this.hasDownloads = hasDownloads;
        }

        public Boolean getHasWiki() {
            return hasWiki;
        }

        public void setHasWiki(Boolean hasWiki) {
            this.hasWiki = hasWiki;
        }

        public Boolean getHasPages() {
            return hasPages;
        }

        public void setHasPages(Boolean hasPages) {
            this.hasPages = hasPages;
        }

        public Integer getForksCount() {
            return forksCount;
        }

        public void setForksCount(Integer forksCount) {
            this.forksCount = forksCount;
        }

        public Object getMirrorUrl() {
            return mirrorUrl;
        }

        public void setMirrorUrl(Object mirrorUrl) {
            this.mirrorUrl = mirrorUrl;
        }

        public Boolean getArchived() {
            return archived;
        }

        public void setArchived(Boolean archived) {
            this.archived = archived;
        }

        public Boolean getDisabled() {
            return disabled;
        }

        public void setDisabled(Boolean disabled) {
            this.disabled = disabled;
        }

        public Integer getOpenIssuesCount() {
            return openIssuesCount;
        }

        public void setOpenIssuesCount(Integer openIssuesCount) {
            this.openIssuesCount = openIssuesCount;
        }

        public Object getLicense() {
            return license;
        }

        public void setLicense(Object license) {
            this.license = license;
        }

        public Integer getForks() {
            return forks;
        }

        public void setForks(Integer forks) {
            this.forks = forks;
        }

        public Integer getOpenIssues() {
            return openIssues;
        }

        public void setOpenIssues(Integer openIssues) {
            this.openIssues = openIssues;
        }

        public Integer getWatchers() {
            return watchers;
        }

        public void setWatchers(Integer watchers) {
            this.watchers = watchers;
        }

        public String getDefaultBranch() {
            return defaultBranch;
        }

        public void setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
        }

    }

    public class ReviewComment {


        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class ReviewComments {


        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Self {


        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Statuses {


        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class User {


        private String login;

        private Integer id;

        private String nodeId;

        private String avatarUrl;

        private String gravatarId;

        private String url;

        private String htmlUrl;

        private String followersUrl;

        private String followingUrl;

        private String gistsUrl;

        private String starredUrl;

        private String subscriptionsUrl;

        private String organizationsUrl;

        private String reposUrl;

        private String eventsUrl;

        private String receivedEventsUrl;

        private String type;

        private Boolean siteAdmin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

    }


    public class User_ {


        private String login;

        private Integer id;

        private String nodeId;

        private String avatarUrl;

        private String gravatarId;

        private String url;

        private String htmlUrl;

        private String followersUrl;

        private String followingUrl;

        private String gistsUrl;

        private String starredUrl;

        private String subscriptionsUrl;

        private String organizationsUrl;

        private String reposUrl;

        private String eventsUrl;

        private String receivedEventsUrl;

        private String type;

        private Boolean siteAdmin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

    }


    public class User__ {


        private String login;

        private Integer id;

        private String nodeId;

        private String avatarUrl;

        private String gravatarId;

        private String url;

        private String htmlUrl;

        private String followersUrl;

        private String followingUrl;

        private String gistsUrl;

        private String starredUrl;

        private String subscriptionsUrl;

        private String organizationsUrl;

        private String reposUrl;

        private String eventsUrl;

        private String receivedEventsUrl;

        private String type;

        private Boolean siteAdmin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

    }

}
