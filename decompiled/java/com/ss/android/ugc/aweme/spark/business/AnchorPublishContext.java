package com.ss.android.ugc.aweme.spark.business;

import X.C09JN;
import X.C1066080dqg;
import X.C11NJ;
import X.C11NZ;
import X.C11WM;
import X.C11WP;
import X.C11WS;
import X.C1440005kM;
import X.C1701940uOG;
import X.C1799610wvn;
import X.C19326610jI;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C356901a3;
import X.C786410Ut5;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS163S0100000_29;
import Y.AfS198S0100000_29;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.wiki.CheckAnchorModerationResultResponse;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorPublishContext extends AnchorCommonContext<C11WP> {
    public ListenableFuture<CheckAnchorModerationResultResponse> LLJ;
    public final C11NJ LLJI;

    @Override // com.ss.android.ugc.aweme.spark.business.AnchorCommonContext, com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext, com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext
    public final C11WS LIZIZ() {
        return new C11WP();
    }

    public final void LJIIL() {
        String strLIZ;
        Boolean boolValueOf;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = ((C11WM) this.LLILLJJLI).LJIILIIL.get("placeholder_enter_from");
        c2344009Gk.LJIIIIZZ("enter_from", (str == null || str.length() == 0) ? "video_post_page" : ((C11WM) this.LLILLJJLI).LJIILIIL.get("placeholder_enter_from"));
        String str2 = ((C11WM) this.LLILLJJLI).LJIILIIL.get("shoot_way");
        if (str2 != null && str2.length() != 0) {
            c2344009Gk.LJFF("shoot_way", str2);
        }
        String str3 = ((C11WM) this.LLILLJJLI).LJIILIIL.get("creation_id");
        if (str3 != null && str3.length() != 0) {
            c2344009Gk.LJFF("creation_id", str3);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("add_from", 2);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C19326610jI.LIZ(this.LL);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ == null || (strLIZ = C1066080dqg.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ)) == null) {
            strLIZ = ((C11WM) this.LLILLJJLI).LIZIZ;
        }
        String str4 = ((C11WM) this.LLILLJJLI).LIZJ;
        C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(((C11WM) this.LLILLJJLI).LJ, C786410Ut5.J3(jSONObject), str4, "", 1, "", null, true, strLIZ, "", Long.MAX_VALUE, "", ((C11WM) this.LLILLJJLI).LJFF, true, null, null, null, null, 0, -1, null, null)));
        C19EG c19eg = this.LLILLL;
        if (c19eg != null) {
            c19eg.finish();
        }
        AnchorListManager anchorListManager = AnchorListManager.LIZ;
        C11WM c11wm = (C11WM) this.LLILLJJLI;
        int i = c11wm.LJ;
        String str5 = c11wm.LJFF;
        anchorListManager.getClass();
        AnchorPublishStruct anchorPublishStructLJFF = AnchorListManager.LJFF(i, str5);
        c2344009Gk.LJIIIIZZ("anchor_type", anchorPublishStructLJFF != null ? AnchorListManager.LJIIIIZZ(anchorPublishStructLJFF) : null);
        c2344009Gk.LJIIIIZZ("anchor_entry", str4);
        C11WM c11wm2 = (C11WM) this.LLILLJJLI;
        int i2 = c11wm2.LJ;
        String str6 = c11wm2.LJFF;
        anchorListManager.getClass();
        AnchorPublishStruct anchorPublishStructLJFF2 = AnchorListManager.LJFF(i2, str6);
        c2344009Gk.LJIIIIZZ("new_tag", (anchorPublishStructLJFF2 == null || (boolValueOf = Boolean.valueOf(anchorPublishStructLJFF2.hadNew)) == null || !boolValueOf.booleanValue()) ? CardStruct.IStatusCode.DEFAULT : "1");
        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
    }

    public AnchorPublishContext(SparkContext sparkContext) {
        super(sparkContext);
        this.LLJI = new C11NJ();
    }

    @Override // com.ss.android.ugc.aweme.spark.business.AnchorCommonContext, com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext
    public final void LJ(View view) {
        String str = ((C11WM) this.LLILLJJLI).LIZIZ;
        int i = 0;
        if (str != null && str.length() != 0) {
            Uri uriBuild = UriProtector.parse(((C11WM) this.LLILLJJLI).LIZIZ).buildUpon().build();
            super.LJ(view);
            View viewFindViewById = view.findViewById(R.id.emz);
            this.LLIZ = viewFindViewById;
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 108), viewFindViewById);
            boolean zLJIJI = u.LJIJI(LJII(uriBuild, "hide_nav_bar"), "1", true);
            boolean zLJIJI2 = u.LJIJI(LJII(uriBuild, "addButton"), "true", true);
            View view2 = this.LLIZ;
            if (view2 != null) {
                if (!zLJIJI2 || zLJIJI) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }
        }
    }

    public final void LJIIJJI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_type", ((C11WM) this.LLILLJJLI).LJI);
        c2344009Gk.LJIIIIZZ("anchor_entry", ((C11WM) this.LLILLJJLI).LJIIL);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
        this.LLJI.dispose();
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLJI.LJ();
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLJI.LIZ(C11NZ.LJJJJLI(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(this, 10), new C09JN() { // from class: X.0uNW
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AnchorPublishContext@8f80.onResume$subscribe$2");
                C1C7U.LIZIZ("AnchorPublishContext@8f80.onResume$subscribe$2");
            }
        }));
    }
}
