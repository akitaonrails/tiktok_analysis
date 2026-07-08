package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AbstractC1492605sq;
import X.AbstractC1493005su;
import X.AbstractC2211791BhR;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I0B;
import X.C0I0Y;
import X.C0I31;
import X.C0I3V;
import X.C0I4H;
import X.C0I4Y;
import X.C0I6Y;
import X.C0ICR;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZQZ;
import X.C0ZVS;
import X.C0ZZ0;
import X.C0ZZ1;
import X.C0ZZ2;
import X.C0ZZ3;
import X.C0ZZ9;
import X.C0ZZA;
import X.C0ZZB;
import X.C0ZZY;
import X.C0ZZZ;
import X.C1308910kAL;
import X.C1322110kVd;
import X.C13LE;
import X.C13LP;
import X.C1494905tD;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697810uHb;
import X.C16E3;
import X.C1807670x8n;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C457780HxI;
import X.C460270I3d;
import X.C460510I4b;
import X.C461530I7z;
import X.C462590ICb;
import X.C462620ICe;
import X.C462630ICf;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C898670ZNh;
import X.C898900ZOe;
import X.C901710ZYz;
import X.C901720ZZa;
import X.C901740ZZc;
import X.C901790ZZh;
import X.C901800ZZi;
import X.C901810ZZj;
import X.C901840ZZm;
import X.C902500Zaq;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC20321914fR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460300I3g;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC901780ZZg;
import X.InterfaceC901860ZZo;
import X.RunnableC514801zW;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ACListenerS117S0200000_14;
import Y.ACListenerS80S0300000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS50S0310000_6;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareLiveCardAssem extends ReusedUISlotAssem<ShareLiveCardAssem> implements InterfaceC712990Rxx<C0ZZ9>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIL;
    public C1494905tD LLLFFI;
    public String LLLFZ;
    public C901840ZZm LLLII;
    public C901800ZZi LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final C1559260qg8 LLLIIIL;
    public final C01GW LLLIIL;
    public InterfaceC901780ZZg LLLIILIL;
    public boolean LLLIL;
    public long LLLILZ;
    public long LLLILZJ;
    public boolean LLLILZLLLI;
    public AnonymousClass0956 LLLIZZ;
    public AnonymousClass0956 LLLJ;
    public final boolean LLLJIL;
    public final boolean LLLJL;
    public final long LLLL;
    public final boolean LLLLII;
    public volatile C901740ZZc LLLLIIIILLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 539));
    public final C01GW LLJL = C1509305vX.LIZ(new AwS558S0100000_14(this, 537));
    public final C01GW LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 535));
    public final C01GW LLJLILLLLZIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 536));
    public final C01GW LLJLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 534));
    public final C01GW LLJLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 533));
    public final C01GW LLJLLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 541));
    public final C01GW LLJZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 543));
    public final C01GW LLJZIJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 542));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 538));
    public final C1559260qg8 LLLF = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLLFF = C1509305vX.LIZ(new AwS558S0100000_14(this, 540));
    public final C902500Zaq LLLI = new C902500Zaq();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareLiveCardAssem.class, "imLiveLoggerUtil", "getImLiveLoggerUtil()Lcom/ss/android/ugc/aweme/im/chatroom/api/IIMLiveLoggerUtil;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ShareLiveCardAssem.class, "liveCardVM", "getLiveCardVM()Lcom/ss/android/ugc/aweme/im/messagelist/protocols/LiveCardViewModel;", 0);
        c09r3.getClass();
        LLLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ShareLiveCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveCardViewModel.class);
        this.LLLIIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 546), null, AFwS248S0000000_14.get$arr$(139));
        this.LLLIIIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLLIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 545));
        IMLiveService.LIZ.getClass();
        IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
        this.LLLJIL = iMLiveServiceLIZ != null ? iMLiveServiceLIZ.LJIIIZ() : false;
        IMLiveService iMLiveServiceLIZ2 = C0ZVS.LIZ();
        this.LLLJL = iMLiveServiceLIZ2 != null ? iMLiveServiceLIZ2.LJIJ() : false;
        IMLiveService iMLiveServiceLIZ3 = C0ZVS.LIZ();
        this.LLLL = iMLiveServiceLIZ3 != null ? iMLiveServiceLIZ3.LJIIZILJ() : 0L;
        IMLiveService iMLiveServiceLIZ4 = C0ZVS.LIZ();
        this.LLLLII = iMLiveServiceLIZ4 != null ? iMLiveServiceLIZ4.LJIIJJI() : false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.clt;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final InterfaceC901860ZZo up() {
        C901740ZZc c901740ZZc = this.LLLLIIIILLL;
        if (c901740ZZc == null) {
            synchronized (this) {
                c901740ZZc = this.LLLLIIIILLL;
                if (c901740ZZc == null) {
                    C901740ZZc c901740ZZc2 = (C901740ZZc) C1807670x8n.LJJJJLI();
                    this.LLLLIIIILLL = c901740ZZc2;
                    return c901740ZZc2;
                }
            }
        }
        return c901740ZZc;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void Qp() {
        C901800ZZi c901800ZZi = this.LLLIIII;
        if (c901800ZZi != null) {
            C786410Ut5.LJJJZ(c901800ZZi, (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
            ((C901720ZZa) this.LLLFF.getValue()).LIZ(c901800ZZi, C901790ZZh.LIZIZ);
            this.LLLIIII = null;
        }
    }

    public final void Tp() {
        C901840ZZm c901840ZZm = this.LLLII;
        if (c901840ZZm != null) {
            C786410Ut5.LJJJZ(c901840ZZm, (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
            ((C901720ZZa) this.LLLFF.getValue()).LIZ(c901840ZZm, C901810ZZj.LIZIZ);
            this.LLLII = null;
        }
    }

    public final void Up() {
        if (this.LLLJIL) {
            InterfaceC901780ZZg interfaceC901780ZZg = this.LLLIILIL;
            if (interfaceC901780ZZg != null) {
                interfaceC901780ZZg.LIZIZ();
            }
            C786410Ut5.LLZZ((RadiusLayout) this.LLJZ.getValue(), 8);
            C0I0Y c0i0yTp = tp();
            int visibility = c0i0yTp.getVisibility();
            c0i0yTp.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0i0yTp);
            if (this.LLLILZJ > 0) {
                up();
                long j = this.LLLILZJ;
                C0I0B.LJFF.LIZIZ();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", "chat");
                c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
                c2344009Gk.LJIIIIZZ("action_type", "click");
                c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
                C20684815ws.LJIILLIIL("livesdk_live_window_duration_v2", c2344009Gk.LIZ);
            }
            this.LLLILZJ = 0L;
            this.LLLIL = false;
            this.LLLILZLLLI = false;
            ((C898900ZOe) this.LLLF.getValue()).LL.setTag(R.id.k_r, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        if (this.LLLLII) {
            this.LLLIL = false;
        } else {
            Up();
        }
    }

    public final C0I0Y tp() {
        return (C0I0Y) this.LLJL.getValue();
    }

    public final LiveCardViewModel yp() {
        return (LiveCardViewModel) this.LLLIIIIL.getValue(this, LLLLIIL[1]);
    }

    public final SessionInfo zp() {
        return (SessionInfo) this.LLLIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Up();
        this.LLLIILIL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        Gp((String) yp().LLIZLLLIL.getValue());
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        Tp();
        Qp();
        sp(false);
        tp().getImageView().setController(null);
        Up();
        this.LLLIILIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLLIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLLJ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public final void up(C0ZZ9 c0zz9) {
        Ip(C0I6Y.LIZ(c0zz9));
        Ep(c0zz9);
        Bp(c0zz9.LJJJLL().LIZ().LIZ.booleanValue(), c0zz9.getRoomInfo());
        op(c0zz9);
        yp().FQ2(c0zz9, c0zz9.LLILII().LIZ.LIZ, c0zz9.getContent());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C2211751BhN.LIZ(view, new AbstractC2211791BhR(this) { // from class: X.0ZZe
            public Function0<String> LJ;
            public final boolean LJFF = true;
            public final float LJI = 0.001f;
            public final C914000ZtO LJII;

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJII;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJI;
            }

            {
                this.LJ = new AwS558S0100000_14(this, this, 544);
                this.LJII = new C914000ZtO(this, 1);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    public final void Ep(C0ZZ9 c0zz9) {
        UrlModel urlModel;
        String str;
        GradientDrawable gradientDrawable;
        C0ZZ3 c0zz3LJJJLL = c0zz9.LJJJLL();
        String str2 = null;
        UrlModel urlModel2 = null;
        if (c0zz3LJJJLL instanceof C0ZZB) {
            C0ZZB c0zzb = (C0ZZB) c0zz3LJJJLL;
            C0ZZ1 roomInfo = c0zz9.getRoomInfo();
            C869590Y9l c869590Y9l = c0zz9.LLILII().LIZ.LIZ;
            tp().LIZIZ();
            Tp();
            Qp();
            C0I4Y<InterfaceC460300I3g> c0i4y = c0zzb.LIZIZ;
            if (!Intrinsics.LJFF(c0i4y, C460510I4b.LIZ) && !Intrinsics.LJFF(c0i4y, C0I4H.LIZ)) {
                if (c0i4y instanceof C0I3V) {
                    TextView textView = (TextView) this.LLJLLL.getValue();
                    C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
                    InterfaceC460300I3g interfaceC460300I3g = (InterfaceC460300I3g) ((C0I3V) c0i4y).LIZ;
                    Context context = getContext();
                    if (context != null) {
                        c460270I3d.getClass();
                        textView.setText(C460270I3d.LIZ(interfaceC460300I3g, context));
                        C786410Ut5.LJLLLLLL(0, (View) this.LLJLLL.getValue());
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C786410Ut5.LJLLLLLL(8, (View) this.LLJLLL.getValue());
            }
            TuxTextView tuxTextView = (TuxTextView) ((C0ZQZ) this.LLL.getValue()).LIZ();
            if (tuxTextView != null) {
                Drawable background = tuxTextView.getBackground();
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
                }
                C460270I3d c460270I3d2 = InterfaceC460300I3g.LIZ;
                InterfaceC460300I3g interfaceC460300I3g2 = c0zzb.LIZ;
                Context context2 = tuxTextView.getContext();
                if (context2 != null) {
                    c460270I3d2.getClass();
                    tuxTextView.setText(C460270I3d.LIZ(interfaceC460300I3g2, context2));
                    C786410Ut5.LJLLLLLL(0, tuxTextView);
                    tuxTextView.setAutoSizeTextTypeUniformWithConfiguration(10, 12, 2, 1);
                    HandlerHook.viewPost(tuxTextView, new RunnableC514801zW(tuxTextView, 56));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (roomInfo != null) {
                urlModel2 = roomInfo.LJFF;
            }
            new AwS50S0310000_6(urlModel2, this, c869590Y9l, false, 1).invoke();
            C786410Ut5.I7(new ACListenerS117S0200000_14(c0zz9, this, 10), tp());
            Gp((String) yp().LLIZLLLIL.getValue());
            Function0<Unit> function0 = c0zzb.LJ.LIZ;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (c0zz3LJJJLL instanceof C0ZZ2) {
            Tp();
            Qp();
            C786410Ut5.I7(new ACListenerS117S0200000_14(c0zz9, this, 10), tp());
            Up();
            this.LLLIILIL = null;
            tp().LIZIZ();
        } else if (c0zz3LJJJLL instanceof C0ZZ0) {
            C0ZZ0 c0zz0 = (C0ZZ0) c0zz3LJJJLL;
            C0ZZ1 roomInfo2 = c0zz9.getRoomInfo();
            C869590Y9l c869590Y9l2 = c0zz9.LLILII().LIZ.LIZ;
            Tp();
            Up();
            this.LLLIILIL = null;
            C0I0Y.LIZLLL(tp());
            C901800ZZi c901800ZZi = this.LLLIIII;
            if (c901800ZZi == null) {
                c901800ZZi = (C901800ZZi) ((C901720ZZa) this.LLLFF.getValue()).LIZIZ(C901790ZZh.LIZIZ);
                this.LLLIIII = c901800ZZi;
                ((ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue()).addView(c901800ZZi);
            }
            c901800ZZi.setClickable(false);
            TuxTextView restrictedTitle = c901800ZZi.getRestrictedTitle();
            C460270I3d c460270I3d3 = InterfaceC460300I3g.LIZ;
            InterfaceC460300I3g interfaceC460300I3g3 = c0zz0.LIZ;
            Context context3 = getContext();
            if (context3 != null) {
                c460270I3d3.getClass();
                restrictedTitle.setText(C460270I3d.LIZ(interfaceC460300I3g3, context3));
                C427660Gpo c427660Gpo = (C427660Gpo) this.LLJLL.getValue();
                if (c427660Gpo != null) {
                    C786410Ut5.T8(c427660Gpo, new ACListenerS80S0300000_14(this, c869590Y9l2, roomInfo2, 1));
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (c0zz3LJJJLL instanceof C901710ZYz) {
            C901710ZYz c901710ZYz = (C901710ZYz) c0zz3LJJJLL;
            C0ZZ1 roomInfo3 = c0zz9.getRoomInfo();
            C869590Y9l c869590Y9l3 = c0zz9.LLILII().LIZ.LIZ;
            Qp();
            Up();
            this.LLLIILIL = null;
            C786410Ut5.I7(new ACListenerS117S0200000_14(c0zz9, this, 10), tp());
            if (roomInfo3 != null) {
                urlModel = roomInfo3.LJFF;
            } else {
                urlModel = null;
            }
            new AwS50S0310000_6(urlModel, this, c869590Y9l3, true, 1).invoke();
            C901840ZZm c901840ZZm = this.LLLII;
            if (c901840ZZm == null) {
                c901840ZZm = (C901840ZZm) ((C901720ZZa) this.LLLFF.getValue()).LIZIZ(C901810ZZj.LIZIZ);
                this.LLLII = c901840ZZm;
                ((ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue()).addView(c901840ZZm);
            }
            if (roomInfo3 != null) {
                str = roomInfo3.LIZIZ;
            } else {
                str = null;
            }
            c901840ZZm.e0(str);
            TuxTextView unliveTitleTv = c901840ZZm.getUnliveTitleTv();
            C460270I3d c460270I3d4 = InterfaceC460300I3g.LIZ;
            InterfaceC460300I3g interfaceC460300I3g4 = c901710ZYz.LIZ;
            Context context4 = getContext();
            if (context4 != null) {
                c460270I3d4.getClass();
                unliveTitleTv.setText(C460270I3d.LIZ(interfaceC460300I3g4, context4));
                TuxTextView unliveNameTv = c901840ZZm.getUnliveNameTv();
                if (roomInfo3 != null) {
                    str2 = roomInfo3.LIZLLL;
                }
                unliveNameTv.setText(str2);
                if (!c901710ZYz.LIZIZ) {
                    IMCrossAppFeatureDiffApi.LIZ.getClass();
                    IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
                    if (iMCrossAppFeatureDiffApiLIZIZ != null) {
                        iMCrossAppFeatureDiffApiLIZIZ.LJ();
                    }
                    C197039127h unliveFollowIv = c901840ZZm.getUnliveFollowIv();
                    C786410Ut5.LLLLLLJ(unliveFollowIv, 0);
                    C786410Ut5.U8(unliveFollowIv, new ACListenerS117S0200000_14(this, c869590Y9l3, 9));
                    C786410Ut5.LLLLLLJ(c901840ZZm.getUnliveMoreVideoTv(), 8);
                } else {
                    C786410Ut5.LLLLLLJ(c901840ZZm.getUnliveFollowIv(), 8);
                    C197039127h unliveMoreVideoTv = c901840ZZm.getUnliveMoreVideoTv();
                    C786410Ut5.LLLLLLJ(unliveMoreVideoTv, 0);
                    C786410Ut5.U8(unliveMoreVideoTv, new ACListenerS80S0300000_14(this, c869590Y9l3, roomInfo3, 2));
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            throw new C1954807lC();
        }
        this.LLLI.LIZJ(c0zz9.LLILII().LIZ.LIZ, "live_card_protocol");
    }

    public final void Fp(LiveRoomStruct liveRoomStruct) {
        InterfaceC901780ZZg interfaceC901780ZZg = this.LLLIILIL;
        if (interfaceC901780ZZg != null) {
            interfaceC901780ZZg.LIZJ(liveRoomStruct, (FrameLayout) this.LLJZIJLIL.getValue());
        }
        C786410Ut5.LLZZ((RadiusLayout) this.LLJZ.getValue(), 0);
        this.LLLIL = true;
        ((C898900ZOe) this.LLLF.getValue()).LL.setTag(R.id.k_r, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.0ZZb] */
    public final void Gp(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        Object obj4;
        Object obj5;
        if (!this.LLLJIL) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String uuid = C0I6Y.LIZ((InterfaceC461380I7k) obj).getUuid();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        C0ZZ3 c0zz3LJJJLL = ((C0ZZ9) obj2).LJJJLL();
        if (!(c0zz3LJJJLL instanceof C0ZZB)) {
            return;
        }
        if (Intrinsics.LJFF(str, uuid)) {
            if (this.LLLJIL && this.LLLIILIL == null) {
                IMLiveService.LIZ.getClass();
                IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
                if (iMLiveServiceLIZ != 0) {
                    C16E3 c16e3LJIILLIIL = iMLiveServiceLIZ.LJIILLIIL(new InterfaceC20321914fR() { // from class: X.0ZZb
                        @Override // X.InterfaceC20321914fR
                        public final void v() {
                            ShareLiveCardAssem shareLiveCardAssem = this.LIZ;
                            if (shareLiveCardAssem.LLLIL) {
                                if (shareLiveCardAssem.LLLJL) {
                                    C0I0Y c0i0yTp = shareLiveCardAssem.tp();
                                    int visibility = c0i0yTp.getVisibility();
                                    c0i0yTp.setVisibility(0);
                                    C1602160rnK.LIZIZ(visibility, 0, c0i0yTp);
                                } else {
                                    C0I0Y c0i0yTp2 = shareLiveCardAssem.tp();
                                    int visibility2 = c0i0yTp2.getVisibility();
                                    c0i0yTp2.setVisibility(8);
                                    C1602160rnK.LIZIZ(visibility2, 8, c0i0yTp2);
                                }
                                ShareLiveCardAssem shareLiveCardAssem2 = this.LIZ;
                                if (shareLiveCardAssem2.LLLILZJ <= 0) {
                                    shareLiveCardAssem2.LLLILZJ = System.currentTimeMillis();
                                }
                                ShareLiveCardAssem shareLiveCardAssem3 = this.LIZ;
                                if (shareLiveCardAssem3.LLLILZ <= 0) {
                                    return;
                                }
                                shareLiveCardAssem3.up();
                                C0ZZ1 roomInfo = ((C0ZZ9) C631370Opb.LIZ(this.LIZ)).getRoomInfo();
                                String str4 = roomInfo != null ? roomInfo.LIZIZ : null;
                                C0ZZ1 roomInfo2 = ((C0ZZ9) C631370Opb.LIZ(this.LIZ)).getRoomInfo();
                                C901740ZZc.LIZ(this.LIZ.LLLILZ, "success", str4, roomInfo2 != null ? roomInfo2.LIZ : null);
                            }
                        }

                        @Override // X.InterfaceC20321914fR
                        public final void w() {
                            ShareLiveCardAssem shareLiveCardAssem = this.LIZ;
                            shareLiveCardAssem.LLLILZLLLI = true;
                            if (shareLiveCardAssem.LLLILZ <= 0) {
                                return;
                            }
                            shareLiveCardAssem.up();
                            C0ZZ1 roomInfo = ((C0ZZ9) C631370Opb.LIZ(this.LIZ)).getRoomInfo();
                            String str4 = roomInfo != null ? roomInfo.LIZIZ : null;
                            C0ZZ1 roomInfo2 = ((C0ZZ9) C631370Opb.LIZ(this.LIZ)).getRoomInfo();
                            C901740ZZc.LIZ(this.LIZ.LLLILZ, "fail", str4, roomInfo2 != null ? roomInfo2.LIZ : null);
                        }

                        @Override // X.InterfaceC20321914fR
                        public final void LIZ(int i, int i2) {
                            if (i > 0 && i2 > 0) {
                                int width = ((View) this.LIZ.LLJZIJLIL.getValue()).getWidth();
                                if (i > i2) {
                                    C12ES.LJIIZILJ(-1, (int) (width / (i / i2)), (View) this.LIZ.LLJZIJLIL.getValue());
                                } else {
                                    C12ES.LJIIZILJ(-1, -1, (View) this.LIZ.LLJZIJLIL.getValue());
                                }
                            }
                        }
                    });
                    this.LLLIILIL = c16e3LJIILLIIL;
                    if (c16e3LJIILLIIL != null) {
                        c16e3LJIILLIIL.LIZ(null, false, true);
                    }
                    View view = (View) this.LLJZ.getValue();
                    C724270Sb3 c724270Sb33 = this.LLJI;
                    if (c724270Sb33 != null) {
                        obj5 = c724270Sb33.LL;
                    } else {
                        obj5 = null;
                    }
                    C786410Ut5.I7(new ACListenerS117S0200000_14((C0ZZ9) obj5, this, 10), view);
                }
            }
            if (this.LLLIL) {
                return;
            }
            if (this.LLLL > 0) {
                AnonymousClass0956 anonymousClass0956 = this.LLLJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLLJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0ZZY(this, uuid, c0zz3LJJJLL, null), 3);
                return;
            }
            Fp(((C0ZZB) c0zz3LJJJLL).LIZJ.LIZ);
            return;
        }
        Up();
        if (this.LLLJIL && this.LLLIL && !this.LLLILZLLLI && this.LLLILZJ <= 0 && this.LLLILZ > 0) {
            up();
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj3 = c724270Sb34.LL;
            } else {
                obj3 = null;
            }
            C0ZZ1 roomInfo = ((C0ZZ9) obj3).getRoomInfo();
            if (roomInfo != null) {
                str2 = roomInfo.LIZIZ;
            } else {
                str2 = null;
            }
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj4 = c724270Sb35.LL;
            } else {
                obj4 = null;
            }
            C0ZZ1 roomInfo2 = ((C0ZZ9) obj4).getRoomInfo();
            if (roomInfo2 != null) {
                str3 = roomInfo2.LIZ;
            }
            C901740ZZc.LIZ(this.LLLILZ, "user_slide_away", str2, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.05sq, X.05tD] */
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
    public final void Ip(C869590Y9l c869590Y9l) {
        if (Intrinsics.LJFF(this.LLLFZ, c869590Y9l.getUuid())) {
            return;
        }
        this.LLLFZ = c869590Y9l.getUuid();
        final String uuid = c869590Y9l.getUuid();
        ?? r2 = new AbstractC1492605sq(uuid) { // from class: X.05tD
            public final String LJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1494905tD) && Intrinsics.LJFF(this.LJ, ((C1494905tD) obj).LJ);
            }

            public final int hashCode() {
                return this.LJ.hashCode();
            }

            @Override // X.AbstractC1492605sq
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MsgShareLiveThumbnailLoaded(msgUUID=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super("im_share_live_show_cover", (String) null, EnumC1492905st.TEA, 6);
                this.LJ = uuid;
            }
        };
        DurationPerfMon.LIZ.LIZIZ(r2, true);
        this.LLLFFI = r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[PHI: r1
      0x0099: PHI (r1v21 java.lang.String) = (r1v5 java.lang.String), (r1v23 java.lang.String) binds: [B:34:0x0097, B:28:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jp(X.C0ZZ9 r15) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem.Jp(X.0ZZ9):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((AppCompatTextView) this.LLJLILLLLZIIL.getValue()).setAutoSizeTextTypeUniformWithConfiguration(11, 12, 2, 1);
        ((AppCompatTextView) this.LLJLLL.getValue()).setAutoSizeTextTypeUniformWithConfiguration(11, 13, 2, 1);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 2));
        if (this.LLLJIL) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0ZZZ(this, null), 3);
        }
    }

    public final void op(C0ZZ9 c0zz9) {
        int iIntValue;
        Integer numLIZJ;
        C462630ICf c462630ICf = c0zz9.LIZJ().LIZ;
        tp().LIZJ(c462630ICf.LIZ, c462630ICf.LIZIZ, c462630ICf.LIZJ, c462630ICf.LIZLLL);
        C0ZZ3 c0zz3LJJJLL = c0zz9.LJJJLL();
        if (!(c0zz3LJJJLL instanceof C0ZZB) && !(c0zz3LJJJLL instanceof C0ZZ2) && !(c0zz3LJJJLL instanceof C0ZZ0)) {
            if (c0zz3LJJJLL instanceof C901710ZYz) {
                C901840ZZm c901840ZZm = this.LLLII;
                if (c901840ZZm != null) {
                    c901840ZZm.setBackground(C462590ICb.LIZ(new C462620ICe(c0zz9.LIZJ().LIZ, new C0ICR(R.attr.a1a)), c901840ZZm.getContext()));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        float f = c0zz9.LIZJ().LIZ.LIZLLL;
        float f2 = c0zz9.LIZJ().LIZ.LIZJ;
        Integer[] numArr = new Integer[2];
        numArr[0] = 0;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1_, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        numArr[1] = Integer.valueOf(iIntValue);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, C13LP.LLII(C1697810uHb.LJIIJJI(numArr)));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f2, f2, f, f});
        ((View) this.LLJLIL.getValue()).setBackground(gradientDrawable);
        C462630ICf c462630ICf2 = c0zz9.LIZJ().LIZ;
        ((RadiusLayout) this.LLJZ.getValue()).LIZ(c462630ICf2.LIZ, c462630ICf2.LIZIZ, c462630ICf2.LIZLLL, c462630ICf2.LIZJ);
    }

    public final void sp(final boolean z) {
        C1494905tD c1494905tD = this.LLLFFI;
        if (c1494905tD != null) {
            DurationPerfMon.LIZ.LIZJ(c1494905tD, new AbstractC1493005su(z) { // from class: X.00j9
                public final boolean LIZLLL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C158500j9) && this.LIZLLL == ((C158500j9) obj).LIZLLL;
                }

                public final int hashCode() {
                    return C786410Ut5.Z2(this.LIZLLL);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MsgShareLiveThumbnailResult(isSuccess=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    super(null, null, C2097908Jt.LIZJ(new Pair("is_success", Boolean.valueOf(z))), 3);
                    this.LIZLLL = z;
                }
            });
        }
        this.LLLFZ = null;
        this.LLLFFI = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZZ9 c0zz9) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZZ9 c0zz9) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bp(boolean r14, X.C0ZZ1 r15) {
        /*
            r13 = this;
            if (r14 == 0) goto L66
            r6 = 0
            if (r15 == 0) goto L48
            java.lang.String r5 = r15.LIZIZ
            java.lang.String r4 = r15.LIZLLL
            if (r5 == 0) goto L48
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r0 = r0.LJ()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r0.LJ(r5, r6)
            if (r0 == 0) goto L2e
            r13.Vp(r0, r5, r4)
        L21:
            X.01GW r0 = r13.LLJLIL
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L2d:
            return
        L2e:
            X.0956 r0 = r13.LLLIZZ
            if (r0 == 0) goto L35
            r0.LIZIZ(r6)
        L35:
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r13)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.05L0 r1 = new X.05L0
            r1.<init>(r5, r13, r4, r6)
            r0 = 2
            X.0956 r0 = X.C23250099c.LIZLLL(r3, r2, r6, r1, r0)
            r13.LLLIZZ = r0
            goto L21
        L48:
            X.01GW r0 = r13.LLJLL
            java.lang.Object r1 = r0.getValue()
            X.0Gpo r1 = (X.C427660Gpo) r1
            r0 = 2130972023(0x7f040d77, float:1.75528E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r4 = 0
            r12 = 1006(0x3ee, float:1.41E-42)
            r5 = r4
            r6 = r3
            r7 = r3
            r8 = r4
            r9 = r4
            r10 = r3
            r11 = r4
            X.C427660Gpo.LJIIJJI(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L21
        L66:
            X.01GW r0 = r13.LLJLIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r1 = 8
            X.C786410Ut5.LJLLLLLL(r1, r0)
            X.01GW r0 = r13.LLL
            java.lang.Object r0 = r0.getValue()
            X.0ZQZ r0 = (X.C0ZQZ) r0
            android.view.View r0 = r0.LIZ()
            if (r0 == 0) goto L2d
            X.C786410Ut5.LJLLLLLL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem.Bp(boolean, X.0ZZ1):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZZA c0zza;
        C0ZZ9 c0zz9 = (C0ZZ9) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            Ip(C0I6Y.LIZ(c0zz9));
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0ZZA) && (c0zza = (C0ZZA) obj2) != null) {
                    if (c0zza.LIZ) {
                        Ep(c0zz9);
                    }
                    if (c0zza.LIZJ) {
                        Bp(c0zz9.LJJJLL().LIZ().LIZ.booleanValue(), c0zz9.getRoomInfo());
                    }
                    if (c0zza.LIZIZ) {
                        op(c0zz9);
                    }
                }
            }
            yp().FQ2(c0zz9, c0zz9.LLILII().LIZ.LIZ, c0zz9.getContent());
            return;
        }
        up(c0zz9);
    }

    public final void Vp(IMUser iMUser, String str, String str2) {
        if (iMUser == null) {
            ((IDMAvatarLoader) this.LLJLLIL.getValue()).LIZIZ(str, null, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
            ((TextView) this.LLJLILLLLZIIL.getValue()).setText(str2);
            return;
        }
        ((IDMAvatarLoader) this.LLJLLIL.getValue()).LJ(iMUser, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        ((TextView) this.LLJLILLLLZIIL.getValue()).setText(iMUser.getNickName());
        IAccessibilityUtils.LIZ.getClass();
        IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
        if (iAccessibilityUtilsLIZ == null) {
            return;
        }
        iAccessibilityUtilsLIZ.LIZ((C1322110kVd) this.LLJLL.getValue(), iMUser);
    }
}
