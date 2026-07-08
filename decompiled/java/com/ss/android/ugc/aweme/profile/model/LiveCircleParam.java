package com.ss.android.ugc.aweme.profile.model;

import X.C1610760s1C;
import android.view.View;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveCircleParam {
    public C1610760s1C animationController;
    public View avatarView;
    public boolean forceSkipLive;
    public int liveCircleViewType;
    public boolean needLiveBreathAnim;
    public User user;
    public String enterFromMerge = "";
    public String enterMethod = "";
    public int sceneType = -1;
    public int followListOrder = -1;
    public String sortStatus = "";

    public static final class LiveCircleBuilder {
        public final LiveCircleParam param = new LiveCircleParam();

        public final LiveCircleParam build() {
            return this.param;
        }

        public final LiveCircleParam getParam() {
            return this.param;
        }

        public final LiveCircleBuilder setAnimationController(C1610760s1C c1610760s1C) {
            this.param.animationController = c1610760s1C;
            return this;
        }

        public final LiveCircleBuilder setAvatarView(View view) {
            this.param.avatarView = view;
            return this;
        }

        public final LiveCircleBuilder setCircleViewType(int i) {
            this.param.liveCircleViewType = i;
            return this;
        }

        public final LiveCircleBuilder setEnterFromMerge(String str) {
            this.param.setEnterFromMerge(str);
            return this;
        }

        public final LiveCircleBuilder setEnterMethod(String str) {
            this.param.setEnterMethod(str);
            return this;
        }

        public final LiveCircleBuilder setFollowListOrder(int i) {
            this.param.followListOrder = i;
            return this;
        }

        public final LiveCircleBuilder setForceSkipLive(boolean z) {
            this.param.forceSkipLive = z;
            return this;
        }

        public final LiveCircleBuilder setNeedLiveBreathAnim(boolean z) {
            this.param.needLiveBreathAnim = z;
            return this;
        }

        public final LiveCircleBuilder setSceneType(int i) {
            this.param.sceneType = i;
            return this;
        }

        public final LiveCircleBuilder setSortStatus(String str) {
            this.param.setSortStatus(str);
            return this;
        }

        public final LiveCircleBuilder setUser(User user) {
            this.param.user = user;
            return this;
        }
    }

    public final C1610760s1C getAnimationController() {
        return this.animationController;
    }

    public final View getAvatarView() {
        return this.avatarView;
    }

    public final String getEnterFromMerge() {
        return this.enterFromMerge;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final int getFollowListOrder() {
        return this.followListOrder;
    }

    public final boolean getForceSkipLive() {
        return this.forceSkipLive;
    }

    public final int getLiveCircleViewType() {
        return this.liveCircleViewType;
    }

    public final boolean getNeedLiveBreathAnim() {
        return this.needLiveBreathAnim;
    }

    public final int getSceneType() {
        return this.sceneType;
    }

    public final String getSortStatus() {
        return this.sortStatus;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setAnimationController(C1610760s1C c1610760s1C) {
        this.animationController = c1610760s1C;
    }

    public final void setAvatarView(View view) {
        this.avatarView = view;
    }

    public final void setEnterFromMerge(String str) {
        this.enterFromMerge = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFollowListOrder(int i) {
        this.followListOrder = i;
    }

    public final void setForceSkipLive(boolean z) {
        this.forceSkipLive = z;
    }

    public final void setLiveCircleViewType(int i) {
        this.liveCircleViewType = i;
    }

    public final void setNeedLiveBreathAnim(boolean z) {
        this.needLiveBreathAnim = z;
    }

    public final void setSceneType(int i) {
        this.sceneType = i;
    }

    public final void setSortStatus(String str) {
        this.sortStatus = str;
    }

    public final void setUser(User user) {
        this.user = user;
    }
}
