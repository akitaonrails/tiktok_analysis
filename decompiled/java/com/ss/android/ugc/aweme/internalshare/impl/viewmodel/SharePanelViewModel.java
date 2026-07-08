package com.ss.android.ugc.aweme.internalshare.impl.viewmodel;

import X.AbstractC1387200mCc;
import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C09A1;
import X.C0CFM;
import X.C0CNO;
import X.C0I0B;
import X.C0PEM;
import X.C0XQ7;
import X.C0ZE7;
import X.C0ZTX;
import X.C1214170hhX;
import X.C1229100i5c;
import X.C123100dR;
import X.C1250860iei;
import X.C1336205Ku;
import X.C1362230lYL;
import X.C1362310lYT;
import X.C1362500lYm;
import X.C1362820lZI;
import X.C1362970lZX;
import X.C1363330la7;
import X.C1363340la8;
import X.C1363350la9;
import X.C1363360laA;
import X.C1364440lbu;
import X.C1365460ldY;
import X.C1366410lf5;
import X.C1367280lgU;
import X.C1367430lgj;
import X.C1371590lnR;
import X.C1375880luM;
import X.C1388190mED;
import X.C13LP;
import X.C1529905yr;
import X.C1554960qZC;
import X.C1599690rjL;
import X.C1720006oQ;
import X.C1906130zhb;
import X.C1906580ziK;
import X.C1954807lC;
import X.C1DFB;
import X.C1DFH;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C296670Bk1;
import X.C299060Bns;
import X.C328250Ctr;
import X.C328270Ctt;
import X.C356901a3;
import X.C452501pT;
import X.C621180OYa;
import X.C729510SjV;
import X.C735370Ssx;
import X.C786410Ut5;
import X.C897490ZIt;
import X.C912070ZqH;
import X.EnumC1364450lbv;
import X.EnumC1365740le0;
import X.EnumC1373490lqV;
import X.EnumC328260Cts;
import X.InterfaceC1337505Lh;
import X.InterfaceC1356370lOt;
import X.InterfaceC1356390lOv;
import X.InterfaceC1362600lYw;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1363370laB;
import X.InterfaceC1363760lao;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1555100qZQ;
import X.InterfaceC328360Cu2;
import X.InterfaceC332260D0u;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IToastHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.api.experiment.ForwardLimitSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.ITakoService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelViewModel implements DefaultLifecycleObserver, InterfaceC328360Cu2<IMContact>, InterfaceC1356370lOt, GenericLifecycleObserver {
    public static final /* synthetic */ int LLLF = 0;
    public SharePackage LL;
    public InterfaceC1356390lOv LLILLJJLI;
    public final List<C1365460ldY> LLILLL;
    public final AbstractC2252651DEx LLILZ;
    public final AbstractC2252651DEx LLILZIL;
    public final InterfaceC1337505Lh LLILZLL;
    public final Set<String> LLIZ;
    public final InterfaceC1363370laB LLIZLLLIL;
    public Lifecycle LLJ;
    public final C1362230lYL LLJI;
    public final boolean LLJIJIL;
    public InterfaceC1363760lao LLJILJIL;
    public final C1371590lnR LLJILJILJ;
    public final EnumC1364450lbv LLJILLL;
    public final C01GW LLJJ;
    public final List<IMContact> LLJJI;
    public final C01GW LLJJIII;
    public final String LLJJIJI;
    public final User LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public InterfaceC1362600lYw LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public final C054G LLJL;
    public final C1362820lZI LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public Fragment LLJLLIL;
    public InterfaceC1362720lZ8 LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public long LLL;

    static {
        new C1363350la9();
    }

    public SharePanelViewModel() {
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    @Override // X.InterfaceC1356370lOt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1214170hhX LJFF() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r7.LL
            r1 = 0
            if (r0 == 0) goto L2d
            android.os.Bundle r3 = r0.extras
            if (r3 == 0) goto L2d
            java.lang.String r1 = "author_user_name"
            java.lang.String r0 = ""
            java.lang.String r6 = r3.getString(r1, r0)
            r0 = -1
            java.lang.String r2 = "share_im_limit_tip_type"
            int r5 = r3.getInt(r2, r0)
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r7.LL
            if (r0 == 0) goto L27
            java.lang.String r1 = r0.itemType
            if (r1 == 0) goto L27
            int r0 = r1.hashCode()
            switch(r0) {
                case -1103912169: goto L2e;
                case -2348590: goto L37;
                case 3322092: goto L40;
                case 361630739: goto L6c;
                case 950398559: goto L75;
                case 1662319721: goto L7f;
                default: goto L27;
            }
        L27:
            r0 = 1
        L28:
            X.0hhX r1 = new X.0hhX
            r1.<init>(r6, r5, r0)
        L2d:
            return r1
        L2e:
            java.lang.String r0 = "now_others_video_post"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L27
        L37:
            java.lang.String r0 = "now_video"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L27
        L40:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            java.lang.String r1 = "is_sub_only_live"
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            if (r0 == 0) goto L53
            r0 = 4
            goto L28
        L53:
            int r1 = r3.getInt(r2)
            r0 = 6
            if (r1 != r0) goto L6a
            java.lang.String r0 = "live_visible_scope_type"
            long r3 = r3.getLong(r0)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L68
            r0 = 5
            goto L28
        L68:
            r0 = 6
            goto L28
        L6a:
            r0 = 0
            goto L28
        L6c:
            java.lang.String r0 = "now_others_post"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L27
        L75:
            java.lang.String r0 = "comment"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            r0 = 2
            goto L28
        L7f:
            java.lang.String r0 = "now_post"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L27
        L88:
            r0 = 3
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel.LJFF():X.0hhX");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r8.LL
            r7 = 0
            if (r0 == 0) goto L39
            android.os.Bundle r2 = r0.extras
            if (r2 == 0) goto L39
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "publish_share_panel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3a
            return r7
        L18:
            java.lang.String r0 = "friends_v3_feeds"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lae
        L20:
            java.lang.String r0 = "enter_method"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "download"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r0 = "is_video_from_discover"
            boolean r0 = r2.getBoolean(r0)
            if (r4 == 0) goto L39
            if (r1 != 0) goto L39
            if (r0 != 0) goto L39
            r7 = 1
        L39:
            return r7
        L3a:
            com.ss.android.ugc.aweme.share.ShareService r1 = X.C621180OYa.LIZ
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r8.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r1.LJJIJIL(r0)
            java.lang.String r0 = "exposed_repost_button_can_show"
            r6 = 1
            boolean r5 = r2.getBoolean(r0, r6)
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r8.LL
            if (r0 == 0) goto Lb9
            android.os.Bundle r3 = r0.extras
            if (r3 == 0) goto Lb9
            java.lang.String r1 = "panel_source"
            java.lang.String r0 = "share_panel"
            java.lang.String r1 = r3.getString(r1, r0)
            if (r1 == 0) goto Lb9
            X.0lza r0 = X.C1379120lza.LIZ
            r0.getClass()
            boolean r0 = X.C1379120lza.LIZIZ(r1)
            if (r0 != r6) goto Lb9
            X.0lza r3 = X.C1379120lza.LIZ
            com.ss.android.ugc.aweme.sharer.model.SharePackage r1 = r8.LL
            java.lang.String r0 = r8.LJIIL()
            r3.getClass()
            boolean r0 = X.C1379120lza.LIZLLL(r1, r0)
            if (r0 == 0) goto Lb9
            r3 = 1
        L78:
            X.01GW r0 = r8.LLJLILLLLZIIL
            java.lang.Object r1 = r0.getValue()
            X.0lXG r1 = (X.InterfaceC1361560lXG) r1
            r8.LJIIL()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r4 = r1.LIZ(r4, r0, r3)
            java.lang.String r0 = "friends_v3_track_scene"
            java.lang.String r3 = r2.getString(r0)
            if (r3 == 0) goto L20
            int r1 = r3.hashCode()
            r0 = -1008301930(0xffffffffc3e68896, float:-461.06708)
            if (r1 == r0) goto Laf
            r0 = -283341379(0xffffffffef1c8dbd, float:-4.8451013E28)
            if (r1 == r0) goto L18
            r0 = -156570633(0xfffffffff6aaebf7, float:-1.7333523E33)
            if (r1 != r0) goto L20
            java.lang.String r0 = "friends_v3_post_simple_detail"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L20
        Lae:
            return r7
        Laf:
            java.lang.String r0 = "friends_v3_text_post_detail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lae
            goto L20
        Lb9:
            r3 = 0
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel.LJII():boolean");
    }

    public final String LJIIIZ() {
        Bundle bundle;
        String string;
        SharePackage sharePackage = this.LL;
        return (sharePackage == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("aid")) == null) ? "" : string;
    }

    public final Pair<Integer, C1362500lYm> LJIIJ() {
        Object obj;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        SharePackage sharePackage = this.LL;
        C1362500lYm c1362500lYm = null;
        string = null;
        String string2 = null;
        c1362500lYm = null;
        if (sharePackage == null || (bundle6 = sharePackage.extras) == null) {
            obj = null;
        } else {
            try {
                obj = bundle6.get("share_bb_guide_status");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        }
        int i = 2;
        if (Intrinsics.LJFF(obj, 2)) {
            i = 0;
        } else if (!Intrinsics.LJFF(obj, 1)) {
            i = -1;
        }
        SharePackage sharePackage2 = this.LL;
        String string3 = (sharePackage2 == null || (bundle5 = sharePackage2.extras) == null) ? null : bundle5.getString("share_bb_id");
        Integer numValueOf = Integer.valueOf(i);
        if (i != -1 && string3 != null) {
            SharePackage sharePackage3 = this.LL;
            String string4 = (sharePackage3 == null || (bundle4 = sharePackage3.extras) == null) ? null : bundle4.getString("share_bb_id");
            SharePackage sharePackage4 = this.LL;
            String string5 = (sharePackage4 == null || (bundle3 = sharePackage4.extras) == null) ? null : bundle3.getString("share_bb_name");
            SharePackage sharePackage5 = this.LL;
            if (sharePackage5 != null && (bundle2 = sharePackage5.extras) != null) {
                string2 = bundle2.getString("share_bb_icon_url");
            }
            SharePackage sharePackage6 = this.LL;
            if (sharePackage6 != null && (bundle = sharePackage6.extras) != null && (string = bundle.getString("share_bb_sub_count")) != null) {
                C2095008Iq.LJIIJJI(string);
            }
            c1362500lYm = new C1362500lYm(string4, string5, string2);
        }
        return new Pair<>(numValueOf, c1362500lYm);
    }

    public final List<IMContact> LJIIJJI() {
        return (List) this.LLJJ.getValue();
    }

    public final String LJIIL() {
        Bundle bundle;
        String string;
        SharePackage sharePackage = this.LL;
        return (sharePackage == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("enter_from")) == null) ? "" : string;
    }

    public final C0CFM LJIILIIL() {
        Bundle bundle;
        User curUser;
        SharePackage sharePackage = this.LL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null) {
            return C0CFM.NONE;
        }
        if (Intrinsics.LJFF(bundle.getString("enter_from"), "publish_share_panel")) {
            return C0CFM.NONE;
        }
        Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(this.LL);
        if (awemeLJJIJIL == null || C729510SjV.LJJIJIL(awemeLJJIJIL) || C1375880luM.LIZIZ(awemeLJJIJIL)) {
            return C0CFM.NONE;
        }
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) C0XQ7.LJFF();
        return (!abstractC848400XPy.isLogin() || (curUser = abstractC848400XPy.getCurUser()) == null || !(curUser.isAccuratePrivateAccount() ^ true) || C1336205Ku.LIZJ().LIZJ()) ? C0CFM.NONE : C0CFM.LAST;
    }

    public final int LJIILJJIL() {
        Bundle bundle;
        SharePackage sharePackage = this.LL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null) {
            return 0;
        }
        return bundle.getInt("forward_limit_label_category", 0);
    }

    public final Set<IMContact> LJIILL() {
        return (Set) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC1356370lOt
    public final Set<IMContact> LIZIZ() {
        return LJIILL();
    }

    public final boolean LJIIIIZZ() {
        if (!LJIILLIIL()) {
            return false;
        }
        int iLIZ = ForwardLimitSetting.LIZ(LJIILJJIL());
        int iLJIIL = ((InterfaceC1365380ldQ) this.LLJLL.getValue()).LJIIL(LJIILJJIL(), LJIIIZ());
        if (iLIZ < 0) {
            return false;
        }
        if (iLJIIL < 0) {
            return LJIILL().size() >= iLIZ;
        }
        return LJIILL().size() >= Math.min(iLIZ, iLJIIL);
    }

    public final boolean LJIILLIIL() {
        return C123100dR.LIZ(LJIIIZ()) && LJIILJJIL() > 0;
    }

    @Override // X.InterfaceC1356370lOt
    public final void refresh() {
        this.LLL = System.currentTimeMillis();
        C23250099c.LIZLLL(this.LLJL, this.LLILZIL, null, new C1362970lZX(this, null), 2);
    }

    @Override // X.InterfaceC1356370lOt
    public final String LJ() {
        return this.LLJZIJLIL;
    }

    public static void LJIJ(SharePanelViewModel sharePanelViewModel) {
        Bundle bundle;
        if (sharePanelViewModel.LLJJJJJIL) {
            SharePackage sharePackage = sharePanelViewModel.LL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                C786410Ut5.LJJJI("button_type", "search_button", bundle);
            }
            C1367430lgj.LIZ.LJIIIIZZ(sharePanelViewModel.LL, "from_internal_end");
            sharePanelViewModel.LLJJJJJIL = false;
        }
    }

    @Override // X.InterfaceC1356370lOt
    public final void LIZ(IMContact iMContact) {
        ((Set) this.LLJJIJIL.getValue()).add(iMContact);
    }

    @Override // X.InterfaceC1356370lOt
    public final boolean LIZJ(C1214170hhX c1214170hhX) {
        if (c1214170hhX.LIZIZ > 0 && C123100dR.LIZ(c1214170hhX.LIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1356370lOt
    public final void LIZLLL(IMContact iMContact) {
        LJIILL().add(iMContact);
    }

    @Override // X.InterfaceC1356370lOt
    public final int LJI(IMContact iMContact) {
        return LJIIJJI().indexOf(iMContact);
    }

    public final void LJIJJ(List<IMContact> list) {
        String str;
        LJIIJJI().clear();
        LJIIJJI().addAll(this.LLILLL);
        SharePackage sharePackage = this.LL;
        if (sharePackage != null) {
            str = sharePackage.itemType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "streak_invite") && C296670Bk1.LIZ()) {
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list) {
                IMContact iMContact2 = iMContact;
                if (!Intrinsics.LJFF(C1529905yr.LIZ(iMContact2), "group") || !C1229100i5c.LIZ.LJIIJJI(C1529905yr.LIZIZ(iMContact2))) {
                    arrayList.add(iMContact);
                }
            }
            list = arrayList;
        }
        C1367280lgU c1367280lgU = C1367280lgU.LIZ;
        SharePackage sharePackage2 = this.LL;
        c1367280lgU.getClass();
        LJIIJJI().addAll(C1367280lgU.LIZIZ(list, sharePackage2, null));
        List listLLIIII = C13LP.LLIIII(LJIILL());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLLIIII) {
            if (LJIIJJI().contains(obj)) {
                arrayList2.add(obj);
            }
        }
        LJIILL().clear();
        LJIILL().addAll(arrayList2);
    }

    @Override // X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        C1720006oQ.LIZJ("SharePanelViewModel", "onLoadError", th);
        LJIIJJI().clear();
        InterfaceC1356390lOv interfaceC1356390lOv = this.LLILLJJLI;
        if (interfaceC1356390lOv != null) {
            interfaceC1356390lOv.jR(LJIIJJI());
        }
        this.LLJJL = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate ");
        sbLIZ.append(this.LLJJIJI);
        C1720006oQ.LJ("SharePanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy ");
        sbLIZ.append(this.LLJJIJI);
        C1720006oQ.LJ("SharePanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C2296808zG.LIZJ(this.LLJL, null);
        this.LLILLJJLI = null;
        this.LLJILJIL = null;
        ((LinkedHashMap) C1363360laA.LIZ).clear();
        ((LinkedHashMap) C1363360laA.LIZIZ).clear();
        ((LinkedHashMap) C1363360laA.LIZJ).clear();
        this.LL = null;
        Lifecycle lifecycle = this.LLJ;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        this.LLJ = null;
        this.LLJLLIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        C328270Ctt c328270Ctt = C328270Ctt.LL;
        C328270Ctt.LLILZ.remove(this.LLJJIJI);
    }

    public final void LJIIZILJ(SharePackage sharePackage, String str) {
        Bundle bundle;
        Integer numValueOf;
        if (sharePackage == null) {
            sharePackage = this.LL;
        }
        C1367430lgj c1367430lgj = C1367430lgj.LIZ;
        c1367430lgj.getClass();
        C1367430lgj.LJFF(c1367430lgj, "click", sharePackage, str);
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (numValueOf = Integer.valueOf(bundle.getInt("aweme_type"))) != null) {
            if (numValueOf.intValue() == 502) {
                C912070ZqH.LIZIZ.LJFF().LJIILIIL("video", "more", false, null, C0I0B.LJFF.LIZIZ());
            } else {
                if (numValueOf.intValue() != 501) {
                    return;
                }
                C912070ZqH.LIZIZ.LJFF().LJIILIIL("image", "more", false, null, C0I0B.LJFF.LIZIZ());
            }
        }
    }

    public final boolean LJIJJLI(IMContact iMContact, boolean z) {
        InterfaceC1356390lOv interfaceC1356390lOv = this.LLILLJJLI;
        if (interfaceC1356390lOv != null) {
            return interfaceC1356390lOv.eJ2(iMContact, z);
        }
        return false;
    }

    @Override // X.InterfaceC328360Cu2
    public final void r61(List<IMContact> list, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccessWithoutSort start: ");
        sbLIZ.append(list.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL.size());
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJIJI);
        C1720006oQ.LJ("SharePanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if ((this.LLJLLIL instanceof SkeletonSharePanelFragment) && (C1250860iei.LIZ(this.LL) || C1364440lbu.LIZ(this.LLJILJILJ))) {
            C0CNO.LIZLLL(0L, new AwS422S0200000_21(this, (SharePanelViewModel) list, (List<IMContact>) z, true));
        } else {
            C23250099c.LIZLLL(this.LLJL, this.LLILZIL.plus(this.LLJLIL), null, new C1362310lYT(this, list, null), 2).LJII(new AwS600S0100000_21(this, 140));
        }
    }

    public final void LJIJI(IMContact iMContact, int i, View view, Function1<? super EnumC328260Cts, Unit> function1) {
        EnumC1365740le0 enumC1365740le0;
        String string;
        Activity activityLIZIZ;
        Activity activityLIZ;
        HashMap<String, String> mobParams;
        Bundle bundle;
        Activity activityLIZIZ2;
        Activity activityLIZ2;
        ITakoService iTakoService;
        Bundle bundle2;
        String string2;
        BaseTemplate baseTemplate;
        ITakoService iTakoService2;
        String str;
        SendMessageTemplateTask sendMessageTemplateTask;
        C0ZE7 activityStatusParams;
        Bundle bundle3;
        int followStatus;
        IMUser iMUser;
        SharePackage sharePackage = this.LL;
        C0ZE7 c0ze7 = null;
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null) {
                followStatus = iMUser.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C786410Ut5.LJJJI("relation_tag", String.valueOf(followStatus), bundle3);
        }
        C328270Ctt c328270Ctt = C328270Ctt.LL;
        String str2 = this.LLJJIJI;
        SharePackage sharePackage2 = this.LL;
        InterfaceC1363370laB interfaceC1363370laB = this.LLIZLLLIL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) C328270Ctt.LLILZ;
        Object linkedHashMap2 = linkedHashMap.get(str2);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(str2, linkedHashMap2);
        }
        Map map = (Map) linkedHashMap2;
        Object c1363340la8 = map.get(iMContact);
        if (c1363340la8 == null) {
            InterfaceC332260D0u interfaceC332260D0uLIZ = C328270Ctt.LIZ(iMContact, str2);
            if (interfaceC1363370laB != null && (activityStatusParams = interfaceC1363370laB.getActivityStatusParams()) != null) {
                activityStatusParams.LJFF = "long_press_panel";
            } else {
                activityStatusParams = null;
            }
            c1363340la8 = new C1363340la8(iMContact, sharePackage2, interfaceC332260D0uLIZ, this, activityStatusParams);
            map.put(iMContact, c1363340la8);
        }
        C1363340la8 c1363340la82 = (C1363340la8) c1363340la8;
        EnumC328260Cts value = c1363340la82.LIZJ.getValue();
        EnumC328260Cts enumC328260Cts = EnumC328260Cts.INIT;
        if (value == enumC328260Cts) {
            SharePackage sharePackage3 = c1363340la82.LIZIZ;
            if (sharePackage3 != null && (sendMessageTemplateTask = sharePackage3.sendMessageTemplateTask) != null) {
                baseTemplate = sendMessageTemplateTask.template;
            } else {
                baseTemplate = null;
            }
            if ((baseTemplate instanceof AwemeCardTemplate) && !((InterfaceC1365380ldQ) c1363340la82.LJIIJ.getValue()).LJJJJL(view, (AwemeCardTemplate) baseTemplate)) {
                return;
            }
            SharePackage sharePackage4 = c1363340la82.LIZIZ;
            if (sharePackage4 != null && (iTakoService2 = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null)) != null && iTakoService2.LJIIZILJ(sharePackage4)) {
                if (c1363340la82.LJIIIZ) {
                    if (Intrinsics.LJFF(sharePackage4.itemType, "tako_local_video")) {
                        str = "share_video";
                    } else {
                        str = "share_picture";
                    }
                    iTakoService2.LJLJL(str, "select_user", sharePackage4.extras);
                } else if (sharePackage4.sendMessageTemplateTask != null) {
                    iTakoService2.LJLLL(sharePackage4.extras, "select_user");
                }
            }
        }
        C0ZE7 c0ze72 = c1363340la82.LJFF;
        if (c0ze72 != null) {
            c0ze72.LJI = Integer.valueOf(i);
        }
        int i2 = C328250Ctr.LIZ[c1363340la82.LIZJ.getValue().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    String str3 = "";
                    if (c1363340la82.LJII) {
                        SharePackage sharePackage5 = c1363340la82.LIZIZ;
                        if (sharePackage5 != null && (bundle2 = sharePackage5.extras) != null && (string2 = bundle2.getString("event_type")) != null) {
                            str3 = string2;
                        }
                        InterfaceC1362720lZ8 interfaceC1362720lZ8 = c1363340la82.LJ.LLJLLL;
                        if (interfaceC1362720lZ8 != null) {
                            interfaceC1362720lZ8.F8(new C1366410lf5());
                        }
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ2 = C1388190mED.LIZ(activityLIZIZ2)) != null && (iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null)) != null) {
                            iTakoService.LJJJJJ(activityLIZ2, str3, EnumC1373490lqV.LONG_PRESS);
                        }
                    } else {
                        SharePackage sharePackage6 = c1363340la82.LJ.LL;
                        if (sharePackage6 != null && (bundle = sharePackage6.extras) != null) {
                            string = bundle.getString("enter_method");
                        } else {
                            string = null;
                        }
                        Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(sharePackage6);
                        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
                        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ2 != null && (activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                            EnterChatParams enterChatParams = new EnterChatParams(activityLIZ, c1363340la82.LIZ);
                            enterChatParams.setEnterFromForMob(c1363340la82.LJ.LJIIL());
                            enterChatParams.setEnterMethodForMob(string);
                            enterChatParams.setEnterFrom(6);
                            enterChatParams.setAuthorId(C735370Ssx.LIZLLL(awemeLJJIJIL));
                            enterChatParams.setGroupId(C735370Ssx.LIZJ(awemeLJJIJIL));
                            enterChatParams.setQuickChat(true);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            if (awemeLJJIJIL != null && (mobParams = awemeLJJIJIL.getMobParams()) != null) {
                                String str4 = mobParams.get("is_from_push");
                                if (str4 == null) {
                                    str4 = "";
                                }
                                linkedHashMap3.put("is_from_push", str4);
                                String str5 = mobParams.get("push_type");
                                if (str5 == null) {
                                    str5 = "";
                                }
                                linkedHashMap3.put("push_type", str5);
                                String str6 = mobParams.get("push_id");
                                if (str6 != null) {
                                    str3 = str6;
                                }
                                linkedHashMap3.put("push_id", str3);
                            }
                            enterChatParams.setExtraMobParams(linkedHashMap3);
                            Map<String, String> extraMobParams = enterChatParams.getExtraMobParams();
                            if (string == null) {
                                string = "share_panel";
                            }
                            extraMobParams.put("panel_source", string);
                            iIMServiceLIZ.getImChatService().LJIILLIIL(enterChatParams, null);
                            InterfaceC1362720lZ8 interfaceC1362720lZ82 = c1363340la82.LJ.LLJLLL;
                            if (interfaceC1362720lZ82 != null) {
                                interfaceC1362720lZ82.F8(new C1366410lf5());
                            }
                            C0ZE7 c0ze73 = c1363340la82.LJFF;
                            if (c0ze73 != null) {
                                c0ze73.LJFF = "chat_room";
                                c0ze7 = c0ze73;
                            }
                            C897490ZIt.LIZIZ(c0ze7);
                        }
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                AnonymousClass0956 anonymousClass0956 = c1363340la82.LJI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c1363340la82.LIZJ.setValue(enumC328260Cts);
                Fragment fragment = c1363340la82.LJ.LLJLLIL;
                if (fragment != null) {
                    boolean zLIZ = C299060Bns.LIZ();
                    IToastHelper iToastHelper = (IToastHelper) PluggableExtentionKt.pluggableSpi$default(IToastHelper.class, false, false, false, 14, null);
                    if (iToastHelper != null) {
                        if (zLIZ) {
                            enumC1365740le0 = EnumC1365740le0.CENTER;
                        } else {
                            enumC1365740le0 = EnumC1365740le0.TOP;
                        }
                        iToastHelper.LIZ(enumC1365740le0, fragment.getString(2131822806), 3000L, AFwS201S0000000_14.get$arr$(291), false, 3, false, UUID.randomUUID().toString(), C0ZTX.LIZ);
                    }
                    if (!c1363340la82.LJII) {
                        IMSharePanelApi.LIZ.getClass();
                        C1599690rjL.LIZ().getShareService().LJJJJLI(c1363340la82.LJ.LL, c1363340la82.LIZ);
                    }
                }
            }
        } else {
            AnonymousClass0956 anonymousClass09562 = c1363340la82.LJI;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            c1363340la82.LJI = C23250099c.LIZLLL(c1363340la82.LIZLLL, C0PEM.LIZJ, null, new C1363330la7(c1363340la82, null), 2);
        }
        function1.invoke(c1363340la82.LIZJ.getValue());
    }

    public SharePanelViewModel(SharePackage sharePackage, InterfaceC1356390lOv interfaceC1356390lOv, List list, InterfaceC1363370laB interfaceC1363370laB, Lifecycle lifecycle, C1362230lYL c1362230lYL, boolean z, InterfaceC1363760lao interfaceC1363760lao, C1371590lnR c1371590lnR, EnumC1364450lbv enumC1364450lbv) {
        InterfaceC1337505Lh interfaceC1337505Lh;
        Bundle bundle;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1DFB c1dfb = C0PEM.LIZJ;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", InterfaceC1337505Lh.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1337505Lh = (InterfaceC1337505Lh) interfaceC1555100qZQLIZIZ.getSource();
        } else {
            interfaceC1337505Lh = null;
        }
        C1906130zhb.LIZ();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LL = sharePackage;
        this.LLILLJJLI = interfaceC1356390lOv;
        this.LLILLL = list;
        this.LLILZ = abstractC2238408pq;
        this.LLILZIL = c1dfb;
        this.LLILZLL = interfaceC1337505Lh;
        this.LLIZ = linkedHashSet;
        this.LLIZLLLIL = interfaceC1363370laB;
        this.LLJ = lifecycle;
        this.LLJI = c1362230lYL;
        this.LLJIJIL = z;
        this.LLJILJIL = interfaceC1363760lao;
        this.LLJILJILJ = c1371590lnR;
        this.LLJILLL = enumC1364450lbv;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        SharePackage sharePackage2 = this.LL;
        if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
            C786410Ut5.LJJJI("position", "panel", bundle);
        }
        this.LLJJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(400));
        this.LLJJI = new ArrayList();
        this.LLJJIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(673));
        this.LLJJIJI = ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LJII();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        }
        IAccountUserService iAccountUserServiceLJFF2 = C0XQ7.LJFF();
        this.LLJJIJIIJIL = iAccountUserServiceLJFF2 != null ? ((AbstractC848400XPy) iAccountUserServiceLJFF2).getCurUser() : null;
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(672));
        this.LLJJJJJIL = true;
        this.LLJL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), abstractC2238408pq));
        this.LLJLIL = new C1362820lZI(CoroutineExceptionHandler.LJJLIL, this);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(675));
        this.LLJLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(674));
        this.LLJZIJLIL = "";
    }
}
