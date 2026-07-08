package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DuetModel implements Serializable {

    @C09CT("can_shoot")
    public Boolean canShoot = Boolean.TRUE;

    @C09CT("cid")
    public String cid;

    @C09CT("duet_awemes")
    public List<? extends Aweme> duetAwemes;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("shoot_way")
    public String shootWay;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("task_id")
    public String taskId;

    public final Boolean getCanShoot() {
        return this.canShoot;
    }

    public final String getCid() {
        return this.cid;
    }

    public final List<Aweme> getDuetAwemes() {
        return this.duetAwemes;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final void setCanShoot(Boolean bool) {
        this.canShoot = bool;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setDuetAwemes(List<? extends Aweme> list) {
        this.duetAwemes = list;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }
}
