package com.ss.android.ugc.aweme.services.superentrance;

import X.C1440005kM;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class SuperEntranceEvent implements IEvent {
    public static final Companion Companion = new Companion();
    public String effectId;
    public String effectSceneAwemeId;
    public String iconUrl;
    public boolean show;
    public String tab;
    public int type;

    public static final class Companion {
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectSceneAwemeId() {
        return this.effectSceneAwemeId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final String getTab() {
        return this.tab;
    }

    public final int getType() {
        return this.type;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setEffectSceneAwemeId(String str) {
        this.effectSceneAwemeId = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setTab(String str) {
        this.tab = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public SuperEntranceEvent(int i, boolean z) {
        this.type = i;
        this.show = z;
    }
}
