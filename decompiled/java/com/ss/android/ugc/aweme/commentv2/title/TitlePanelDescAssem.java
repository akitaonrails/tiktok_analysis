package com.ss.android.ugc.aweme.commentv2.title;

import X.C01GW;
import X.C041J;
import X.C08CX;
import X.C09AE;
import X.C0H9H;
import X.C0HD0;
import X.C0S5P;
import X.C0SBK;
import X.C0SKK;
import X.C0SW8;
import X.C0SXF;
import X.C0ZP4;
import X.C1308910kAL;
import X.C1341070l0D;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1440005kM;
import X.C1908730zln;
import X.C1954807lC;
import X.C19EG;
import X.C21415018rM;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C444830HcP;
import X.C452501pT;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C844470XAv;
import X.C946803n0;
import X.EnumC1260920iuw;
import X.InterfaceC1602300rnY;
import Y.ACListenerS146S0100000_11;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.os.Looper;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TitlePanelDescAssem extends UISlotAssem {
    public C427870Gq9 LLJJI;
    public TuxTextView LLJJIII;
    public C21415018rM LLJJIJI;
    public C1908730zln LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public LinearLayout LLJJJ;
    public TuxTextView LLJJJIL;
    public User LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public CharSequence LLJJL;
    public CharSequence LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C0ZP4 LLJLIL;
    public C0SW8 LLJZ;
    public String LLJZIJLIL;
    public final int LLL;
    public final C444830HcP LLLF;
    public final C01GW LLLFF;
    public C09AE LLLFFI;
    public CharSequence LLLFZ;
    public Future<?> LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final BPEAHandler LLLIIIIL;
    public final int LLJJJJ = (int) C0H9H.LIZ(32.0f);
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(55));
    public Set<String> LLJLL = C08CX.INSTANCE;
    public final Set<String> LLJLLIL = new LinkedHashSet();
    public final Map<String, Long> LLJLLL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a50;
    }

    public final CommentContextSource kp() {
        return (CommentContextSource) this.LLLII.getValue();
    }

    public TitlePanelDescAssem() {
        C844470XAv.LIZ.getClass();
        int iMax = Math.max(0, C418440Gaw.LIZLLL(C844470XAv.LIZ()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        this.LLL = iMax;
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LJII(41);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, C844470XAv.LIZ());
        c444830HcP.LJIILJJIL(numLIZJ != null ? numLIZJ.intValue() : 0);
        c444830HcP.LIZIZ.LJ = iMax;
        this.LLLF = c444830HcP;
        this.LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 84));
        this.LLLII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 82));
        this.LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 83));
        this.LLLIIIIL = new BPEAHandler(Looper.getMainLooper());
    }

    public final void lp() {
        if (C0HD0.LIZ()) {
            Set<String> set = this.LLJLL;
            C0SW8 c0sw8 = this.LLJZ;
            InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) this.LLJLILLLLZIIL.getValue();
            if ((!set.isEmpty()) && c0sw8 != null && interfaceC1602300rnY != null) {
                interfaceC1602300rnY.LJIILJJIL(c0sw8, "mention");
            }
            this.LLJLL = C08CX.INSTANCE;
            this.LLJLLIL.clear();
            ((LinkedHashMap) this.LLJLLL).clear();
            this.LLJZ = null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        lp();
        C0ZP4 c0zp4 = this.LLJLIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJLIL = null;
        C09AE c09ae = this.LLLFFI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLLFFI = null;
        Future<?> future = this.LLLI;
        if (future != null) {
            future.cancel(true);
        }
        this.LLLI = null;
        this.LLLIIIIL.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mp(java.lang.Integer r4) {
        /*
            r3 = this;
            com.bytedance.tux.input.TuxTextView r2 = r3.LLJJJIL
            if (r2 == 0) goto L1b
            if (r4 == 0) goto L1c
            int r1 = r4.intValue()
            android.view.View r0 = r3.getContentView()
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L1c
        L18:
            r2.setText(r0)
        L1b:
            return
        L1c:
            java.lang.String r0 = ""
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelDescAssem.mp(java.lang.Integer):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.0Iv4, X.0SW8] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.TitlePanelDescAssem.onViewCreated(android.view.View):void");
    }

    public final void op(C0S5P c0s5p) {
        C0SKK c0skk;
        int i;
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        if (c0s5p != null && (c0skk = c0s5p.LIZ) != null && (i = C0SBK.LIZ[c0skk.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C1954807lC();
                        }
                    } else {
                        mp(Integer.valueOf(R.string.suj));
                        TuxTextView tuxTextView2 = this.LLJJJIL;
                        if (tuxTextView2 != null) {
                            C786410Ut5.h9(tuxTextView2, new ACListenerS146S0100000_11(this, 61));
                        }
                        if (C041J.LIZ(this.LLJJLIIIJLLLLLLLZ)) {
                            hp(this.LLJJLIIIJLLLLLLLZ, false);
                            return;
                        }
                        return;
                    }
                } else {
                    TuxTextView tuxTextView3 = this.LLJJJIL;
                    if (tuxTextView3 != null) {
                        C786410Ut5.h9(tuxTextView3, null);
                        return;
                    }
                    return;
                }
            } else {
                mp(2131847255);
                TuxTextView tuxTextView4 = this.LLJJJIL;
                if (tuxTextView4 != null) {
                    C786410Ut5.h9(tuxTextView4, new ACListenerS146S0100000_11(this, 60));
                }
                if (C041J.LIZ(this.LLJJL)) {
                    hp(this.LLJJL, false);
                    return;
                }
                return;
            }
        }
        mp(null);
        TuxTextView tuxTextView5 = this.LLJJJIL;
        if (tuxTextView5 != null) {
            C786410Ut5.h9(tuxTextView5, null);
        }
    }

    public final void hp(CharSequence charSequence, boolean z) {
        if (!z && Intrinsics.LJFF(this.LLLFZ, charSequence)) {
            return;
        }
        this.LLLFZ = charSequence;
        Future<?> future = this.LLLI;
        if (future != null) {
            future.cancel(true);
        }
        this.LLLI = C823050WQl.LIZJ().submit(new ARunnableS75S0200000_6(charSequence, this, 31));
    }

    public final void ip(User user, String str) {
        String str2;
        Boolean boolValueOf;
        boolean zBooleanValue;
        Fragment fragmentLIZ;
        C19EG activity;
        Aweme aweme;
        String strEventType;
        CommentCommonModel commonModel;
        Comment comment = (Comment) this.LLLIIII.getValue();
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            Context context = getContentView().getContext();
            CommentContextSource commentContextSourceKp = kp();
            String cid = null;
            if (commentContextSourceKp != null && (commonModel = commentContextSourceKp.getCommonModel()) != null) {
                str2 = commonModel.eventType;
            } else {
                str2 = null;
            }
            C1351950lHl.LJJI(user, context, str2, null, str, EnumC1260920iuw.RELATION_LABEL, null, null, 8076);
            if (comment != null) {
                CommentContextSource commentContextSourceKp2 = kp();
                if (commentContextSourceKp2 != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceKp2);
                } else {
                    aweme = null;
                }
                CommentContextSource commentContextSourceKp3 = kp();
                if (commentContextSourceKp3 != null) {
                    strEventType = CommentContextSourceKt.eventType(commentContextSourceKp3);
                } else {
                    strEventType = null;
                }
                boolValueOf = Boolean.valueOf(C1341070l0D.LIZJ(comment, aweme, strEventType));
            } else {
                boolValueOf = null;
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceKp4 = kp();
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (comment != null) {
                cid = comment.getCid();
            }
            c1350920lG6.getClass();
            C1350920lG6.LJLJLJ(user, commentContextSourceKp4, zBooleanValue, str, cid, null);
            C1440005kM.LIZ(new C737030Svd(36));
            Context context2 = getContentView().getContext();
            if (context2 != null && C0SXF.LJIL(context2) && (fragmentLIZ = C946803n0.LIZ(getContentView())) != null && (activity = fragmentLIZ.getActivity()) != null) {
                activity.finish();
            }
        }
    }
}
