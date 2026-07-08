package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment;

import X.AbstractC511920K5u;
import X.C01GW;
import X.C0K0R;
import X.C0K51;
import X.C0K54;
import X.C0K5B;
import X.C0K5R;
import X.C0K5T;
import X.C0K6M;
import X.C0K7G;
import X.C0K7S;
import X.C0KCC;
import X.C13LP;
import X.C15438062q;
import X.C197039127h;
import X.C2089408Gm;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C426930God;
import X.C452501pT;
import X.C457801qK;
import X.C510570K0p;
import X.C511520K4g;
import X.C511730K5b;
import X.C511910K5t;
import X.C511970K5z;
import X.C513510KBx;
import X.C513880KDi;
import X.C521940KdU;
import X.C786410Ut5;
import X.EnumC510710K1d;
import X.EnumC513400KBm;
import X.InterfaceC058200Jg;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.ss.android.ugc.aweme.subscription.pgc.experiment.PurchasePanelMigrationSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsPrivilegeDetailBaseFragment extends PgcBaseFragment implements InterfaceC058200Jg {
    public static final /* synthetic */ int LLLILZLLLI = 0;
    public Boolean LLILLJJLI;
    public PGCGetSubPrivilegeDetailResponse.Data LLILLL;
    public PGCTemplateListData LLJ;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public SubscriptionSceneContext LLJJI;
    public float LLJJJ;
    public ViewGroup LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public ViewGroup LLJJL;
    public C197039127h LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public C197039127h LLJLIL;
    public C197039127h LLJLILLLLZIIL;
    public Integer LLJLL;
    public ViewGroup LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public TextView LLLF;
    public ViewGroup LLLFF;
    public Function2<? super Integer, ? super Float, Unit> LLLFZ;
    public Function1<? super String, Unit> LLLI;
    public Function0<Unit> LLLII;
    public Function1<? super PGCGetSubPrivilegeDetailResponse.Data, Unit> LLLIIII;
    public boolean LLLIIIIL;
    public long LLLIIIL;
    public long LLLIIL;
    public long LLLIL;
    public boolean LLLILZJ;
    public EnumC510710K1d LLILZ = EnumC510710K1d.POPUP;
    public Function0<Unit> LLILZIL = AFwS193S0000000_7.get$arr$(178);
    public String LLILZLL = "";
    public String LLIZ = "";
    public Function1<? super Boolean, Unit> LLIZLLLIL = AFwS237S0000000_7.get$arr$(207);
    public int LLJI = 1001;
    public String LLJIJIL = "";
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 450));
    public String LLJJIII = "";
    public final Map<String, String> LLJJIJI = new LinkedHashMap();
    public String LLJJIJIIJIL = "";
    public final Map<String, String> LLJJIJIL = new LinkedHashMap();
    public String LLLFFI = "";
    public String LLLIILIL = "";
    public final Map<String, Long> LLLILZ = new LinkedHashMap();

    public abstract int UR();

    public abstract PrivilegeDetailViewModel WR();

    public abstract void bS();

    public void hS(AbstractC511920K5u abstractC511920K5u) {
    }

    public final void gS() {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_click");
        c511970K5z.LIZIZ(Integer.valueOf(C0K51.LJIILIIL(Boolean.valueOf(this.LLJILJIL))), "has_tpl_cache");
        c511970K5z.LIZIZ(Integer.valueOf(C0K51.LJIILIIL(Boolean.valueOf(this.LLJILLL))), "has_sku_cache");
        c511970K5z.LIZIZ(this.LLIZ, "group_id");
        mS(c511970K5z);
        SR(c511970K5z);
        c511970K5z.LIZLLL();
    }

    public final boolean oS() {
        PGCGetSubPrivilegeDetailResponse.Data data;
        User user;
        String currentUserID;
        Long lLJIILIIL;
        SubscriptionSceneContext subscriptionSceneContext = this.LLJJI;
        if (subscriptionSceneContext == null || subscriptionSceneContext.isInLiveRoom || !Intrinsics.LJFF(this.LLILZLL, "video_anchor") || (data = this.LLILLL) == null || (user = data.anchorDetail) == null) {
            return false;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return ((iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(currentUserID)) == null) ? 0L : lLJIILIIL.longValue()) == user.getId();
    }

    public final void MR() {
        List<SubPackagePrivilege> list = WR().LLJJIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SubPackagePrivilege> it2 = list.iterator();
        while (it2.hasNext()) {
            SubPackageSummary subPackageSummary = it2.next().packageSummary;
            arrayList.add(subPackageSummary != null ? subPackageSummary.id : null);
        }
        for (Object obj : C13LP.LJJJJLI(arrayList)) {
            if (Intrinsics.LJFF(this.LLLFFI, obj)) {
                Long l = (Long) ((LinkedHashMap) this.LLLILZ).get(obj);
                this.LLLILZ.put((String) obj, Long.valueOf((l != null ? l.longValue() : 0L) + (SystemClock.elapsedRealtime() - this.LLLIL)));
            }
        }
        this.LLLIL = SystemClock.elapsedRealtime();
    }

    public void PR() {
        View view;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null) {
            this.LLJLLIL = (ViewGroup) view.findViewById(R.id.d7i);
            this.LLJJJJLIIL = (C197039127h) view.findViewById(R.id.cvf);
            this.LLJJJJ = (TuxTextView) view.findViewById(R.id.cvh);
            this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.sai);
            this.LLJJL = (ViewGroup) view.findViewById(R.id.f688cx4);
            this.LLJJLIIIJLLLLLLLZ = (C197039127h) view.findViewById(R.id.wi0);
            this.LLJJJIL = (ViewGroup) view.findViewById(R.id.mg1);
            this.LLJL = (C197039127h) view.findViewById(R.id.n2w);
            this.LLJLIL = (C197039127h) view.findViewById(R.id.watch_live_btn);
            this.LLJLILLLLZIIL = (C197039127h) view.findViewById(R.id.watch_live_btn_v2);
            this.LLLFF = (ViewGroup) view.findViewById(R.id.mdn);
            this.LLLF = (TextView) view.findViewById(R.id.soj);
        }
        ViewGroup viewGroup = this.LLJJJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLJJJIL;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0K5r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        ViewGroup viewGroup3 = this.LLJLLIL;
        if (viewGroup3 != null) {
            viewGroup3.setBackground(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String VR() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel r0 = r8.WR()
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege> r1 = r0.LLJJIJIL
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege r0 = (com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege) r0
            com.bytedance.android.livesdk.chatroom.api.SubPackageSummary r0 = r0.packageSummary
            r2.add(r0)
            goto L15
        L27:
            Y.AComparatorS26S0000000_7 r1 = new Y.AComparatorS26S0000000_7
            r0 = 7
            r1.<init>(r0)
            java.util.List r0 = X.C13LP.LJLLLL(r1, r2)
            java.util.Iterator r2 = r0.iterator()
            r7 = 0
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.chatroom.api.SubPackageSummary r0 = (com.bytedance.android.livesdk.chatroom.api.SubPackageSummary) r0
            if (r0 == 0) goto L51
            java.lang.String r1 = r0.id
        L46:
            java.lang.String r0 = r8.LLLFFI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L54
            int r7 = r7 + 1
            goto L36
        L51:
            r1 = 0
            goto L46
        L53:
            r7 = -1
        L54:
            int r6 = r8.UR()
            r5 = 1
            if (r6 == r5) goto L78
            java.lang.String r4 = "high"
            java.lang.String r3 = "low"
            r2 = 2
            java.lang.String r1 = ""
            if (r6 == r2) goto L71
            r0 = 3
            if (r6 != r0) goto L6d
            if (r7 == 0) goto L77
            if (r7 == r5) goto L6e
            if (r7 == r2) goto L76
        L6d:
            return r1
        L6e:
            java.lang.String r4 = "middle"
            return r4
        L71:
            if (r7 == 0) goto L77
            if (r7 == r5) goto L76
            return r1
        L76:
            return r4
        L77:
            return r3
        L78:
            java.lang.String r4 = "null"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.VR():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String ZR() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel r0 = r8.WR()
            java.util.List r0 = r0.BQ2()
            r3 = 0
            if (r0 == 0) goto L7c
            java.util.Iterator r2 = r0.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r7 = r2.next()
            r0 = r7
            webcast.api.pgc_sub.PGCTemplateInfo r0 = (webcast.api.pgc_sub.PGCTemplateInfo) r0
            java.lang.String r1 = r0.packageId
            java.lang.String r0 = r8.LLLFFI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lf
        L26:
            webcast.api.pgc_sub.PGCTemplateInfo r7 = (webcast.api.pgc_sub.PGCTemplateInfo) r7
        L28:
            r6 = 0
            if (r7 == 0) goto L76
            webcast.api.pgc_sub.PGCOfferInfo r0 = r7.offerInfo
            if (r0 == 0) goto L76
            float r4 = r0.discountRate
        L31:
            webcast.api.pgc_sub.PGCTagInfo r0 = r7.tagInfo
            if (r0 == 0) goto L37
            java.lang.String r3 = r0.promotionButton
        L37:
            java.lang.String r5 = ""
            if (r3 != 0) goto L3c
            r3 = r5
        L3c:
            X.0KED r2 = X.C0KE2.Companion
            if (r7 == 0) goto L73
            webcast.api.pgc_sub.PGCOfferInfo r0 = r7.offerInfo
            if (r0 == 0) goto L73
            long r0 = r0.offerType
        L46:
            r2.getClass()
            X.0KE2 r1 = X.C0KED.LIZ(r0)
            X.0KE2 r0 = X.C0KE2.FREE_TRIAL_7DAYS
            if (r1 != r0) goto L71
            r1 = 1
        L52:
            webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse$Data r0 = r8.LLILLL
            if (r0 == 0) goto L61
            com.bytedance.android.livesdk.chatroom.api.SubInfo r0 = r0.subInfo
            if (r0 == 0) goto L61
            java.lang.Boolean r0 = r0.isSubscribing
            if (r0 == 0) goto L61
            r0.booleanValue()
        L61:
            boolean r0 = r8.oS()
            if (r0 == 0) goto L7f
            r0 = 2131839374(0x7f11498e, float:1.9311998E38)
            java.lang.String r0 = X.C511520K4g.LJII(r0)
            if (r0 == 0) goto L7e
            return r0
        L71:
            r1 = 0
            goto L52
        L73:
            r0 = 0
            goto L46
        L76:
            r4 = 0
            if (r7 == 0) goto L37
            goto L31
        L7a:
            r7 = r3
            goto L26
        L7c:
            r7 = r3
            goto L28
        L7e:
            return r5
        L7f:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L89
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L96
        L89:
            if (r1 != 0) goto L96
            r0 = 2131839650(0x7f114aa2, float:1.9312558E38)
            java.lang.String r0 = X.C511520K4g.LJII(r0)
            if (r0 == 0) goto L95
            return r0
        L95:
            return r5
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.ZR():java.lang.String");
    }

    public final String aS() {
        AbstractC511920K5u value;
        C0K5R c0k5r = WR().LLL;
        if (c0k5r == null || (value = c0k5r.LIZLLL.getValue()) == null) {
            value = C511910K5t.LIZIZ;
        }
        return value.LIZ;
    }

    public final void nS() {
        CharSequence text;
        CharSequence charSequenceLIZLLL;
        SubscriptionSceneContext subscriptionSceneContext;
        SubInfo subInfo;
        if (C0K7G.LIZLLL()) {
            PGCGetSubPrivilegeDetailResponse.Data data = this.LLILLL;
            if (data == null || !C510570K0p.LJFF(data)) {
                PGCGetSubPrivilegeDetailResponse.Data data2 = this.LLILLL;
                if (data2 == null || (subInfo = data2.subInfo) == null || !Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) {
                    if ((Intrinsics.LJFF(this.LLILLJJLI, Boolean.TRUE) && ((subscriptionSceneContext = this.LLJJI) == null || !subscriptionSceneContext.LIZ())) || C0K7G.LJ()) {
                        TuxTextView tuxTextView = this.LLJJJJJIL;
                        if (tuxTextView != null) {
                            C0K0R.LIZ(tuxTextView);
                            return;
                        }
                        return;
                    }
                    PGCTemplateInfo pGCTemplateInfoYQ2 = WR().yQ2();
                    String strLIZ = C511730K5b.LIZ(WR().xQ2());
                    CharSequence charSequence = "";
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    if (C0K51.LJ(strLIZ)) {
                        C197039127h c197039127h = this.LLILZ == EnumC510710K1d.POPUP ? this.LLJJJJLIIL : this.LLJJLIIIJLLLLLLLZ;
                        if (c197039127h != null) {
                            c197039127h.setText(C511520K4g.LJIIIIZZ(2131849267, strLIZ));
                        }
                    }
                    TuxTextView tuxTextView2 = this.LLJJJJJIL;
                    if (tuxTextView2 != null) {
                        Context context = getContext();
                        if (context != null && pGCTemplateInfoYQ2 != null && (charSequenceLIZLLL = C510570K0p.LIZLLL(pGCTemplateInfoYQ2, context)) != null) {
                            charSequence = charSequenceLIZLLL;
                        }
                        tuxTextView2.setText(charSequence);
                    }
                    TuxTextView tuxTextView3 = this.LLJJJJJIL;
                    if ((tuxTextView3 == null || (text = tuxTextView3.getText()) == null || text.length() != 0) && !C0K7G.LJ()) {
                        TuxTextView tuxTextView4 = this.LLJJJJJIL;
                        if (tuxTextView4 != null) {
                            C0K0R.LIZJ(tuxTextView4);
                            return;
                        }
                        return;
                    }
                    TuxTextView tuxTextView5 = this.LLJJJJJIL;
                    if (tuxTextView5 != null) {
                        C0K0R.LIZ(tuxTextView5);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.onDestroy():void");
    }

    public static void SR(C511970K5z c511970K5z) {
        c511970K5z.LIZIZ(C513880KDi.LIZ, "auto_discount_1m");
        c511970K5z.LIZIZ(C513880KDi.LIZIZ, "auto_discount_package_quantity_1m");
    }

    public final void NR(long j) {
        C197039127h c197039127h = this.LLJL;
        if (c197039127h != null) {
            if (j == 1) {
                c197039127h.LJJJLZIJ(Integer.valueOf(C426930God.LIZLLL(R.attr.f8u, c197039127h.getContext())), null);
                return;
            }
            if (j == 2) {
                c197039127h.LJJJLZIJ(Integer.valueOf(C426930God.LIZLLL(R.attr.f8t, c197039127h.getContext())), null);
            } else if (j == 3) {
                c197039127h.LJJJLZIJ(Integer.valueOf(C426930God.LIZLLL(R.attr.f8v, c197039127h.getContext())), null);
            } else {
                c197039127h.LJJJLZIJ(Integer.valueOf(C426930God.LIZLLL(R.attr.f8t, c197039127h.getContext())), null);
            }
        }
    }

    public final String RR(Long l) {
        if (l == null) {
            return "null";
        }
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(l.longValue() / 1000000.0d)}, 1));
    }

    @Override // X.InterfaceC058200Jg
    public final void a2(Function1<? super String, Unit> function1) {
        this.LLLI = function1;
    }

    @Override // X.InterfaceC058200Jg
    public final void f(Function2<? super Integer, ? super Float, Unit> function2) {
        this.LLLFZ = function2;
    }

    public final void iS(PGCGetSubPrivilegeDetailResponse.Data data) {
        String str;
        String strLIZ;
        int i;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Map<String, String> mapLJ;
        String string;
        String type;
        String string2;
        boolean z;
        Long lValueOf;
        boolean z2;
        String str2;
        boolean z3;
        long j;
        long j2;
        String string3;
        String str3;
        Uri uri;
        String str4;
        String str5;
        long j3;
        long j4;
        if (Intrinsics.LJFF(this.LLJJIJIIJIL, "share")) {
            str = "h5";
        } else if (!Intrinsics.LJFF(this.LLILZLL, "others_homepage")) {
            str = "";
        } else {
            str = "homepage-entry";
        }
        EnumC510710K1d enumC510710K1d = this.LLILZ;
        EnumC510710K1d enumC510710K1d2 = EnumC510710K1d.POPUP;
        if (enumC510710K1d != enumC510710K1d2) {
            strLIZ = "";
        } else {
            Map<String, String> map = this.LLJJIJIL;
            SubscriptionSceneContext subscriptionSceneContext = this.LLJJI;
            if (subscriptionSceneContext == null || (str4 = subscriptionSceneContext.logParam) == null) {
                str4 = "";
            }
            map.put("log_param", str4);
            Map<String, String> map2 = this.LLJJIJIL;
            SubscriptionSceneContext subscriptionSceneContext2 = this.LLJJI;
            if (subscriptionSceneContext2 == null || (str5 = subscriptionSceneContext2.requestExtraParam) == null) {
                str5 = "";
            }
            map2.put("extra_log_pb", str5);
            Map<String, String> map3 = this.LLJJIJIL;
            SubscriptionSceneContext subscriptionSceneContext3 = this.LLJJI;
            if (subscriptionSceneContext3 != null) {
                j3 = subscriptionSceneContext3.liveSubOnlyLiveTier;
            } else {
                j3 = 0;
            }
            map3.put("liveSubOnlyLiveTier", String.valueOf(j3));
            Map<String, String> map4 = this.LLJJIJIL;
            SubscriptionSceneContext subscriptionSceneContext4 = this.LLJJI;
            if (subscriptionSceneContext4 != null) {
                j4 = subscriptionSceneContext4.liveSubOnlyLiveMonth;
            } else {
                j4 = 0;
            }
            map4.put("liveSubOnlyLiveMonth", String.valueOf(j4));
            strLIZ = C2089408Gm.LIZ(this.LLJJIII, "popup", this.LLJJIJIL);
        }
        if (this.LLILZ == enumC510710K1d2) {
            i = 1;
        } else {
            i = 2;
        }
        SubscriptionSceneContext subscriptionSceneContext5 = this.LLJJI;
        if (subscriptionSceneContext5 != null && (uri = subscriptionSceneContext5.schemaUri) != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_benefit_page");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (C0K51.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        if (oS()) {
            C0K54.LIZ().LJI(getContext(), C2097608Jq.LJ());
            return;
        }
        FragmentManager fragmentManagerLJIIIZ = C0K51.LJIIIZ(getContext(), false);
        if (fragmentManagerLJIIIZ == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) this.LLJJIJI).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap.put(key, value);
        }
        SubscriptionSceneContext subscriptionSceneContext6 = this.LLJJI;
        if (subscriptionSceneContext6 != null && (str3 = subscriptionSceneContext6.logParam) != null) {
            mapLJ = C0K51.LJIILJJIL(str3);
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mapLJ);
        linkedHashMap.put("anchor_id", this.LLJJIII);
        User user = data.anchorDetail;
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (user == null || (string = Long.valueOf(user.getId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("log_anchor_id", string);
        linkedHashMap.put("from_sub_enter", str);
        linkedHashMap.put("show_entrance", this.LLILZLL);
        linkedHashMap.put("subscribe_state", aS());
        linkedHashMap.put("need_high_state_page", "false");
        linkedHashMap.put("privilege_show_type", "vertical");
        linkedHashMap.put("privilege_page", "main_page");
        linkedHashMap.put("use_spark", "1");
        linkedHashMap.put("user_present", "1");
        linkedHashMap.put("is_native", "1");
        linkedHashMap.put("package_quantity", String.valueOf(UR()));
        linkedHashMap.put("package_id", this.LLLFFI);
        EnumC510710K1d enumC510710K1d3 = this.LLILZ;
        if (enumC510710K1d3 == null || (type = enumC510710K1d3.getType()) == null) {
            type = "";
        }
        linkedHashMap.put("previous_page_type", type);
        PGCTemplateListData pGCTemplateListData = this.LLJ;
        if (pGCTemplateListData == null || (string2 = Integer.valueOf(pGCTemplateListData.templateVersion).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("template_version", string2);
        linkedHashMap.put("sec_anchor_id", this.LLJJIII);
        if (this.LLILZ == EnumC510710K1d.FULL_PAGE) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap.put("is_full_page", String.valueOf(z));
        linkedHashMap.put("price_rank", VR());
        String str7 = this.LLJJIII;
        User user2 = data.anchorDetail;
        if (user2 != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String str8 = this.LLLFFI;
        String str9 = this.LLILZLL;
        String str10 = this.LLIZ;
        SubscriptionSceneContext subscriptionSceneContext7 = this.LLJJI;
        if (subscriptionSceneContext7 != null && subscriptionSceneContext7.isInLiveRoom) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strAS = aS();
        SubscriptionSceneContext subscriptionSceneContext8 = this.LLJJI;
        if (subscriptionSceneContext8 != null && (string3 = Long.valueOf(subscriptionSceneContext8.roomId).toString()) != null) {
            str6 = string3;
        }
        boolean z4 = !Intrinsics.LJFF(((LinkedHashMap) this.LLJJIJI).get("show_back"), "false");
        String str11 = (String) ((LinkedHashMap) this.LLJJIJI).get("backPage");
        if (str11 == null) {
            str11 = "";
        }
        SubscriptionSceneContext subscriptionSceneContext9 = this.LLJJI;
        if (subscriptionSceneContext9 == null || (str2 = subscriptionSceneContext9.requestExtraParam) == null) {
            str2 = "";
        }
        EnumC513400KBm enumC513400KBm = EnumC513400KBm.PACKAGE_PAGE;
        String pageName = enumC513400KBm.getPageName();
        int i2 = this.LLJI;
        String strLIZ2 = C0K7S.LIZ(data.anchorDetail);
        if (this.LLILZ != EnumC510710K1d.POPUP) {
            z3 = true;
        } else {
            z3 = false;
        }
        SubscriptionSceneContext subscriptionSceneContext10 = this.LLJJI;
        if (subscriptionSceneContext10 != null) {
            j = subscriptionSceneContext10.liveSubOnlyLiveTier;
            j2 = subscriptionSceneContext10.liveSubOnlyLiveMonth;
        } else {
            j = 0;
            j2 = 0;
        }
        C0KCC c0kcc = new C0KCC(str7, strValueOf, "", true, 0, "normal_sub", str8, str9, null, null, str10, Boolean.valueOf(z2), str, strAS, "vertical", "main_page", str6, z4, str11, true, strLIZ, i, null, str2, null, pageName, strLIZ2, null, z3, i2, null, j, j2, false, 1228931840, 14);
        if (PurchasePanelMigrationSettings.INSTANCE.isEnabled() && (Intrinsics.LJFF(c0kcc.LJJIFFI, enumC513400KBm.getPageName()) || Intrinsics.LJFF(c0kcc.LJJIFFI, EnumC513400KBm.PACKAGE_PAGE_V2.getPageName()))) {
            C0K6M.LIZ().LIZIZ(fragmentManagerLJIIIZ, c0kcc, linkedHashMap, getActivity());
        } else {
            C513510KBx.LIZ(c0kcc, linkedHashMap, null, 12).show(fragmentManagerLJIIIZ, "");
        }
    }

    public final void kS(PGCGetSubPrivilegeDetailResponse.Data data) {
        String str;
        boolean z = true;
        this.LLLILZJ = true;
        if (!Intrinsics.LJFF(this.LLILLJJLI, Boolean.TRUE)) {
            gS();
        }
        if (this.LLJJIII.length() != 0) {
            z = false;
        }
        String str2 = null;
        if (z) {
            SubscriptionSceneContext subscriptionSceneContext = this.LLJJI;
            if (subscriptionSceneContext == null || (str = subscriptionSceneContext.anchorSecUid) == null) {
                str = "";
            }
            this.LLJJIII = str;
        }
        if (oS()) {
            C0K54.LIZ().LJI(getContext(), C2097608Jq.LJ());
        } else {
            SubscriptionSceneContext subscriptionSceneContext2 = this.LLJJI;
            if (subscriptionSceneContext2 != null) {
                str2 = subscriptionSceneContext2.previousPage;
            }
            if (!Intrinsics.LJFF(str2, "package_page_new") && data != null) {
                iS(data);
            }
        }
        if (this.LLILZ == EnumC510710K1d.POPUP && !oS()) {
            this.LLILZIL.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C511970K5z mS(X.C511970K5z r10) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.mS(X.0K5z):X.0K5z");
    }

    @Override // X.InterfaceC058200Jg
    public final void n(Function0<Unit> function0) {
        this.LLLII = function0;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(java.lang.Boolean r18, java.lang.Integer r19) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.OR(java.lang.Boolean, java.lang.Integer):void");
    }

    public final void cS(String str, Map<String, String> map) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_privilege_intro_item_click");
        mS(c511970K5z);
        c511970K5z.LIZIZ(str, "privilege_page");
        c511970K5z.LIZJ(map);
        c511970K5z.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PR();
        WR().EQ2(this.LLILLL, new C0K5T(this));
        C457801qK.LIZ(new C521940KdU(((SubscriptionBridgeViewModel) this.LLJJ.getValue()).LL, 4), this, new C0K5B(this, null));
    }
}
