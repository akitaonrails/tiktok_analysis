package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C05YD;
import X.C09AE;
import X.C0GW5;
import X.C0GWB;
import X.C0I6Y;
import X.C0IC4;
import X.C0QSJ;
import X.C0VSJ;
import X.C0ZDX;
import X.C0ZSJ;
import X.C0ZSK;
import X.C0ZX0;
import X.C0ZX1;
import X.C0ZX3;
import X.C0ZX4;
import X.C0ZX5;
import X.C0ZX6;
import X.C0ZXA;
import X.C0ZXC;
import X.C0ZXF;
import X.C0ZXG;
import X.C0ZXH;
import X.C0ZXJ;
import X.C0ZXK;
import X.C0ZXS;
import X.C0ZXU;
import X.C127G;
import X.C1308910kAL;
import X.C1355270lN7;
import X.C1355280lN8;
import X.C1360910lWD;
import X.C1383370m6R;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C140200gC;
import X.C15438062q;
import X.C1559260qg8;
import X.C1598406Nq;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1807670x8n;
import X.C1954807lC;
import X.C19719912Dl;
import X.C21415118rN;
import X.C2217381BqS;
import X.C2230008oU;
import X.C2230108oV;
import X.C23250099c;
import X.C418440Gaw;
import X.C423680GjO;
import X.C432800Gy6;
import X.C444830HcP;
import X.C444890HcV;
import X.C452501pT;
import X.C457780HxI;
import X.C458200Hxy;
import X.C458470HyP;
import X.C458620Hye;
import X.C461530I7z;
import X.C461640I8k;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.C899770ZRn;
import X.C899820ZRs;
import X.C899830ZRt;
import X.C901180ZWy;
import X.C902500Zaq;
import X.C960203pA;
import X.EnumC1355290lN9;
import X.EnumC1355300lNA;
import X.EnumC430090Gtj;
import X.EnumC432940GyK;
import X.InterfaceC1146704e9;
import X.InterfaceC1360930lWF;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC458410HyJ;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.AAListenerS65S0110000_14;
import Y.ACListenerS149S0100000_14;
import Y.AObjectS389S0100000_14;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptPlaybackViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;
import com.ss.android.ugc.aweme.views.InterceptingConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS143S0400000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class VoiceAssem extends ReusedUISlotAssem<VoiceAssem> implements InterfaceC712990Rxx<C0ZXC>, InterfaceC1146704e9 {
    public static final C0ZXK LLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLZIL;
    public static final OvershootInterpolator LLLLLZL;
    public static String LLLLZ;
    public static volatile boolean LLLLZI;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 795));
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C902500Zaq LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public View LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public View LLLIILIL;
    public C0ZXH LLLIL;
    public C21415118rN LLLILZ;
    public AnonymousClass0956 LLLILZJ;
    public AnonymousClass0956 LLLILZLLLI;
    public ValueAnimator LLLIZZ;
    public AnonymousClass0956 LLLJ;
    public String LLLJIL;
    public C09AE LLLJL;
    public final InterfaceC458410HyJ LLLL;
    public final C444890HcV LLLLII;
    public final Rect LLLLIIIILLL;
    public final InterfaceC1731706qJ LLLLIIL;
    public Long LLLLIILL;
    public InterceptingConstraintLayout LLLLIILLL;
    public AnonymousClass0956 LLLLIL;
    public Animator LLLLILI;
    public final int LLLLJ;
    public final int LLLLJI;
    public final int LLLLL;
    public final int LLLLLIL;
    public int LLLLLILLIL;
    public final C0ZXJ LLLLLJIL;
    public Animator LLLLLJLJLL;
    public Animator LLLLLL;
    public Animator LLLLLLIL;
    public Animator LLLLLLJ;
    public volatile MessagePowerListAbility LLLLLLL;
    public volatile ChatroomEventAbility LLLLLLLLL;
    public volatile C1598406Nq LLLLLLLLLL;
    public C127G LLLLLLLZIL;
    public InterfaceC665370Q7z LLLLLLZ;
    public C0QSJ LLLLLLZZ;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0ZXK] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VoiceAssem.class, "messagePowerListAbility", "getMessagePowerListAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessagePowerListAbility;", 0);
        C13LE.LIZ.getClass();
        LLLLLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(VoiceAssem.class, "chatRoomEventAbility", "getChatRoomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0), new C2217381BqS(VoiceAssem.class, "voiceTranscriptViewModel", "getVoiceTranscriptViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/voice/IMVoiceTranscriptViewModel;", 0), new C2217381BqS(VoiceAssem.class, "singleChatInputVM", "getSingleChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0), new C2217381BqS(VoiceAssem.class, "voicePlaybackVM", "getVoicePlaybackVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/voice/IMVoiceTranscriptPlaybackViewModel;", 0), new C2217381BqS(VoiceAssem.class, "ttDispatcher", "getTtDispatcher()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0)};
        LLLLLZ = new Object() { // from class: X.0ZXK
        };
        LLLLLZL = new OvershootInterpolator(0.6f);
    }

    public VoiceAssem() {
        C019F c019f = C019F.LIZ;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 785);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMVoiceTranscriptViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 797), awS558S0100000_14, AFwS248S0000000_14.get$arr$(229));
        this.LLJLL = new C902500Zaq();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SingleChatInputViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 798), null, AFwS248S0000000_14.get$arr$(230));
        this.LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 783));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 782));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 796));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 784));
        this.LLLFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 789));
        this.LLLFFI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 788));
        this.LLLFZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 794));
        this.LLLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 793));
        this.LLLII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 792));
        this.LLLIIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 790));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 786));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 791));
        this.LLLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 787));
        this.LLLL = C458620Hye.LIZ.LJII();
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setTextSize(C418440Gaw.LIZIZ(14));
        c444890HcV.setTextAlign(Paint.Align.CENTER);
        c444890HcV.setTextLocale(Locale.ENGLISH);
        c444890HcV.LIZ(52);
        this.LLLLII = c444890HcV;
        this.LLLLIIIILLL = new Rect();
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(IMVoiceTranscriptPlaybackViewModel.class);
        this.LLLLIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 781), null, AFwS248S0000000_14.get$arr$(228));
        this.LLLLJ = Color.argb(87, 255, 255, 255);
        this.LLLLJI = Color.argb(87, 255, 255, 255);
        this.LLLLL = Color.argb(87, 255, 255, 255);
        this.LLLLLIL = Color.argb(77, 16, 162, 197);
        this.LLLLLILLIL = -1;
        this.LLLLLJIL = new C0ZXJ();
    }

    public abstract C0ZXF Aq();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cmd;
    }

    public abstract void Qp(C0ZXF c0zxf);

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

    public abstract C0ZXF qq();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final int Bp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        float f = ((C0ZXC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJII().LIZ.LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f + ((C0ZXC) (c724270Sb32 != null ? c724270Sb32.LL : null)).LJII().LIZ.LIZJ)));
    }

    public final boolean Gp() {
        return ((C05YD) this.LLJLLL.getValue()).getValue() == EnumC430090Gtj.LOCKED || ((C05YD) this.LLJLLL.getValue()).getValue() == EnumC430090Gtj.PRESSED;
    }

    public final C0QSJ Jp() {
        C0QSJ c0qsj = this.LLLLLLZZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLLLLZ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLLLLZ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLLLLLZZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final String Up() {
        int iLJFF = this.LLLL.LJFF();
        int iIntValue = ((C0ZXC) bo()).LLJ().LIZJ.LIZ;
        C0ZX0 c0zx0 = (C0ZX0) this.LLLL.LIZLLL().getValue();
        if (c0zx0 instanceof C0ZX4) {
            Integer numValueOf = Integer.valueOf(((C0ZX4) c0zx0).LIZJ);
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            }
        } else if (c0zx0 instanceof C0ZX6) {
            Integer numValueOf2 = Integer.valueOf(((C0ZX6) c0zx0).LIZJ);
            if (numValueOf2.intValue() > 0) {
                iIntValue = numValueOf2.intValue();
            }
        }
        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
        long jLJ = C13LZ.LJ(iIntValue - iLJFF, 0, iIntValue);
        iMVoiceMessageUtil.getClass();
        return IMVoiceMessageUtil.LJFF(C814420VxA.LIZJ(jLJ / 1000.0f));
    }

    public final FrameLayout Vp() {
        return (FrameLayout) this.LLLFF.getValue();
    }

    public final TuxTextView Wp() {
        return (TuxTextView) this.LLLIIII.getValue();
    }

    public final int Xp() {
        return C461640I8k.LIZJ(C461640I8k.LIZ, Vp().getContext(), ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL, 0.0f, 0.0f, 124);
    }

    public final MessagePowerListAbility aq() {
        MessagePowerListAbility messagePowerListAbility;
        MessagePowerListAbility messagePowerListAbility2 = this.LLLLLLL;
        if (messagePowerListAbility2 == null) {
            synchronized (this) {
                messagePowerListAbility2 = this.LLLLLLL;
                if (messagePowerListAbility2 == null) {
                    C0QSJ c0qsjJp = Jp();
                    if (c0qsjJp != null) {
                        messagePowerListAbility = (MessagePowerListAbility) c0qsjJp.getAbility(MessagePowerListAbility.class);
                        C687700QyG.LJ(messagePowerListAbility, MessagePowerListAbility.class);
                    } else {
                        messagePowerListAbility = null;
                    }
                    this.LLLLLLL = messagePowerListAbility;
                    return messagePowerListAbility;
                }
            }
        }
        return messagePowerListAbility2;
    }

    public final void cleanup() {
        AnonymousClass0956 anonymousClass0956 = this.LLLILZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C09AE c09ae = this.LLLJL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ValueAnimator valueAnimator = this.LLLIZZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnonymousClass0956 anonymousClass09562 = this.LLLLIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        Animator animator = this.LLLLILI;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLLLLLJ;
        if (animator2 != null) {
            animator2.cancel();
        }
        Long l = this.LLLLIILL;
        if (l != null) {
            dq().vQ2(l.longValue());
        }
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LIZIZ(EnumC1355300lNA.VOICE_MESSAGE);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        View view = this.LLL;
        if (view != null) {
            view.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC913860ZtA) this.LLLF.getValue());
        }
        this.LLL = null;
        cleanup();
    }

    public final IMVoiceTranscriptViewModel dq() {
        return (IMVoiceTranscriptViewModel) this.LLJLILLLLZIIL.getValue(this, LLLLLZIL[2]);
    }

    public final C423680GjO fq() {
        return (C423680GjO) this.LLLIIIIL.getValue();
    }

    public final LinearLayout iq() {
        return (LinearLayout) this.LLLIIL.getValue();
    }

    public final boolean op() {
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ == null) {
            return true;
        }
        EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.VOICE_MESSAGE;
        businessCapabilityServiceLIZ.LIZ(enumC1355300lNA);
        if (!C1355270lN7.LIZIZ(businessCapabilityServiceLIZ.LJFF(enumC1355300lNA, Collections.singleton(EnumC1355290lN9.AUDIO_FOCUS), new C1360910lWD(Collections.singleton(EnumC1355300lNA.VOICE_CALL), new InterfaceC1360930lWF() { // from class: X.0ZWz
            @Override // X.InterfaceC1360930lWF
            public final void LIZ(EnumC1355300lNA enumC1355300lNA2, Set set) {
                C0ZX0 c0zx0 = (C0ZX0) this.LIZ.LLLL.LIZLLL().getValue();
                if (c0zx0 instanceof C0ZX4) {
                    this.LIZ.LLLL.LIZIZ(((C0ZX4) c0zx0).LIZ);
                }
            }
        })))) {
            return true;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
        c1389890mGx.LJIIIZ(2131832241);
        c1389890mGx.LJIIJJI();
        return false;
    }

    public final C21415118rN tq() {
        C21415118rN c21415118rN = this.LLLILZ;
        if (c21415118rN == null) {
            c21415118rN = new C21415118rN(LJJIJL().getContext(), null, 6);
            this.LLLILZ = c21415118rN;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21415118rN);
            c21415118rN.setAlpha(0.0f);
            FrameLayout frameLayoutVp = Vp();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(48.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(48.0f))), 8388691);
            C724270Sb3 c724270Sb3 = this.LLJI;
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJJIJ().LIZIZ)));
            C724270Sb3 c724270Sb32 = this.LLJI;
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) (c724270Sb32 != null ? c724270Sb32.LL : null)).LJII().LIZ.LIZLLL)));
            frameLayoutVp.addView(c21415118rN, layoutParams);
        }
        return c21415118rN;
    }

    public final C0ZXH vq() {
        int i;
        C0ZXH c0zxh = this.LLLIL;
        if (c0zxh != null) {
            return c0zxh;
        }
        FrameLayout frameLayout = new FrameLayout(LJJIJL().getContext());
        C786410Ut5.U4(frameLayout, 0.0f);
        FrameLayout frameLayoutVp = Vp();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f))), 8388691);
        C724270Sb3 c724270Sb3 = this.LLJI;
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJJIJ().LIZIZ)));
        C724270Sb3 c724270Sb32 = this.LLJI;
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) (c724270Sb32 != null ? c724270Sb32.LL : null)).LJII().LIZ.LIZLLL)));
        frameLayoutVp.addView(frameLayout, layoutParams);
        C0GW5 c0gw5 = new C0GW5(LJJIJL().getContext());
        int i2 = C899770ZRn.LIZ[((C0ZXC) bo()).LJJJJJ().ordinal()];
        if (i2 == 1) {
            i = Aq().LIZJ;
        } else {
            if (i2 != 2) {
                throw new C1954807lC();
            }
            i = qq().LIZJ;
        }
        c0gw5.setTintColor(i);
        frameLayout.addView(c0gw5, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f))), 17));
        C0ZXH c0zxh2 = new C0ZXH(frameLayout, c0gw5);
        this.LLLIL = c0zxh2;
        return c0zxh2;
    }

    public final View wq() {
        int i;
        View view = this.LLLIILIL;
        if (view == null) {
            view = new View(LJJIJL().getContext());
            this.LLLIILIL = view;
            C786410Ut5.T4(view, 0.0f);
            C724270Sb3 c724270Sb3 = this.LLJI;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJJIJ().LIZ)));
            iq().setPadding(iq().getPaddingLeft(), iq().getPaddingTop(), iq().getPaddingRight(), 0);
            LinearLayout linearLayoutIq = iq();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f))));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f))));
            layoutParams.topMargin = iLIZIZ;
            linearLayoutIq.addView(view, layoutParams);
            int i2 = C899770ZRn.LIZ[((C0ZXC) bo()).LJJJJJ().ordinal()];
            if (i2 == 1) {
                i = Aq().LJFF;
            } else {
                if (i2 != 2) {
                    throw new C1954807lC();
                }
                i = qq().LJFF;
            }
            view.setBackgroundColor(i);
        }
        return view;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLLLLLZIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLLLLLZIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SingleChatInputViewModel.class, new AObjectS389S0100000_14(this, 38)}, defaultViewModelProviderFactory);
                    this.LLLLLLLZIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        cleanup();
    }

    public static int jq(Layout layout) {
        int lineCount = layout.getLineCount();
        int iMax = 0;
        for (int i = 0; i < lineCount; i++) {
            iMax = Math.max(iMax, (int) Math.ceil(layout.getLineRight(i) - layout.getLineLeft(i)));
        }
        return iMax;
    }

    public final void Eq(String str) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        char cCharAt;
        if (str.length() != 0 && 1424 <= (cCharAt = str.charAt(0)) && cCharAt < 1792) {
            i = 8388693;
        } else {
            i = 8388691;
        }
        C21415118rN c21415118rNTq = tq();
        Context context = C1383370m6R.LIZ;
        ViewGroup.LayoutParams layoutParams2 = c21415118rNTq.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null && layoutParams.gravity != i) {
            layoutParams.gravity = i;
            C786410Ut5.W5(c21415118rNTq, layoutParams);
        }
    }

    public final int Ip(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, Vp().getContext());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final <T> T Tp(int i) {
        return (T) LJJIJL().findViewById(i);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public final void up(C0ZXC c0zxc) {
        if (c0zxc.LJII().LIZJ instanceof C0ZXU) {
            this.LLJLL.LIZJ(c0zxc.LLILII().LIZ.LIZ, "voice_assem");
        }
        this.LLLLIILL = Long.valueOf(c0zxc.LLILII().LIZ.LIZ.getMsgId());
        yp(c0zxc);
        Ap(c0zxc, false);
        tp(c0zxc.LJII(), false);
        up(c0zxc);
        zp(c0zxc);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(true);
        }
        view.addOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC913860ZtA) this.LLLF.getValue());
        this.LLL = view;
    }

    public final void up(C0ZXC c0zxc) {
        C0ZXF c0zxfAq;
        C0GW5 c0gw5;
        int i = C899770ZRn.LIZ[c0zxc.LJJJJJ().ordinal()];
        if (i != 1) {
            if (i == 2) {
                c0zxfAq = qq();
            } else {
                throw new C1954807lC();
            }
        } else {
            c0zxfAq = Aq();
        }
        C423680GjO c423680GjOFq = fq();
        int i2 = c0zxfAq.LIZ;
        int i3 = c0zxfAq.LIZIZ;
        c423680GjOFq.LLILLJJLI.setColor(i2);
        c423680GjOFq.LLILLL.setColor(i3);
        c423680GjOFq.invalidate();
        Wp().setTextColor(c0zxfAq.LIZJ);
        Qp(c0zxfAq);
        C0GWB c0gwb = (C0GWB) this.LLLII.getValue();
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
        int i4 = c0zxfAq.LJIIIIZZ;
        int i5 = c0zxfAq.LJII;
        c0gwb.LLILLJJLI = fLIZIZ;
        c0gwb.LLILZ = i4;
        c0gwb.LLILLL = i5;
        View view = this.LLLIILIL;
        if (view != null) {
            view.setBackgroundColor(c0zxfAq.LJFF);
        }
        C0ZXH c0zxh = this.LLLIL;
        if (c0zxh != null && (c0gw5 = c0zxh.LIZIZ) != null) {
            c0gw5.setTintColor(c0zxfAq.LIZJ);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZXC c0zxc) {
        return true;
    }

    public final void xq(C899820ZRs c899820ZRs) {
        fq().LIZ();
        Wp().setText(c899820ZRs.LIZJ.LIZJ);
        ((ViewAnimator) this.LLLIIIL.getValue()).setDisplayedChild(0);
    }

    public final void yp(C0ZXC c0zxc) {
        String strUp;
        C899820ZRs c899820ZRsLLJ = c0zxc.LLJ();
        fq().set(c899820ZRsLLJ.LIZ);
        AnonymousClass0956 anonymousClass0956 = this.LLLILZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C09AE c09ae = this.LLLJL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLLJ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C786410Ut5.I7(null, (View) this.LLLFFI.getValue());
        C786410Ut5.R7(iq(), null);
        C899830ZRt c899830ZRt = c899820ZRsLLJ.LIZIZ;
        if (!LLLLZI) {
            zq(c0zxc);
        }
        TuxTextView tuxTextViewWp = Wp();
        IMVoiceMessageUtil.LIZ.getClass();
        if (((List) IMVoiceMessageUtil.LIZJ.getValue()).contains(c899820ZRsLLJ.LIZIZ.LIZ) && Intrinsics.LJFF(c899820ZRsLLJ.LIZIZ.LIZ, LLLLZ)) {
            strUp = c899820ZRsLLJ.LIZJ.LIZJ;
        } else {
            C0ZX0 c0zx0 = (C0ZX0) this.LLLL.LIZLLL().getValue();
            if (Intrinsics.LJFF(c0zx0, C458470HyP.LIZ)) {
                strUp = c899820ZRsLLJ.LIZJ.LIZJ;
            } else if (c0zx0 instanceof C0ZX4) {
                if (Intrinsics.LJFF(((C0ZX4) c0zx0).LIZ, c899830ZRt.LIZ)) {
                    strUp = Up();
                } else {
                    strUp = c899820ZRsLLJ.LIZJ.LIZJ;
                }
            } else if (c0zx0 instanceof C0ZX6) {
                if (Intrinsics.LJFF(((C0ZX6) c0zx0).LIZ, c899830ZRt.LIZ)) {
                    strUp = Up();
                } else {
                    strUp = c899820ZRsLLJ.LIZJ.LIZJ;
                }
            } else if (c0zx0 instanceof C901180ZWy) {
                strUp = c899820ZRsLLJ.LIZJ.LIZJ;
            } else {
                throw new C1954807lC();
            }
        }
        tuxTextViewWp.setText(strUp);
        AwS143S0400000_14 awS143S0400000_14 = new AwS143S0400000_14(this, c899830ZRt, c899820ZRsLLJ, c0zxc, 1);
        C786410Ut5.I7(new ACListenerS149S0100000_14(awS143S0400000_14, 25), (View) this.LLLFFI.getValue());
        C786410Ut5.R7(iq(), new ACListenerS149S0100000_14(awS143S0400000_14, 26));
        this.LLLILZJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0ZX3(this, c899830ZRt, c899820ZRsLLJ, c0zxc, null), 3);
        String uuid = c0zxc.LLILII().LIZ.LIZ.getUuid();
        ConcurrentHashMap<String, C2230008oU> concurrentHashMap = C2230108oV.LIZ;
        if (concurrentHashMap.get(uuid) != null) {
            concurrentHashMap.remove(c0zxc.LLILII().LIZ.LIZ.getUuid());
            lq(c0zxc.LLILII().LIZ.LIZ, c899820ZRsLLJ, C0ZSK.LIZ);
        }
    }

    public final void yq(C899820ZRs c899820ZRs) {
        if (!((Boolean) C140200gC.LIZ.getValue()).booleanValue()) {
            AnonymousClass0956 anonymousClass0956 = this.LLLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLLJIL = null;
            return;
        }
        C899830ZRt c899830ZRt = c899820ZRs.LIZIZ;
        String str = c899830ZRt.LIZ;
        String str2 = c899830ZRt.LIZIZ;
        if ((str2 == null || str2.length() == 0) && !new C0VSJ(str).exists()) {
            AnonymousClass0956 anonymousClass09562 = this.LLLJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLLJIL = str;
            fq().LIZ();
            ((ViewAnimator) this.LLLIIIL.getValue()).setDisplayedChild(2);
            Wp().setText(c899820ZRs.LIZJ.LIZJ);
            this.LLLJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0ZX1(this, str, c899820ZRs, null), 3);
        }
    }

    public final void zp(C0ZXC c0zxc) {
        if (c0zxc.LJLLILLLL()) {
            IMVoiceTranscriptViewModel iMVoiceTranscriptViewModelDq = dq();
            View view = this.LLLLIILLL;
            if (view == null) {
                Object parent = LJJIJL().getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                while (!(view instanceof InterceptingConstraintLayout)) {
                    Object parent2 = view.getParent();
                    if (!(parent2 instanceof View) || (view = (View) parent2) == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                this.LLLLIILLL = (InterceptingConstraintLayout) view;
            }
            long msgId = c0zxc.LLILII().LIZ.LIZ.getMsgId();
            List<C0IC4> list = iMVoiceTranscriptViewModelDq.LLILZ;
            if ((list instanceof Collection) && list.isEmpty()) {
                iMVoiceTranscriptViewModelDq.LLILZ = C13LP.LJLILLLLZI(new C0IC4(msgId, view), iMVoiceTranscriptViewModelDq.LLILZ);
            } else {
                Iterator<C0IC4> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LIZIZ == msgId) {
                        break;
                    }
                }
                iMVoiceTranscriptViewModelDq.LLILZ = C13LP.LJLILLLLZI(new C0IC4(msgId, view), iMVoiceTranscriptViewModelDq.LLILZ);
            }
        } else {
            dq().vQ2(c0zxc.LLILII().LIZ.LIZ.getMsgId());
        }
        dq().wQ2();
    }

    public final void zq(C0ZXC c0zxc) {
        if (new C0VSJ(c0zxc.LLJ().LIZIZ.LIZ).exists()) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1598406Nq c1598406Nq = this.LLLLLLLLLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLLLLLLLLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLLLLLLLLL = c1598406Nq;
                }
            }
        }
        C23250099c.LIZLLL(lifecycleScope, c1598406Nq.LIZ, null, new C0ZX5(c0zxc, null), 2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZXC c0zxc) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ap(X.C0ZXC r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem.Ap(X.0ZXC, boolean):void");
    }

    public final void Dq(boolean z, boolean z2) {
        Animator animator = this.LLLLLLJ;
        if (animator != null) {
            animator.cancel();
        }
        if (z2) {
            if (z || this.LLLILZ != null) {
                this.LLLLLLJ = Fp(tq(), z);
                return;
            }
            return;
        }
        if (z) {
            C21415118rN c21415118rNTq = tq();
            int visibility = c21415118rNTq.getVisibility();
            c21415118rNTq.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c21415118rNTq);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21415118rNTq);
            c21415118rNTq.setAlpha(1.0f);
            return;
        }
        C21415118rN c21415118rN = this.LLLILZ;
        if (c21415118rN == null) {
            return;
        }
        int visibility2 = c21415118rN.getVisibility();
        c21415118rN.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c21415118rN);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21415118rN);
        c21415118rN.setAlpha(0.0f);
    }

    public final void Ep(IMVoiceTranscribeModel iMVoiceTranscribeModel, boolean z) {
        int i;
        C444830HcP c444830HcP = new C444830HcP();
        int iLJFF = this.LLLL.LJFF();
        boolean zLIZIZ = C960203pA.LIZIZ(Vp().getContext());
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(C0I6Y.LIZ((InterfaceC461380I7k) bo()));
        if (zLIZIZ) {
            if (zLJJJJIZL) {
                i = this.LLLLJ;
            } else {
                i = this.LLLLJI;
            }
        } else if (zLJJJJIZL) {
            i = this.LLLLL;
        } else {
            i = this.LLLLLIL;
        }
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        for (IMVoiceTranscribeModel.Hints hints : iMVoiceTranscribeModel.hints) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                IMVoiceTranscribeModel.Hints hints2 = hints;
                long j = iLJFF;
                if (j >= hints2.startTimeMs && j <= hints2.endTimeMs) {
                    i3 = (int) hints2.startIndex;
                    i4 = (int) hints2.endIndex;
                    i2 = i5;
                }
                i5 = i6;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (z) {
            this.LLLLLILLIL = i2;
            this.LLLLLJIL.LIZ = 0L;
        } else if (i2 != this.LLLLLILLIL) {
            C0ZXJ c0zxj = this.LLLLLJIL;
            c0zxj.getClass();
            c0zxj.LIZ = System.currentTimeMillis();
            this.LLLLLILLIL = i2;
        }
        SpannableString spannableString = new SpannableString(iMVoiceTranscribeModel.transcript);
        if (i3 >= 0 && i3 < iMVoiceTranscribeModel.transcript.length() && i4 >= 0 && i4 < iMVoiceTranscribeModel.transcript.length()) {
            this.LLLLLJIL.getClass();
            C786410Ut5.p2(spannableString, new BackgroundColorSpan(Color.argb(C13LZ.LJ((int) (((i >> 24) & 255) * C13LZ.LIZLLL((System.currentTimeMillis() - r0.LIZ) / 200, 0.0f, 1.0f)), 0, 255), (i >> 16) & 255, (i >> 8) & 255, i & 255)), i3, i4 + 1, 17);
        }
        c444830HcP.LJIILIIL(spannableString);
        c444830HcP.LJIILJJIL(qq().LIZJ);
        c444830HcP.LJII(111);
        c444830HcP.LIZIZ.LJ = Xp() - Bp();
        tq().setTextLayout(c444830HcP.LIZIZ());
    }

    public final Animator Fp(View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        fArr[0] = view.getAlpha();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        fArr[1] = f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(LLLLLZL);
        objectAnimatorOfFloat.addListener(new AAListenerS65S0110000_14(view, z, 1));
        objectAnimatorOfFloat.addListener(new AAListenerS65S0110000_14(view, z, 0));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    public final void Fq(boolean z, boolean z2) {
        Animator animator = this.LLLLLL;
        if (animator != null) {
            animator.cancel();
        }
        if (z2) {
            if (z || this.LLLIILIL != null) {
                this.LLLLLL = Fp(wq(), z);
                return;
            }
            return;
        }
        if (z) {
            View viewWq = wq();
            C786410Ut5.LJLLLLLL(0, viewWq);
            C786410Ut5.T4(viewWq, 1.0f);
        } else {
            View view = this.LLLIILIL;
            if (view == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view);
            C786410Ut5.T4(view, 0.0f);
        }
    }

    public final void Gq(boolean z, boolean z2) {
        FrameLayout frameLayout;
        Animator animator = this.LLLLLLIL;
        if (animator != null) {
            animator.cancel();
        }
        if (z2) {
            if (z || this.LLLIL != null) {
                this.LLLLLLIL = Fp(vq().LIZ, z);
                return;
            }
            return;
        }
        if (z) {
            FrameLayout frameLayout2 = vq().LIZ;
            C786410Ut5.LJZ(0, frameLayout2);
            C786410Ut5.U4(frameLayout2, 1.0f);
        } else {
            C0ZXH c0zxh = this.LLLIL;
            if (c0zxh == null || (frameLayout = c0zxh.LIZ) == null) {
                return;
            }
            C786410Ut5.LJZ(8, frameLayout);
            C786410Ut5.U4(frameLayout, 0.0f);
        }
    }

    public final void sp(int i, int i2) {
        iq().setPadding(iq().getPaddingLeft(), i, iq().getPaddingRight(), i2);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZXC c0zxc = (C0ZXC) interfaceC1587906Jp;
        AnonymousClass0956 anonymousClass0956 = this.LLLILZLLLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C461530I7z) it2.next()).LIZIZ);
            }
            ArrayList<C0ZXG> arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof C0ZXG) {
                    arrayList3.add(obj2);
                }
            }
            for (C0ZXG c0zxg : arrayList3) {
                if (c0zxg.LIZ) {
                    yp(c0zxc);
                }
                if (c0zxg.LIZIZ) {
                    tp(c0zxc.LJII(), true);
                }
                if (c0zxg.LIZJ) {
                    Ap(c0zxc, true);
                }
                if (c0zxg.LIZLLL) {
                    up(c0zxc);
                }
                if (c0zxg.LJ) {
                    zp(c0zxc);
                }
            }
        } else {
            up(c0zxc);
        }
        this.LLLILZLLLI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0ZXA(this, c0zxc, null), 3);
    }

    public void tp(C0ZXS c0zxs, boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        FrameLayout frameLayout;
        FrameLayout frameLayoutVp = Vp();
        if (frameLayoutVp != null) {
            frameLayoutVp.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0zxs.LIZIZ.LIZ))));
            frameLayoutVp.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0zxs.LIZIZ.LIZIZ))));
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj7 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) obj).LJII().LIZ.LIZIZ)));
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) obj2).LJII().LIZ.LIZLLL)));
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) obj3).LJJIJ().LIZ)));
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) obj4).LJJIJ().LIZIZ)));
        FrameLayout frameLayoutVp2 = Vp();
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        } else {
            obj5 = null;
        }
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) obj5).LJII().LIZ.LIZ)));
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj6 = c724270Sb36.LL;
        } else {
            obj6 = null;
        }
        frameLayoutVp2.setPadding(iLIZIZ5, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((C0ZXC) obj6).LJII().LIZ.LIZJ))), 0);
        LinearLayout linearLayoutIq = iq();
        if (this.LLLIILIL == null) {
            i = iLIZIZ2;
        } else {
            i = 0;
        }
        linearLayoutIq.setPadding(0, iLIZIZ, 0, i);
        ((View) this.LLLFFI.getValue()).setPadding(0, 0, 0, 0);
        View view = this.LLLIILIL;
        if (view != null) {
            C1383370m6R.LJIILL(view, iLIZIZ3, 0, 14);
        }
        C0ZXH c0zxh = this.LLLIL;
        if (c0zxh != null && (frameLayout = c0zxh.LIZ) != null) {
            C1383370m6R.LJIILL(frameLayout, iLIZIZ4, iLIZIZ2, 12);
        }
        C21415118rN c21415118rN = this.LLLILZ;
        if (c21415118rN != null) {
            C1383370m6R.LJIILL(c21415118rN, iLIZIZ4, iLIZIZ2, 12);
        }
        C724270Sb3 c724270Sb37 = this.LLJI;
        if (c724270Sb37 != null) {
            obj7 = c724270Sb37.LL;
        }
        Ap((C0ZXC) obj7, z);
    }

    public final void Bq(final int i, final int i2, boolean z) {
        Animator animator = this.LLLLLJLJLL;
        if (animator != null) {
            animator.cancel();
        }
        if (z) {
            final int width = Vp().getWidth();
            final int height = Vp().getHeight();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ZXD
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    FrameLayout frameLayoutVp = this.LL.Vp();
                    int i3 = width;
                    int i4 = i;
                    int i5 = height;
                    int i6 = i2;
                    ViewGroup.LayoutParams layoutParams = frameLayoutVp.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i3 + ((int) ((i4 - i3) * animatedFraction));
                        layoutParams.height = i5 + ((int) ((i6 - i5) * animatedFraction));
                        C786410Ut5.W5(frameLayoutVp, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            });
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.setInterpolator(LLLLLZL);
            valueAnimatorOfFloat.start();
            this.LLLLLJLJLL = valueAnimatorOfFloat;
            return;
        }
        FrameLayout frameLayoutVp = Vp();
        ViewGroup.LayoutParams layoutParams = frameLayoutVp.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            C786410Ut5.W5(frameLayoutVp, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void lq(C869590Y9l c869590Y9l, C899820ZRs c899820ZRs, C0ZSJ c0zsj) {
        if (Gp() || !op()) {
            return;
        }
        if (((C432800Gy6) ((C05YD) this.LLJZ.getValue()).getValue()).LJII != EnumC432940GyK.NONE) {
            C458200Hxy c458200HxyXQ2 = ((SingleChatInputViewModel) this.LLJLLIL.getValue(this, LLLLLZIL[3])).xQ2();
            Context context = Vp().getContext();
            c458200HxyXQ2.LJJIIJ().LJIIIZ();
            Animator animator = c458200HxyXQ2.LJJIIJ;
            if (animator != null) {
                animator.cancel();
            }
            c458200HxyXQ2.LJJIJIIJI(AFwS236S0000000_6.get$arr$(554));
            c458200HxyXQ2.LJJIFFI().LIZ(context);
        }
        ((IMVoiceTranscriptPlaybackViewModel) this.LLLLIIL.getValue(this, LLLLLZIL[4])).wQ2(Vp().getContext(), c869590Y9l, c899820ZRs, ((C457780HxI) this.LLJLIL.getValue()).LL, c0zsj, null);
    }
}
