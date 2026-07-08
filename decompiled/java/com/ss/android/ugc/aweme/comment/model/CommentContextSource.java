package com.ss.android.ugc.aweme.comment.model;

import X.EnumC1342450l2R;
import X.InterfaceC2753014t;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentContextSource implements InterfaceC2753014t, Serializable {
    public boolean awemeAuthorChanged;
    public boolean commentForceRefresh;
    public boolean isRefactorTitlePanel;
    public boolean isSplitMode;
    public CommentCommonModel commonModel = new CommentCommonModel(null, null, null, null, null, null, null, false, null, null, null, null, 0, null, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, null, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, "", null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false);
    public CommentEventModel eventModel = new CommentEventModel("", "", "", "", "", "", "", "", "", "", "", "", 0, 0, 0.0f, 0, 0, false, "", "", false, 0, false, "", "", "", false, "", 5, "", 0, "", "", "", "", "", 0, null, null, new ArrayList());
    public CommentListModel listModel = new CommentListModel();
    public CommentKeyboardModel keyboardModel = new CommentKeyboardModel();
    public CommentStaticModel staticModel = new CommentStaticModel();
    public String actionFromPage = "";
    public EnumC1342450l2R currSortType = EnumC1342450l2R.DEFAULT_SORT;

    public String getSourceId() {
        return "comment_top_source";
    }

    public final String getActionFromPage() {
        return this.actionFromPage;
    }

    public final boolean getAwemeAuthorChanged() {
        return this.awemeAuthorChanged;
    }

    public final boolean getCommentForceRefresh() {
        return this.commentForceRefresh;
    }

    public final CommentCommonModel getCommonModel() {
        return this.commonModel;
    }

    public final EnumC1342450l2R getCurrSortType() {
        return this.currSortType;
    }

    public final CommentEventModel getEventModel() {
        return this.eventModel;
    }

    public final CommentKeyboardModel getKeyboardModel() {
        return this.keyboardModel;
    }

    public final CommentListModel getListModel() {
        return this.listModel;
    }

    public final CommentStaticModel getStaticModel() {
        return this.staticModel;
    }

    public final boolean isRefactorTitlePanel() {
        return this.isRefactorTitlePanel;
    }

    public final boolean isSplitMode() {
        return this.isSplitMode;
    }

    public final void initKeyboardModel(CommentKeyboardModel commentKeyboardModel) {
        this.keyboardModel = commentKeyboardModel;
    }

    public final void innerRefreshCommentStatus(boolean z) {
        CommentCommonModel commentCommonModel = this.commonModel;
        if (z != commentCommonModel.commentClose) {
            commentCommonModel.setCommentClose(true);
            this.commentForceRefresh = true;
        }
    }

    public final void setActionFromPage(String str) {
        this.actionFromPage = str;
    }

    public final void setAwemeAuthorChanged(boolean z) {
        this.awemeAuthorChanged = z;
    }

    public final void setCommentForceRefresh(boolean z) {
        this.commentForceRefresh = z;
    }

    public final void setCommonModel(CommentCommonModel commentCommonModel) {
        this.commonModel = commentCommonModel;
    }

    public final void setCurrSortType(EnumC1342450l2R enumC1342450l2R) {
        this.currSortType = enumC1342450l2R;
    }

    public final void setEventModel(CommentEventModel commentEventModel) {
        this.eventModel = commentEventModel;
    }

    public final void setKeyboardModel(CommentKeyboardModel commentKeyboardModel) {
        this.keyboardModel = commentKeyboardModel;
    }

    public final void setListModel(CommentListModel commentListModel) {
        this.listModel = commentListModel;
    }

    public final void setRefactorTitlePanel(boolean z) {
        this.isRefactorTitlePanel = z;
    }

    public final void setSplitMode(boolean z) {
        this.isSplitMode = z;
    }

    public final void setStaticModel(CommentStaticModel commentStaticModel) {
        this.staticModel = commentStaticModel;
    }
}
