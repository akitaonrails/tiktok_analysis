package com.ss.android.ugc.aweme.im.b2c.actionbar;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ActionBarButtonConfBusiness {
    public static final int $stable = 0;

    @C09CT("action_schema")
    public final String actionSchema;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String businessBtnId;

    @C09CT("event_tracking_extra")
    public final String eventTrackingExt;

    @C09CT("icon")
    public final String icon;

    @C09CT("title")
    public final String title;

    public ActionBarButtonConfBusiness() {
        this(null, null, null, null, null);
    }

    public final ActionBarButtonConfBusiness copy(String str, String str2, String str3, String str4, String str5) {
        return new ActionBarButtonConfBusiness(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarButtonConfBusiness)) {
            return false;
        }
        ActionBarButtonConfBusiness actionBarButtonConfBusiness = (ActionBarButtonConfBusiness) obj;
        return Intrinsics.LJFF(this.businessBtnId, actionBarButtonConfBusiness.businessBtnId) && Intrinsics.LJFF(this.actionSchema, actionBarButtonConfBusiness.actionSchema) && Intrinsics.LJFF(this.title, actionBarButtonConfBusiness.title) && Intrinsics.LJFF(this.icon, actionBarButtonConfBusiness.icon) && Intrinsics.LJFF(this.eventTrackingExt, actionBarButtonConfBusiness.eventTrackingExt);
    }

    public ActionBarButtonConfBusiness(String str, String str2, String str3, String str4, String str5) {
        this.businessBtnId = str;
        this.actionSchema = str2;
        this.title = str3;
        this.icon = str4;
        this.eventTrackingExt = str5;
    }
}
