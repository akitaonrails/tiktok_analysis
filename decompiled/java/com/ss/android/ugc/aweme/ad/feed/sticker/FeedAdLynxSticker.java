package com.ss.android.ugc.aweme.ad.feed.sticker;

import X.AbstractC1024610cln;
import X.AbstractC999780c7k;
import X.C1000080c8E;
import X.C1000120c8I;
import X.C1001410cAN;
import X.C1001420cAO;
import X.C1022030chd;
import X.C1022820ciu;
import X.C1029690ctz;
import X.C14EU;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2344009Gk;
import X.C582020MsC;
import X.C824370WVn;
import X.C824380WVo;
import X.C988590bph;
import X.C999590c7R;
import X.C999880c7u;
import X.C999890c7v;
import X.EnumC1001380cAK;
import X.EnumC599900Nfw;
import X.InterfaceC1000280c8Y;
import X.InterfaceC1008930cMV;
import X.InterfaceC1541990qEH;
import X.InterfaceC999480c7G;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView;
import com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdLynxSticker extends AbstractFeedLynxView {
    public final String LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public final InterfaceC999480c7G LLJJIII;
    public AdStickerData LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;

    public final void LJIIIIZZ() {
        this.LLJI = false;
        this.LLJJJ = -1;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final n LIZLLL() {
        Aweme aweme = this.LLILZ;
        n nVarLIZ = C999590c7R.LIZ(this.LL.getContext(), aweme);
        C999890c7v.LIZ(aweme, nVarLIZ);
        return nVarLIZ;
    }

    public final Bundle LJ() {
        Aweme aweme = this.LLILZ;
        Context context = this.LL.getContext();
        Bundle bundle = new Bundle();
        InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
        if (interfaceC1000280c8YLIZ != null) {
            interfaceC1000280c8YLIZ.LJIJJ(context, bundle, aweme);
        }
        return bundle;
    }

    public final void LJFF() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "is_successful");
        c2344009Gk.LIZJ(0, "is_ever_failed");
        c2344009Gk.LJIIIIZZ("is_spark", "1");
        c2344009Gk.LIZJ(1, "failed_reason");
        C20684815ws.LJIILLIIL("feed_lynx_sticker_preload_usage", c2344009Gk.LIZ);
    }

    public final void LJII() {
        IFeedService iFeedServiceLIZIZ;
        C824370WVn.LIZ(null, "ad_lynx_sticker_show_success", null, this.LLJJ, Boolean.valueOf(this.LLJJIJIL), Boolean.valueOf(this.LLJJIJIIJIL), Boolean.valueOf(this.LLJI));
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", this.LLILZIL);
        c1022820ciuLIZLLL.LIZJ("sticker", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(((C1000080c8E) this.LLILLJJLI).LLJILJIL + 1), "play_order");
        C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
        c1022820ciuLIZLLL.LIZIZ(c1001410cAN.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT, "use_idle_preload");
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = null;
        if (c1001410cAN.LIZIZ()) {
            Aweme aweme = this.LLILZ;
            C1001420cAO c1001420cAOLJIIIIZZ = c1001410cAN.LJIIIIZZ(aweme != null ? aweme.getAid() : null, EnumC1001380cAK.STICKER_OPERATION, EnumC599900Nfw.FEED);
            c1022820ciuLIZLLL.LIZIZ((c1001420cAOLJIIIIZZ == null || !c1001420cAOLJIIIIZZ.LIZ()) ? CardStruct.IStatusCode.DEFAULT : "1", "idle_preload_status");
        }
        c1022820ciuLIZLLL.LJII();
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null) {
            interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(this.LL.getContext(), this.LLILZ, this.LLJILLL, true);
        }
        View view = this.LLJILJIL;
        if (interfaceC1008930cMVLIZJ == null || view == null) {
            return;
        }
        interfaceC1008930cMVLIZJ.LJJ(new C1000120c8I("sticker"), view);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final AbstractC999780c7k LIZ(String str) {
        C999880c7u c999880c7uLJIJJ;
        IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
        if (iFeedAdService != null && (c999880c7uLJIJJ = iFeedAdService.LJIJJ()) != null) {
            return c999880c7uLJIJJ.LIZ(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r2 = this;
            r2.LLILZ = r3
            r1 = 0
            if (r3 == 0) goto L4f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.getAwemeRawAd()
        L9:
            r2.LLILZIL = r0
            X.01GW r0 = r2.LLIZLLLIL
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto L1e
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L1e
            r0.addObserver(r2)
        L1e:
            boolean r0 = X.C1000100c8G.LIZ()
            if (r0 == 0) goto L4a
            X.0c7k r0 = r2.LLIZ
            if (r0 == 0) goto L2b
            r0.LJ()
        L2b:
            boolean r0 = r2.LLILZLL
            if (r0 != 0) goto L4a
            if (r3 == 0) goto L4d
            r2.LJFF()
        L34:
            com.ss.android.ugc.aweme.commercialize.model.AdStickerData r0 = X.C1017070cZd.LJIILLIIL(r3)
        L38:
            r2.LLJJIJI = r0
            if (r0 == 0) goto L3e
            java.lang.String r1 = r0.stickerUrl
        L3e:
            r2.LLJJ = r1
            if (r3 == 0) goto L49
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZLLL()
            r0.LJIJJ(r2)
        L49:
            return
        L4a:
            if (r3 == 0) goto L4d
            goto L34
        L4d:
            r0 = r1
            goto L38
        L4f:
            r0 = r1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJI(String str) {
        Object obj;
        String aid;
        if (Intrinsics.LJFF(str, "load_timeout")) {
            C824370WVn.LIZ(null, "ad_lynx_sticker_load_timeout", null, this.LLJJ, Boolean.valueOf(this.LLJJIJIL), Boolean.valueOf(this.LLJJIJIIJIL), Boolean.valueOf(this.LLJI));
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", this.LLILZIL);
        c1022820ciuLIZLLL.LIZJ("sticker", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "fail_reason");
        if (Intrinsics.LJFF(str, "load_timeout")) {
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LLJJJ), "failed_reason_status");
        }
        C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
        String str2 = "1";
        if (c1001410cAN.LIZIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1022820ciuLIZLLL.LIZIZ(obj, "use_idle_preload");
        if (c1001410cAN.LIZIZ()) {
            Aweme aweme = this.LLILZ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C1001420cAO c1001420cAOLJIIIIZZ = c1001410cAN.LJIIIIZZ(aid, EnumC1001380cAK.STICKER_OPERATION, EnumC599900Nfw.FEED);
            if (c1001420cAOLJIIIIZZ == null || !c1001420cAOLJIIIIZZ.LIZ()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1022820ciuLIZLLL.LIZIZ(str2, "idle_preload_status");
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(((C1000080c8E) this.LLILLJJLI).LLJILJIL + 1), "play_order");
        c1022820ciuLIZLLL.LJII();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAdPlayEvent(C582020MsC c582020MsC) {
        C1022030chd c1022030chd = C1022030chd.LIZ;
        AdStickerData adStickerData = this.LLJJIJI;
        c1022030chd.getClass();
        if (C1022030chd.LJIL(adStickerData) && this.LLILLJJLI.isShowing()) {
            LJIIIZ("event_card_show", null);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C824380WVo c824380WVo) {
        int i = c824380WVo.LIZ;
        this.LLJJJ = i;
        this.LLJJIJIL = true;
        if (i == 1) {
            this.LLJJIJIIJIL = true;
        } else {
            C824370WVn.LIZ(c824380WVo, "adLynx_sticker_status_fail", this.LLJILJIL, this.LLJJ, null, null, null);
        }
    }

    public final void LJIIIZ(String str, JSONObject jSONObject) {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJILJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ("event_card_show", jSONObject);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public FeedAdLynxSticker(String str, ViewGroup viewGroup, C1000080c8E c1000080c8E, String str2) {
        super(viewGroup, c1000080c8E, str2);
        this.LLJILLL = str;
        AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.0c8F
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                FeedAdLynxSticker feedAdLynxSticker = this.LL;
                if (!feedAdLynxSticker.LLJJI) {
                    feedAdLynxSticker.LLJI = true;
                    feedAdLynxSticker.LLJILJIL = interfaceC1541990qEH.e1();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str3) {
                this.LL.LLJJI = false;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str3, String str4) {
                this.LL.LLJJI = true;
            }
        };
        InterfaceC1000280c8Y interfaceC1000280c8Y = this.LLJ;
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        if (interfaceC1000280c8Y != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJILJ;
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            c1029690ctzLJJIIJZLJL = interfaceC1000280c8Y.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, iAdLandPagePreloadService != null ? iAdLandPagePreloadService.K0("lynx_feed") : null, abstractC1024610cln);
        }
        this.LLJJIII = c1029690ctzLJJIIJZLJL;
        this.LLJJJ = -1;
    }
}
