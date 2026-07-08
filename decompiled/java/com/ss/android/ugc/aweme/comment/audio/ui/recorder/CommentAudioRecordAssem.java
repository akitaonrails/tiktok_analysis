package com.ss.android.ugc.aweme.comment.audio.ui.recorder;

import X.AbstractC1347290lAF;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01GW;
import X.C09R3;
import X.C0HU6;
import X.C1341780l1M;
import X.C1341800l1O;
import X.C1342130l1v;
import X.C1344030l4z;
import X.C1347080l9u;
import X.C1347110l9x;
import X.C1348320lBu;
import X.C1350920lG6;
import X.C1351810lHX;
import X.C1352530lIh;
import X.C1352580lIm;
import X.C1352670lIv;
import X.C1383370m6R;
import X.C13LE;
import X.C13LQ;
import X.C1558520qew;
import X.C1637806bA;
import X.C19393310u3;
import X.C19719912Dl;
import X.C19746312Np;
import X.C1A5L;
import X.C21647019ng;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2344009Gk;
import X.C423700GjQ;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C583750Muz;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C726120Se2;
import X.C729510SjV;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1341650l19;
import X.EnumC1355290lN9;
import X.EnumC19746112Nn;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS121S0100000_21;
import android.media.AudioManager;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.vesdk.VEAudioRecorder;
import com.ss.android.vesdk.VERTAudioWaveformMgr;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentAudioRecordAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final C726120Se2 LLJJI = new C726120Se2();
    public final C01GW LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C423700GjQ LLJJIJIIJIL;
    public View LLJJIJIL;
    public TuxTextView LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public final C01GW LLJJJJJIL;
    public AbstractC1347290lAF LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public final float LLJLIL;
    public final float LLJLILLLLZIIL;
    public final Set<EnumC1355290lN9> LLJLL;
    public final List<C21647019ng> LLJLLIL;
    public final List<C21647019ng> LLJLLL;
    public ARunnableS106S0100000_6 LLJZ;
    public ARunnableS106S0100000_6 LLJZIJLIL;
    public ARunnableS121S0100000_21 LLL;
    public boolean LLLF;
    public AnonymousClass0956 LLLFF;
    public boolean LLLFFI;
    public final C1352530lIh LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentAudioRecordAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentAudioRecordAssem.class, "audioRecordVM", "getAudioRecordVM()Lcom/ss/android/ugc/aweme/comment/audio/ui/recorder/CommentAudioRecordViewModel;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a1d;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0lIh] */
    public CommentAudioRecordAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 6));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentAudioRecordViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ2, 510);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(57);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 511), aFwS259S0000000_21, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIJI = assemVMLazy;
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(96));
        this.LLJLIL = 438.65f;
        this.LLJLILLLLZIIL = 37.7f;
        this.LLJLL = C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.AUDIO_FOCUS, EnumC1355290lN9.MICROPHONE});
        this.LLJLLIL = new ArrayList();
        this.LLJLLL = new ArrayList();
        this.LLLFZ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.0lIh
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                if (i != 1) {
                    this.LL.op().vQ2();
                }
            }
        };
        this.LLLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 104));
        this.LLLII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(97));
    }

    public final void hp() {
        Iterator it2 = ((ArrayList) this.LLJLLIL).iterator();
        while (it2.hasNext()) {
            ((C21647019ng) it2.next()).LIZ();
        }
        ((ArrayList) this.LLJLLIL).clear();
        Iterator it3 = ((ArrayList) this.LLJLLL).iterator();
        while (it3.hasNext()) {
            ((C21647019ng) it3.next()).LIZ();
        }
        ((ArrayList) this.LLJLLL).clear();
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = this.LLJZ;
        if (aRunnableS106S0100000_6 != null) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS106S0100000_6);
        }
        this.LLJZ = null;
        ARunnableS106S0100000_6 aRunnableS106S0100000_62 = this.LLJZIJLIL;
        if (aRunnableS106S0100000_62 != null) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS106S0100000_62);
        }
        this.LLJZIJLIL = null;
    }

    public final void ip() {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = this.LLL;
        if (aRunnableS121S0100000_21 != null) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS121S0100000_21);
        }
        this.LLL = null;
    }

    public final void lp() {
        if (this.LLLF) {
            return;
        }
        this.LLLF = true;
        ip();
        if (Intrinsics.LJFF(tp().getState().LL, C1347080l9u.LIZ)) {
            CommentAudioRecordViewModel commentAudioRecordViewModelOp = op();
            C1352670lIv c1352670lIv = C1352670lIv.LIZ;
            C1352580lIm c1352580lIm = commentAudioRecordViewModelOp.LLILLJJLI;
            c1352670lIv.getClass();
            C1352670lIv.LJIIIIZZ = c1352580lIm;
            try {
                C1352670lIv.LIZLLL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startRecording failed: ");
                sbLIZ.append(e.getMessage());
                C1344030l4z.LIZ("CommentAudioRecordVM", C2188811AlT.LIZIZ(sbLIZ));
                commentAudioRecordViewModelOp.setState(AFwS259S0000000_21.get$arr$(353));
            }
        }
    }

    public final CommentAudioRecordViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
        return (CommentAudioRecordViewModel) assemVMLazy.getValue();
    }

    public final C583750Muz sp() {
        return (C583750Muz) this.LLJJJJJIL.getValue();
    }

    public final KeyboardVMV2 tp() {
        return (KeyboardVMV2) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1352670lIv.LIZ.getClass();
        C1352670lIv.LIZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLLF = true;
        ip();
        AnonymousClass0956 anonymousClass0956 = this.LLLFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFF = null;
        op();
        C1352670lIv.LIZ.getClass();
        if (C1352670lIv.LIZIZ(C1383370m6R.LIZ)) {
            ((ArrayList) C1352670lIv.LJFF).clear();
            VERTAudioWaveformMgr vERTAudioWaveformMgr = C1352670lIv.LIZJ;
            if (vERTAudioWaveformMgr != null) {
                vERTAudioWaveformMgr.reset();
            }
            VEAudioRecorder vEAudioRecorder = C1352670lIv.LIZIZ;
            if (vEAudioRecorder != null) {
                vEAudioRecorder.stopRecord();
            }
            C1352670lIv.LIZLLL = false;
        }
        C19393310u3.LIZ.remove(this.LLLFZ);
        ((C1351810lHX) this.LLLI.getValue()).LIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLLFFI = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLLFFI = false;
    }

    public final void yp() {
        AbstractC1347290lAF abstractC1347290lAF = tp().getState().LL;
        C1347080l9u c1347080l9u = C1347080l9u.LIZ;
        if (Intrinsics.LJFF(abstractC1347290lAF, c1347080l9u)) {
            KeyboardVMV2 keyboardVMV2Tp = tp();
            c1347080l9u.getClass();
            AbstractC1347290lAF abstractC1347290lAF2 = C1347080l9u.LIZIZ;
            if (abstractC1347290lAF2 == null) {
                abstractC1347290lAF2 = C1347110l9x.LIZ;
            }
            C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
            keyboardVMV2Tp.SQ2(abstractC1347290lAF2, false);
            if (!this.LLLFFI) {
                sp().LIZJ();
            }
        }
        sp().LIZ();
        C19393310u3.LIZ.remove(this.LLLFZ);
        ((C1351810lHX) this.LLLI.getValue()).LIZ();
    }

    public final String mp(int i) {
        try {
            return ((NumberFormat) this.LLLII.getValue()).format(Integer.valueOf(i));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return String.valueOf(i);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (C423700GjQ) view.findViewById(R.id.ef5);
        this.LLJJIJIL = view.findViewById(R.id.ef4);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.ecx);
        this.LLJJJIL = view.findViewById(R.id.ecy);
        this.LLJJJJ = view.findViewById(R.id.ecu);
        this.LLJJL = view.findViewById(R.id.ecv);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.ecw);
        View view2 = this.LLJJL;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS103S0100000_3(this, 85));
        }
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            HandlerHook.viewPost(view3, new ARunnableS103S0100000_3(this, 86));
        }
        C1341780l1M c1341780l1M = C1341780l1M.LIZ;
        View view4 = this.LLJJJIL;
        EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.BUTTON;
        C1341780l1M.LIZIZ(c1341780l1M, view4, enumC1341650l19, 0.0f, null, 12);
        C1341780l1M.LIZIZ(c1341780l1M, this.LLJJJJ, enumC1341650l19, 0.0f, null, 12);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        op().LL = C1558520qew.LJIIL(this);
        C2271391DvN.LIZ(LJJIJL(), (C1A5L) C2271381DvM.f249X.getValue());
        C2271391DvN.LIZ(this.LLJJJIL, (C1A5L) C2271381DvM.V.getValue());
        View view5 = this.LLJJJIL;
        if (view5 != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 17, 42), view5);
        }
        C2271391DvN.LIZ(this.LLJJJJ, (C1A5L) C2271381DvM.W.getValue());
        View view6 = this.LLJJJJ;
        if (view6 != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 18, 42), view6);
        }
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0lC8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 128), 4);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0lIj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352520lIg) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 129), 4);
        CommentAudioRecordViewModel commentAudioRecordViewModelOp = op();
        subscribe(commentAudioRecordViewModelOp, C736820SvI.LIZIZ(commentAudioRecordViewModelOp.usedInReusedScene), null, new AwS620S0100000_6(this, 130));
    }

    public final void zp(Function0<Unit> function0) {
        C1348320lBu c1348320lBu = C1348320lBu.LIZ;
        if (c1348320lBu.LIZJ()) {
            c1348320lBu.LIZIZ("start_audio_recording");
            sp().LIZIZ(function0, true);
        } else {
            sp().LIZIZ(function0, false);
        }
    }

    public static C21647019ng kp(CommentAudioRecordAssem commentAudioRecordAssem, View view, List list) {
        float f = commentAudioRecordAssem.LLJLIL;
        float f2 = commentAudioRecordAssem.LLJLILLLLZIIL;
        commentAudioRecordAssem.getClass();
        return new C21647019ng(view.getContext(), view, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(f), new C1342130l1v(f2)), list), false);
    }

    public final void up(String str, String str2, Float f, Long l) {
        Aweme aweme;
        String strEnterFrom;
        String strEnterMethod;
        String str3;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
        int i = 0;
        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
        String uid = null;
        if (commentContextSourceLIZ != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceLIZ);
        } else {
            aweme = null;
        }
        CommentContextSource commentContextSourceLIZ2 = this.LLJJI.LIZ(this);
        if (commentContextSourceLIZ2 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceLIZ2);
        } else {
            strEnterFrom = null;
        }
        CommentContextSource commentContextSourceLIZ3 = this.LLJJI.LIZ(this);
        if (commentContextSourceLIZ3 != null) {
            strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceLIZ3);
        } else {
            strEnterMethod = null;
        }
        c1350920lG6.getClass();
        if (aweme != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("event_page", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
            c2344009Gk.LJIIIIZZ("enter_method", strEnterMethod);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            User author2 = aweme.getAuthor();
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
            if (C729510SjV.LJJ(aweme)) {
                str3 = "story";
            } else {
                str3 = "post";
            }
            c2344009Gk.LJIIIIZZ("story_type", str3);
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics == null || statistics.getCommentCount() <= 0) {
                i = 1;
            }
            c2344009Gk.LIZJ(i, "is_zero_comment");
            c2344009Gk.LJIIIIZZ("input_box_status", "unfold");
            c2344009Gk.LJIIIIZZ("action_result", str);
            c2344009Gk.LJIIIIZZ("result_code", str2);
            c2344009Gk.LJ(f, "audio_volume");
            c2344009Gk.LJ(l, "audio_duration");
            C735840Sti.LIZIZ(aweme, c2344009Gk);
            C1350920lG6.LJJJ(c2344009Gk, "ttinter_audio_comment_record");
        }
    }
}
