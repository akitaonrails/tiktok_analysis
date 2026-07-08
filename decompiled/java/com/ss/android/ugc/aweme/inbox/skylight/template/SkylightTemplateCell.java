package com.ss.android.ugc.aweme.inbox.skylight.template;

import X.C01GW;
import X.C03IT;
import X.C0MTL;
import X.C0OBG;
import X.C1324990kaH;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1387040mCM;
import X.C1598140rgq;
import X.C1598150rgr;
import X.C1599370rip;
import X.C1599510rj3;
import X.C1600630rkr;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1618440sDa;
import X.C1890820zIu;
import X.C2097608Jq;
import X.C295190Bhd;
import X.C418440Gaw;
import X.C422830Gi1;
import X.C427660Gpo;
import X.C438710HIf;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1598760rhq;
import X.EnumC1606080rte;
import X.InterfaceC1599360rio;
import Y.ARunnableS57S0300000_24;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.EcLiveEvent;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.RingColor;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightTemplateCell extends SkylightBaseTemplateCell<C1598140rgq> implements View.OnClickListener {
    public static final Map<Integer, InterfaceC1599360rio> LLJJ = C2097608Jq.LJIIIIZZ(new Pair(1, new InterfaceC1599360rio() { // from class: X.0rj7
        @Override // X.InterfaceC1599360rio
        public final Map<String, String> LIZ() {
            return null;
        }

        @Override // X.InterfaceC1599360rio
        public final void LIZIZ(C1599370rip c1599370rip) {
        }

        @Override // X.InterfaceC1599360rio
        public final void LIZJ(C1599370rip c1599370rip) {
        }

        @Override // X.InterfaceC1599360rio
        public final boolean LIZLLL(C0MTL c0mtl) {
            User user;
            CustomBizData customBizData = c0mtl.LIZ.customBizData;
            if (customBizData != null && (user = customBizData.user) != null) {
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                Context context = c0mtl.LIZIZ.getContext();
                IMUser.Companion.getClass();
                EnterChatParams enterChatParams = new EnterChatParams(context, C2201941BFw.LIZJ(user));
                enterChatParams.setEnterMethodForMob("inbox_top");
                enterChatParams.setEnterFromForMob("notification_page");
                IMSharePanelApi.LIZ.getClass();
                enterChatParams.setMobEnterMethodForEditShare(C1599690rjL.LIZ().LIZ().LJ());
                imChatService.LJIILLIIL(enterChatParams, null);
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJFF().LIZ(EnumC1910440zoY.INBOX_TOP.getValue(), false, user.getUid(), null, "type_click", C0I0B.LJFF.LIZIZ());
                return true;
            }
            return true;
        }

        @Override // X.InterfaceC1599360rio
        public final void LJ(C1599370rip c1599370rip, View view) {
            CustomBizData customBizData;
            User user;
            view.setTag(R.id.kag, null);
            SkylightData skylightData = c1599370rip.LIZ;
            if (skylightData != null && (customBizData = skylightData.customBizData) != null && (user = customBizData.user) != null) {
                C0ZJ7.LIZIZ(view, user.getUid(), Boolean.FALSE);
            }
        }
    }), new Pair(101, new InterfaceC1599360rio() { // from class: X.0rj2
        @Override // X.InterfaceC1599360rio
        public final Map<String, String> LIZ() {
            return null;
        }

        @Override // X.InterfaceC1599360rio
        public final void LIZIZ(C1599370rip c1599370rip) {
        }

        @Override // X.InterfaceC1599360rio
        public final void LIZJ(C1599370rip c1599370rip) {
        }

        @Override // X.InterfaceC1599360rio
        public final boolean LIZLLL(C0MTL c0mtl) {
            return false;
        }

        @Override // X.InterfaceC1599360rio
        public final void LJ(C1599370rip c1599370rip, View view) {
        }
    }), new Pair(7, C1618440sDa.LIZIZ.LJJLIIIJLLLLLLLZ().getStoryCelebrationCellInterception()), new Pair(8, new InterfaceC1599360rio() { // from class: X.0rim
        public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(556));

        @Override // X.InterfaceC1599360rio
        public final Map<String, String> LIZ() {
            return null;
        }

        @Override // X.InterfaceC1599360rio
        public final void LJ(C1599370rip c1599370rip, View view) {
        }

        @Override // X.InterfaceC1599360rio
        public final void LIZIZ(C1599370rip c1599370rip) {
            CustomBizData customBizData;
            User user;
            String uid;
            SkylightData skylightData;
            CustomBizData customBizData2;
            EcLiveEvent ecLiveEvent;
            String str;
            SkylightData skylightData2 = c1599370rip.LIZ;
            if (skylightData2 != null && (customBizData = skylightData2.customBizData) != null && (user = customBizData.user) != null && (uid = user.getUid()) != null && (skylightData = c1599370rip.LIZ) != null && (customBizData2 = skylightData.customBizData) != null && (ecLiveEvent = customBizData2.event) != null && (str = ecLiveEvent.eventId) != null) {
                C1599330ril.LIZ.getClass();
                C823170WQx<String> c823170WQx = C1599330ril.LIZJ;
                if (c823170WQx.contains(uid)) {
                    return;
                }
                c823170WQx.add(uid);
                if (C1599330ril.LIZLLL.contains(str)) {
                    if (C1599330ril.LJFF) {
                        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                        C1599330ril.LJ(uid, str);
                        long jLIZJ = C1599330ril.LIZJ(str);
                        Keva kevaLIZIZ = C1599330ril.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("special_");
                        sbLIZ.append(curUserId);
                        sbLIZ.append('_');
                        sbLIZ.append(str);
                        kevaLIZIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), jLIZJ + 1);
                    }
                } else if (C1599330ril.LJ) {
                    String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    C1599330ril.LJ(uid, str);
                    long jLIZ = C1599330ril.LIZ(str);
                    Keva kevaLIZIZ2 = C1599330ril.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(curUserId2);
                    sbLIZ2.append('_');
                    sbLIZ2.append(str);
                    kevaLIZIZ2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jLIZ + 1);
                }
                LJFF(c1599370rip.LIZ, "livesdk_live_event_user_entrance_show");
            }
        }

        @Override // X.InterfaceC1599360rio
        public final void LIZJ(C1599370rip c1599370rip) {
            LIZIZ(c1599370rip);
        }

        @Override // X.InterfaceC1599360rio
        public final boolean LIZLLL(C0MTL c0mtl) {
            EcLiveEvent ecLiveEvent;
            String str;
            ILiveEventOuterService iLiveEventOuterService;
            CustomBizData customBizData = c0mtl.LIZ.customBizData;
            if (customBizData != null && (ecLiveEvent = customBizData.event) != null && (str = ecLiveEvent.eventId) != null && (iLiveEventOuterService = (ILiveEventOuterService) this.LIZ.getValue()) != null) {
                iLiveEventOuterService.openLiveEventBgMaskSparkContainer(c0mtl.LIZIZ.getContext(), str, "message");
            }
            LJFF(c0mtl.LIZ, "livesdk_live_event_user_entrance_click");
            return true;
        }

        public static void LJFF(SkylightData skylightData, final String str) {
            final String uid;
            final String str2;
            EcLiveEvent ecLiveEvent;
            User user;
            if (skylightData == null) {
                return;
            }
            CustomBizData customBizData = skylightData.customBizData;
            if (customBizData == null || (user = customBizData.user) == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            CustomBizData customBizData2 = skylightData.customBizData;
            if (customBizData2 != null && (ecLiveEvent = customBizData2.event) != null) {
                str2 = ecLiveEvent.daInfo;
            } else {
                str2 = null;
            }
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.0NTA
                public final void LIZ() {
                    Unit unit;
                    String str3 = str;
                    HashMap map = new HashMap();
                    String str4 = uid;
                    String str5 = str2;
                    map.put("anchor_id", str4);
                    map.put("event_page", "message");
                    if (str5 != null) {
                        try {
                            HashMap map2 = (HashMap) C309390CAv.LIZ(str5, HashMap.class);
                            if (map2 != null) {
                                map.putAll(map2);
                                unit = Unit.LIZ;
                            } else {
                                unit = null;
                            }
                            C189200o6.m2constructorimpl(unit);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    C20684815ws.LJIILLIIL(str3, map);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EcLiveEventInterceptor@d9dc.logLiveEventSkyLightTrack$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EcLiveEventInterceptor@d9dc.logLiveEventSkyLightTrack$1");
                }
            });
        }
    }));
    public C427660Gpo LLIZLLLIL;
    public TuxTextView LLJ;
    public ImageView LLJI;
    public View LLJIJIL;
    public ARunnableS57S0300000_24 LLJILJIL;
    public InterfaceC1599360rio LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 684));

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell
    public final int L5() {
        return R.layout.aaz;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell
    public final void onAttach() {
        InterfaceC1599360rio interfaceC1599360rio = LLJJ.get(Integer.valueOf(P5().bizType));
        if (interfaceC1599360rio != null) {
            interfaceC1599360rio.LIZJ(new C1599370rip(P5()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.C03K6
    public final LifecycleOwner getCurrentLifeCycleOwner() {
        return super.getCurrentLifeCycleOwner();
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLIZLLLIL = (C427660Gpo) this.itemView.findViewById(R.id.biz);
        this.LLJIJIL = this.itemView.findViewById(R.id.bi2);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.p0w);
        this.LLJI = (ImageView) this.itemView.findViewById(R.id.bpw);
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell
    public final void I5(C1598150rgr c1598150rgr) {
        RingColor ringColor;
        Integer numValueOf;
        C1331670kl3 c1331670kl3LJIIIIZZ;
        C786410Ut5.I7(this, this.itemView);
        C427660Gpo c427660Gpo = this.LLIZLLLIL;
        C427660Gpo c427660Gpo2 = null;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        C786410Ut5.T8(c427660Gpo, this);
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.h9(tuxTextView, this);
        ImageView imageView = this.LLJI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, this);
        View[] viewArr = new View[1];
        ImageView imageView2 = this.LLJI;
        if (imageView2 == null) {
            imageView2 = null;
        }
        viewArr[0] = imageView2;
        SkylightBaseTemplateCell.S5(8, viewArr);
        C1599510rj3 c1599510rj3 = new C1599510rj3(this.LLILLL);
        TemplateData templateData = this.LLILLL;
        if (templateData != null && (numValueOf = Integer.valueOf(templateData.uiType)) != null) {
            if (numValueOf.intValue() == 1) {
                U5(c1599510rj3);
                V5(c1599510rj3);
            } else if (numValueOf.intValue() == 5) {
                U5(c1599510rj3);
                V5(c1599510rj3);
                Object obj = c1599510rj3.LIZIZ;
                if (obj != null) {
                    View[] viewArr2 = new View[1];
                    ImageView imageView3 = this.LLJI;
                    if (imageView3 == null) {
                        imageView3 = null;
                    }
                    viewArr2[0] = imageView3;
                    SkylightBaseTemplateCell.S5(0, viewArr2);
                    if (obj instanceof Integer) {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJFF(((Number) obj).intValue());
                    } else if (obj instanceof File) {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJII((File) obj);
                    } else if (obj instanceof String) {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ((String) obj);
                    } else if (obj instanceof Uri) {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJI((Uri) obj);
                    } else if (obj instanceof C03IT) {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJIIJ((C03IT) obj);
                    } else if (obj instanceof UrlModel) {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((UrlModel) obj));
                    } else {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(obj);
                    }
                    c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                    C1890820zIu.LIZ(c1331670kl3LJIIIIZZ);
                    c1331670kl3LJIIIIZZ.LIZLLL("inbox-skylight-avatar");
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LIZ = true;
                    c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                    c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                    ImageView imageView4 = this.LLJI;
                    if (imageView4 == null) {
                        imageView4 = null;
                    }
                    c1331670kl3LJIIIIZZ.LJJI(imageView4);
                    C1600630rkr.LIZIZ(c1331670kl3LJIIIIZZ, null, "Skylight");
                }
                if (C444960Hcc.LIZIZ()) {
                    ImageView imageView5 = this.LLJI;
                    if (imageView5 == null) {
                        imageView5 = null;
                    }
                    C786410Ut5.Lc(imageView5, -C418440Gaw.LIZIZ(4));
                } else {
                    ImageView imageView6 = this.LLJI;
                    if (imageView6 == null) {
                        imageView6 = null;
                    }
                    C786410Ut5.Lc(imageView6, C418440Gaw.LIZIZ(4));
                }
            }
        }
        ARunnableS57S0300000_24 aRunnableS57S0300000_24 = this.LLJILJIL;
        if (aRunnableS57S0300000_24 != null) {
            C427660Gpo c427660Gpo3 = this.LLIZLLLIL;
            if (c427660Gpo3 == null) {
                c427660Gpo3 = null;
            }
            HandlerHook.viewRemoveCallbacks(c427660Gpo3, aRunnableS57S0300000_24);
        }
        this.LLJILJIL = null;
        View viewFindViewById = this.itemView.findViewById(R.id.bj0);
        if (viewFindViewById != null) {
            TemplateData templateData2 = P5().templateData;
            if (templateData2 != null && (ringColor = templateData2.ringColor) != null) {
                ARunnableS57S0300000_24 aRunnableS57S0300000_242 = new ARunnableS57S0300000_24(this, viewFindViewById, ringColor, 2);
                this.LLJILJIL = aRunnableS57S0300000_242;
                C427660Gpo c427660Gpo4 = this.LLIZLLLIL;
                if (c427660Gpo4 != null) {
                    c427660Gpo2 = c427660Gpo4;
                }
                HandlerHook.viewPost(c427660Gpo2, new ARunnableS93S0200000_24(this, aRunnableS57S0300000_242, 16));
            } else {
                SkylightBaseTemplateCell.S5(8, viewFindViewById);
            }
        }
        InterfaceC1599360rio interfaceC1599360rio = LLJJ.get(Integer.valueOf(P5().bizType));
        if (interfaceC1599360rio != null) {
            interfaceC1599360rio.LJ(new C1599370rip(P5()), this.itemView);
        }
    }

    public final void U5(C1599510rj3 c1599510rj3) {
        Object obj = c1599510rj3.LIZ;
        if (obj != null) {
            C427660Gpo c427660Gpo = null;
            if (obj instanceof UrlModel) {
                C427660Gpo c427660Gpo2 = this.LLIZLLLIL;
                if (c427660Gpo2 == null) {
                    c427660Gpo2 = null;
                }
                C427660Gpo.LJIIJJI(c427660Gpo2, C438710HIf.LIZ((UrlModel) obj), false, null, "inbox-skylight-avatar", false, false, null, null, false, AFwS264S0000000_24.get$arr$(189), 502);
                return;
            }
            C427660Gpo c427660Gpo3 = this.LLIZLLLIL;
            if (c427660Gpo3 != null) {
                c427660Gpo = c427660Gpo3;
            }
            C427660Gpo.LJIIJJI(c427660Gpo, obj, false, null, "inbox-skylight-avatar", false, false, null, null, false, AFwS264S0000000_24.get$arr$(190), 502);
        }
    }

    public final void V5(C1599510rj3 c1599510rj3) {
        Object obj = c1599510rj3.LIZJ;
        if (obj != null) {
            TuxTextView tuxTextView = null;
            if (obj instanceof Integer) {
                TuxTextView tuxTextView2 = this.LLJ;
                if (tuxTextView2 != null) {
                    tuxTextView = tuxTextView2;
                }
                tuxTextView.setText(this.itemView.getContext().getString(((Number) obj).intValue()));
                C1387040mCM.LIZ(this.itemView, new C1324990kaH(this, obj));
                return;
            }
            if (!(obj instanceof String)) {
                return;
            }
            TuxTextView tuxTextView3 = this.LLJ;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setText((CharSequence) obj);
            C1387040mCM.LIZ(this.itemView, new AwS638S0100000_24(obj, 50));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: W5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1598140rgq c1598140rgq) {
        super.onBindItemView(c1598140rgq);
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = LLJJ.get(Integer.valueOf(c1598140rgq.LL.bizType));
        }
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.INBOX_TOP_LIST;
        View view = this.itemView;
        View view2 = this.LLJIJIL;
        TuxTextView tuxTextView = null;
        if (view2 == null) {
            view2 = null;
        }
        C427660Gpo c427660Gpo = this.LLIZLLLIL;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        TuxTextView tuxTextView2 = this.LLJ;
        if (tuxTextView2 != null) {
            tuxTextView = tuxTextView2;
        }
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(view, view2, c427660Gpo, tuxTextView, (TuxIconView) null, 32), C295190Bhd.LIZIZ());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TemplateData templateData;
        String str;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        T5(EnumC1598760rhq.CLICK, N5());
        C0MTL c0mtl = new C0MTL(P5(), view);
        InterfaceC1599360rio interfaceC1599360rio = LLJJ.get(Integer.valueOf(P5().bizType));
        if ((interfaceC1599360rio == null || !interfaceC1599360rio.LIZLLL(c0mtl)) && (templateData = this.LLILLL) != null && (str = templateData.schemaUrl) != null) {
            SmartRouter.buildRoute(this.itemView.getContext(), str).open();
        }
    }
}
