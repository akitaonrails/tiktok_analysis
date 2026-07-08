package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C019F;
import X.C0SWE;
import X.C0SY5;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1200940hMC;
import X.C123100dR;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1908730zln;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C444960Hcc;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1357230lQH;
import X.InterfaceC2217461Bqa;
import Y.ATListenerS451S0100000_18;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.AvatarThumbModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailContentHeaderClaimedStoreAssemV3 extends PoiDetailContentHeaderBaseAssemV3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1184460gvc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailContentHeaderClaimedStoreAssemV3.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailContentHeaderClaimedStoreAssemV3() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 997), AFwS256S0000000_18.get$arr$(347), null, true);
    }

    private final C1184460gvc Jo() {
        return (C1184460gvc) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3
    public final void ap(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str;
        String str2;
        C1184480gve c1184480gve;
        String str3;
        String str4;
        String str5;
        int i;
        List<String> list;
        String str6;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        C1184480gve c1184480gve4;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        C1184480gve c1184480gve5;
        C1184480gve c1184480gve6;
        C1184480gve c1184480gve7;
        C1184480gve c1184480gve8;
        C1184480gve c1184480gve9;
        C1184480gve c1184480gve10;
        C1184480gve c1184480gve11;
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        final String str12 = ((PoiDetailInfoViewModel) assemVMLazy.getValue()).LL;
        C1184460gvc c1184460gvcJo = Jo();
        if (c1184460gvcJo != null && (poiDetailResponse = c1184460gvcJo.LLILLJJLI) != null && str12 != null) {
            C1184480gve c1184480gve12 = null;
            if (1 != 0) {
                cp(str12, poiDetailResponse);
                C1184460gvc c1184460gvcJo2 = Jo();
                if (c1184460gvcJo2 != null && (c1184480gve11 = c1184460gvcJo2.LLILLL) != null) {
                    str = c1184480gve11.LLILLJJLI;
                } else {
                    str = null;
                }
                C1184460gvc c1184460gvcJo3 = Jo();
                if (c1184460gvcJo3 != null && (c1184480gve10 = c1184460gvcJo3.LLILLL) != null) {
                    str2 = c1184480gve10.LL;
                } else {
                    str2 = null;
                }
                dp(poiDetailResponse, str12, str, str2);
                Zo(poiDetailResponse);
                if (str12 != null) {
                    C1200940hMC c1200940hMC = C1200940hMC.LIZ;
                    Context context = view.getContext();
                    c1200940hMC.getClass();
                    boolean zLIZIZ = C1200940hMC.LIZIZ(context);
                    C1184460gvc c1184460gvcJo4 = Jo();
                    if (c1184460gvcJo4 != null && (c1184480gve9 = c1184460gvcJo4.LLILLL) != null) {
                        str7 = c1184480gve9.LLIZLLLIL;
                    } else {
                        str7 = null;
                    }
                    C1184460gvc c1184460gvcJo5 = Jo();
                    if (c1184460gvcJo5 != null && (c1184480gve8 = c1184460gvcJo5.LLILLL) != null) {
                        str8 = c1184480gve8.LLJ;
                    } else {
                        str8 = null;
                    }
                    C1184460gvc c1184460gvcJo6 = Jo();
                    if (c1184460gvcJo6 != null && (c1184480gve7 = c1184460gvcJo6.LLILLL) != null) {
                        str9 = c1184480gve7.LLJI;
                    } else {
                        str9 = null;
                    }
                    C1184460gvc c1184460gvcJo7 = Jo();
                    if (c1184460gvcJo7 != null && (c1184480gve6 = c1184460gvcJo7.LLILLL) != null) {
                        str10 = c1184480gve6.LLILLJJLI;
                    } else {
                        str10 = null;
                    }
                    C1184460gvc c1184460gvcJo8 = Jo();
                    if (c1184460gvcJo8 != null && (c1184480gve5 = c1184460gvcJo8.LLILLL) != null) {
                        str11 = c1184480gve5.LL;
                    } else {
                        str11 = null;
                    }
                    ep(str12, zLIZIZ, poiDetailResponse, str7, str8, str9, str10, str11, poiDetailResponse.getCollectInfo());
                }
                C1184460gvc c1184460gvcJo9 = Jo();
                if (c1184460gvcJo9 != null) {
                    c1184480gve = c1184460gvcJo9.LLILLL;
                } else {
                    c1184480gve = null;
                }
                Oo(str12, poiDetailResponse, c1184480gve);
                C1184460gvc c1184460gvcJo10 = Jo();
                if (c1184460gvcJo10 != null && (c1184480gve4 = c1184460gvcJo10.LLILLL) != null) {
                    str3 = c1184480gve4.LLIZLLLIL;
                } else {
                    str3 = null;
                }
                C1184460gvc c1184460gvcJo11 = Jo();
                if (c1184460gvcJo11 != null && (c1184480gve3 = c1184460gvcJo11.LLILLL) != null) {
                    str4 = c1184480gve3.LLJ;
                } else {
                    str4 = null;
                }
                C1184460gvc c1184460gvcJo12 = Jo();
                if (c1184460gvcJo12 != null && (c1184480gve2 = c1184460gvcJo12.LLILLL) != null) {
                    str5 = c1184480gve2.LLJI;
                } else {
                    str5 = null;
                }
                final ViewGroup viewGroup = (ViewGroup) Lo().findViewById(R.id.r64);
                final OwnerInfoModel ownerInfo = poiDetailResponse.getOwnerInfo();
                int i2 = 8;
                if (ownerInfo != null && C123100dR.LIZ(ownerInfo.uniqueId) && C123100dR.LIZ(ownerInfo.uid)) {
                    C786410Ut5.LJLZ(0, viewGroup);
                    TextView textView = (TextView) Lo().findViewById(R.id.r68);
                    textView.setText(ownerInfo.uniqueId);
                    if (C444960Hcc.LIZJ(textView.getContext())) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                    textView.setTextDirection(i);
                    View viewFindViewById = Lo().findViewById(R.id.r69);
                    if (ownerInfo.blueIcon) {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, viewFindViewById);
                    AvatarThumbModel avatarThumbModel = ownerInfo.avatarThumb;
                    if (avatarThumbModel != null && (list = avatarThumbModel.urlList) != null && (str6 = (String) ListProtector.get(list, 0)) != null && C123100dR.LIZ(str6)) {
                        C427660Gpo.LJIIJJI((C427660Gpo) Lo().findViewById(R.id.r66), str6, false, null, null, false, false, null, null, false, null, 1006);
                    }
                    LinearLayout linearLayout = (LinearLayout) Lo().findViewById(R.id.r67);
                    final String str13 = str3;
                    final String str14 = str4;
                    final String str15 = str5;
                    C786410Ut5.R7(linearLayout, new View.OnClickListener() { // from class: X.0h6R
                        /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[PHI: r1
                          0x008b: PHI (r1v9 java.lang.String) = (r1v6 java.lang.String), (r1v10 java.lang.String) binds: [B:28:0x0089, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[PHI: r1
                          0x00a8: PHI (r1v11 java.lang.String) = (r1v4 java.lang.String), (r1v12 java.lang.String) binds: [B:21:0x0076, B:19:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r10) {
                            /*
                                r9 = this;
                                com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel r0 = r1
                                java.lang.String r2 = r0.uid
                                if (r2 == 0) goto La7
                                com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3 r4 = r2
                                android.view.ViewGroup r0 = r3
                                java.lang.String r8 = r4
                                java.lang.String r7 = r5
                                java.lang.String r6 = r6
                                java.lang.String r5 = r7
                                android.content.Context r1 = r0.getContext()
                                r4.getClass()
                                java.lang.String r0 = "aweme://user/profile"
                                com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
                                java.lang.String r0 = "uid"
                                r1.withParam(r0, r2)
                                java.lang.String r0 = r4.LLJILJILJ
                                java.lang.String r3 = "enter_from"
                                r1.withParam(r3, r0)
                                r1.open()
                                X.0gxB r2 = X.C1185430gxB.LIZ
                                java.lang.String r1 = r4.LLJILJILJ
                                X.0Q7z r0 = X.C1558520qew.LJIIL(r4)
                                r2.getClass()
                                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                                r4.<init>()
                                X.C1182410gsJ.LIZ(r4, r0)
                                if (r8 == 0) goto L48
                                java.lang.String r0 = "poi_id"
                                r4.put(r0, r8)
                            L48:
                                if (r1 == 0) goto L4d
                                r4.put(r3, r1)
                            L4d:
                                java.lang.String r1 = "enter_method"
                                java.lang.String r0 = "click_profile_card"
                                r4.put(r1, r0)
                                if (r7 == 0) goto L5b
                                java.lang.String r0 = "group_id"
                                r4.put(r0, r7)
                            L5b:
                                if (r6 == 0) goto L62
                                java.lang.String r0 = "author_id"
                                r4.put(r0, r6)
                            L62:
                                if (r5 == 0) goto L69
                                java.lang.String r0 = "log_pb"
                                r4.put(r0, r5)
                            L69:
                                X.1D0F r3 = X.C1D0F.LIZ
                                java.lang.String r2 = ""
                                if (r3 == 0) goto L75
                                java.lang.String r1 = r3.LIZ()
                                if (r1 != 0) goto La8
                            L75:
                                r1 = r2
                                if (r3 != 0) goto La8
                                r0 = 0
                            L79:
                                java.lang.String r0 = java.lang.String.valueOf(r0)
                                r4.put(r1, r0)
                                if (r3 == 0) goto L88
                                java.lang.String r1 = r3.LIZIZ()
                                if (r1 != 0) goto L8b
                            L88:
                                r1 = r2
                                if (r3 == 0) goto L92
                            L8b:
                                java.lang.String r0 = r3.LIZJ()
                                if (r0 == 0) goto L92
                                r2 = r0
                            L92:
                                r4.put(r1, r2)
                                long r0 = java.lang.System.currentTimeMillis()
                                java.lang.String r1 = java.lang.String.valueOf(r0)
                                java.lang.String r0 = "profile_entrance_id"
                                r4.put(r0, r1)
                                java.lang.String r0 = "enter_personal_detail"
                                X.C20684815ws.LJIILLIIL(r0, r4)
                            La7:
                                return
                            La8:
                                boolean r0 = r3.isConnected()
                                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                goto L79
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1191170h6R.onClick(android.view.View):void");
                        }
                    });
                    linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.0LtP
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            C427660Gpo c427660Gpo = (C427660Gpo) view2.findViewById(R.id.r66);
                            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.r68);
                            TuxIconView tuxIconView = (TuxIconView) view2.findViewById(R.id.r69);
                            if (motionEvent.getAction() == 0) {
                                C786410Ut5.v5(c427660Gpo, 0.2f);
                                C786410Ut5.B5(tuxTextView, 0.2f);
                                C786410Ut5.x5(tuxIconView, 0.2f);
                                return false;
                            }
                            C786410Ut5.v5(c427660Gpo, 1.0f);
                            C786410Ut5.B5(tuxTextView, 1.0f);
                            C786410Ut5.x5(tuxIconView, 1.0f);
                            return false;
                        }
                    });
                    C1908730zln c1908730zln = (C1908730zln) Lo().findViewById(R.id.r65);
                    if (poiDetailResponse.getFollowOwnerStatus() != null && ownerInfo.uid != null) {
                        User user = new User();
                        user.setUid(ownerInfo.uid);
                        user.setFollowStatus(Intrinsics.LJFF(poiDetailResponse.getFollowOwnerStatus(), Boolean.TRUE) ? 1 : 0);
                        C0SWE c0swe = new C0SWE(user);
                        c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
                        c0swe.LJFF = C0SY5.LIZIZ(c1908730zln.getContext());
                        c0swe.LIZJ = true;
                        c1908730zln.LLLLZIL(c0swe.LIZ());
                        c1908730zln.setTracker(new AwS167S1100000_18(this, str12, 32));
                    }
                    c1908730zln.setOnTouchListener(new ATListenerS451S0100000_18(this, 14));
                } else {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
                Context context2 = view.getContext();
                C1184460gvc c1184460gvcJo13 = Jo();
                if (c1184460gvcJo13 != null) {
                    c1184480gve12 = c1184460gvcJo13.LLILLL;
                }
                Vo(str12, poiDetailResponse, context2, c1184480gve12);
                So(str12, poiDetailResponse);
                bp();
            }
        }
    }
}
