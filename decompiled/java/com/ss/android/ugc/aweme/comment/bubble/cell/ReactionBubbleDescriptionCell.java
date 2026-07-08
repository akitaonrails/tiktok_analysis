package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.AbstractC1386130mAt;
import X.C04UD;
import X.C0DII;
import X.C0FJF;
import X.C0SBF;
import X.C0SQ0;
import X.C0SQ1;
import X.C0SQ2;
import X.C10EU;
import X.C1196320hEk;
import X.C1440005kM;
import X.C14EU;
import X.C1602160rnK;
import X.C19651011uW;
import X.C20684815ws;
import X.C21279718Pj;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C421180GfM;
import X.C431060GvI;
import X.C431080GvK;
import X.C431820GwW;
import X.C439870HMr;
import X.C444960Hcc;
import X.C622680Oba;
import X.C697110RWb;
import X.C720840SPi;
import X.C720880SPm;
import X.C720890SPn;
import X.C729510SjV;
import X.C735410St1;
import X.C735840Sti;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1355720lNq;
import X.InterfaceC665370Q7z;
import X.InterfaceC720940SPs;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public final class ReactionBubbleDescriptionCell extends ReactionBaseCell<C720890SPn> {
    public SmartImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C720840SPi LLILZLL;
    public C21279718Pj LLIZ;
    public C0FJF LLIZLLLIL;
    public TuxTextView LLJ;
    public C0SQ0 LLJI;
    public C0DII LLJIJIL;
    public C0SQ2 LLJILJIL;
    public C720890SPn LLJILJILJ;
    public TextView LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public C720880SPm LLJJIII;
    public C431820GwW LLJJIJI;

    public final String P5() {
        C720890SPn c720890SPn = this.LLJILJILJ;
        if (c720890SPn == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c720890SPn.LL);
        sbLIZ.append('_');
        sbLIZ.append(c720890SPn.LLILLJJLI.getUid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C0SQ2 c0sq2 = this.LLJILJIL;
        if (c0sq2 != null) {
            c0sq2.LL.onDestroy();
        }
        C622680Oba.LIZLLL(this);
    }

    public final void I5(Aweme aweme) {
        C421180GfM c421180GfM;
        if (aweme == null) {
            return;
        }
        View view = this.itemView;
        if ((view instanceof C421180GfM) && (c421180GfM = (C421180GfM) view) != null) {
            c421180GfM.setColors(null);
            c421180GfM.setPositions(null);
            c421180GfM.setLg(null);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            c421180GfM.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
    }

    public final void N5(C720890SPn c720890SPn) {
        int lineCount;
        String str;
        List<TextExtraStruct> textExtra;
        int length;
        int length2;
        String aid = c720890SPn.LLILLL.getAid();
        C720840SPi c720840SPi = this.LLILZLL;
        if (c720840SPi != null) {
            lineCount = c720840SPi.getLineCount();
        } else {
            lineCount = 0;
        }
        C1440005kM.LIZ(new C0SBF("bubble_desc_click_faker_cid", aid, Integer.valueOf(lineCount), true, 32));
        if (!this.LLJJI) {
            Aweme aweme = c720890SPn.LLILLL;
            C0SQ1 c0sq1 = c720890SPn.LLILZIL;
            if (c0sq1 != null) {
                str = c0sq1.LIZIZ;
            } else {
                str = null;
            }
            String desc = aweme.getDesc();
            if (desc != null && (textExtra = aweme.getTextExtra()) != null && desc.length() > 0) {
                Iterator<TextExtraStruct> it2 = textExtra.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TextExtraStruct next = it2.next();
                    if (next.getStart() >= 0 && next.getEnd() >= 0) {
                        int end = next.getEnd();
                        String desc2 = aweme.getDesc();
                        if (desc2 != null) {
                            length = desc2.length();
                        } else {
                            length = 0;
                        }
                        if (end <= length) {
                            int start = next.getStart();
                            String desc3 = aweme.getDesc();
                            if (desc3 != null) {
                                length2 = desc3.length();
                            } else {
                                length2 = 0;
                            }
                            if (start < length2 && next.getStart() < next.getEnd() && next.getType() == 0 && (!TextUtils.isEmpty(next.getAwemeId()) || 2 == next.getSubtype())) {
                                if (aweme.getDesc().charAt(next.getStart()) == '@' && 2 != next.getSubtype() && aweme.getAwemeType() == 51) {
                                    if (str == null) {
                                        str = "";
                                    }
                                    ShareDependService.LIZ.getClass();
                                    ShareDependServiceImpl.LJJJJI().LJJIJL(aweme, str);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.LLJJI = true;
        }
        R5(c720890SPn.LLILLJJLI, c720890SPn.LLILZIL);
    }

    public final void T5(C720890SPn c720890SPn) throws Throwable {
        String string;
        boolean z;
        String strLJJIFFI;
        PhotoModeImageInfo photoModeImageInfo;
        String title;
        if (c720890SPn == null) {
            return;
        }
        if (C729510SjV.LJJ(c720890SPn.LLILLL)) {
            string = this.itemView.getResources().getString(2131847319);
        } else {
            Aweme aweme = c720890SPn.LLILLL;
            if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
                string = this.itemView.getContext().getString(2131839824);
            } else {
                string = this.itemView.getContext().getString(2131833943);
            }
        }
        final C720840SPi c720840SPi = this.LLILZLL;
        if (c720840SPi != null) {
            Aweme aweme2 = c720890SPn.LLILLL;
            C0SQ1 c0sq1 = c720890SPn.LLILZIL;
            c720840SPi.LLJJJJJIL = aweme2;
            c720840SPi.LLJJJJLIIL = c0sq1;
            c720840SPi.LLJJJJ = false;
            String desc = aweme2.getDesc();
            if (desc != null && desc.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z && ((photoModeImageInfo = aweme2.getPhotoModeImageInfo()) == null || (title = photoModeImageInfo.getTitle()) == null || title.length() == 0)) {
                strLJJIFFI = u.LJJIFFI(string, " ", " ", false);
            } else {
                strLJJIFFI = u.LJJIFFI(aweme2.getDesc(), " ", " ", false);
            }
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(strLJJIFFI).append((CharSequence) c720840SPi.LJJJJJ(aweme2));
            if (!TextUtils.isEmpty(spannableStringBuilderAppend)) {
                c720840SPi.LJJJJLI(0, spannableStringBuilderAppend, false);
                int visibility = c720840SPi.getVisibility();
                c720840SPi.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c720840SPi);
                C439870HMr.LIZJ(c720840SPi, null);
            } else {
                int visibility2 = c720840SPi.getVisibility();
                c720840SPi.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c720840SPi);
            }
            Integer num = c720840SPi.LLJJLIIIJLLLLLLLZ;
            if (num != null) {
                c720840SPi.setTextColor(num.intValue());
            }
            c720840SPi.setSpanColor(c720840SPi.getCurrentTextColor());
            c720840SPi.setOnSpanClickListener(new InterfaceC1355720lNq() { // from class: X.0SPk
                @Override // X.InterfaceC1355720lNq
                public final void LIZ(TextExtraStruct textExtraStruct) {
                    Function0<Unit> spanClickInterceptor;
                    if (c720840SPi.getSpanClickInterceptor() != null && (spanClickInterceptor = c720840SPi.getSpanClickInterceptor()) != null) {
                        spanClickInterceptor.invoke();
                    }
                }
            });
            final Aweme aweme3 = c720840SPi.LLJJJJJIL;
            if (aweme3 != null) {
                try {
                    if (C444960Hcc.LIZJ(c720840SPi.getContext())) {
                        if (C431080GvK.LIZ == null) {
                            C431080GvK.LIZ = new C431080GvK();
                        }
                        c720840SPi.setMovementMethod(C431080GvK.LIZ);
                    } else {
                        c720840SPi.setMovementMethod(C431060GvI.LIZ());
                    }
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LIZ(e);
                }
                C786410Ut5.x3(c720840SPi.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0IA6
                    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onGlobalLayout() {
                        /*
                            Method dump skipped, instruction units count: 493
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0IA6.onGlobalLayout():void");
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x048c  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = null;
        View viewLJLLJ = C786410Ut5.LJLLJ(viewGroup.getContext(), R.layout.a4g, null);
        this.LLILLL = (SmartImageView) viewLJLLJ.findViewById(R.id.bh8);
        this.LLILZ = (TuxTextView) viewLJLLJ.findViewById(R.id.p0a);
        this.LLILZIL = (TuxTextView) viewLJLLJ.findViewById(R.id.xw4);
        this.LLILZLL = (C720840SPi) viewLJLLJ.findViewById(R.id.fmc);
        this.LLIZ = (C21279718Pj) viewLJLLJ.findViewById(R.id.q0v);
        this.LLIZLLLIL = (C0FJF) viewLJLLJ.findViewById(R.id.a7u);
        this.LLJI = (C0SQ0) viewLJLLJ.findViewById(R.id.cxm);
        this.LLJIJIL = (C0DII) viewLJLLJ.findViewById(R.id.cxa);
        this.LLJILJIL = (C0SQ2) viewLJLLJ.findViewById(R.id.oq5);
        this.LLJ = (TuxTextView) viewLJLLJ.findViewById(R.id.asr);
        this.LLJILLL = (TextView) viewLJLLJ.findViewById(R.id.ewu);
        this.LLJJIII = (C720880SPm) viewLJLLJ.findViewById(R.id.rdt);
        C622680Oba.LIZJ(this);
        if (C04UD.LIZ()) {
            interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        }
        C0SQ2 c0sq2 = this.LLJILJIL;
        if (c0sq2 != null) {
            c0sq2.LL.LL.LJJJLIIL(getCurrentLifecycleOwner(), interfaceC665370Q7zLIZ);
        }
        this.LLJJIJI = (C431820GwW) viewLJLLJ.findViewById(R.id.fhd);
        return viewLJLLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onPrivateModelEvent(C697110RWb c697110RWb) throws Throwable {
        String aid;
        Aweme aweme;
        Aweme aweme2 = c697110RWb.LIZIZ;
        if (aweme2 != null) {
            C720890SPn c720890SPn = (C720890SPn) getItem();
            Aweme aweme3 = null;
            if (c720890SPn != null && (aweme = c720890SPn.LLILLL) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, aweme2.getAid())) {
                T5((C720890SPn) getItem());
                C720890SPn c720890SPn2 = (C720890SPn) getItem();
                if (c720890SPn2 != null) {
                    aweme3 = c720890SPn2.LLILLL;
                }
                I5(aweme3);
            }
        }
    }

    public final void L5(User user, C0SQ1 c0sq1) {
        if (C10EU.LJIIZILJ(user.getUid())) {
            return;
        }
        if (c0sq1 != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C735410St1 c735410St1 = new C735410St1();
            c735410St1.LJIJI(c0sq1.LIZ);
            String str = c0sq1.LIZIZ;
            if (str == null) {
                str = "";
            }
            c735410St1.LIZLLL = str;
            c735410St1.LJJLIIIJILLIZJL = "click_head";
            c735410St1.LJJZZIII = "bullet";
            c735410St1.LJL = "bullet";
            c735410St1.LJJJLL = user.getFollowStatus();
            Object objLJIIIZ = c19651011uW.LJIIIZ(c0sq1.LIZ, c735410St1);
            Aweme aweme = c0sq1.LIZ;
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
        }
        R5(user, c0sq1);
        Context context = this.itemView.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(user.getUid());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.open();
    }

    public final void R5(User user, C0SQ1 c0sq1) {
        String str;
        String str2;
        Pair[] pairArr = new Pair[4];
        Aweme aweme = null;
        if (c0sq1 != null) {
            str = c0sq1.LIZIZ;
        } else {
            str = null;
        }
        pairArr[0] = new Pair(str, "enter_from");
        if (c0sq1 != null) {
            aweme = c0sq1.LIZ;
        }
        if (C729510SjV.LJJ(aweme)) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        pairArr[1] = new Pair(str2, "story_type");
        pairArr[2] = new Pair("creator", "notice_type");
        pairArr[3] = new Pair(user.getUid(), "from_user_id");
        C20684815ws.LJIJI("interaction_bullet_click", pairArr);
    }

    public static final void S5(C720890SPn c720890SPn, String str, InterfaceC720940SPs interfaceC720940SPs, String str2) {
        String str3;
        String strLIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C0SQ1 c0sq1 = c720890SPn.LLILZIL;
        if (c0sq1 != null) {
            str3 = c0sq1.LIZIZ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("group_id", c720890SPn.LLILLL.getAid());
        c2344009Gk.LJIIIIZZ("content", str);
        c2344009Gk.LJIIIIZZ("is_clickable", "1");
        c2344009Gk.LJIIIIZZ("container", "left_container");
        c2344009Gk.LJIIIIZZ("component_key", "left_container_social_bubble");
        if (interfaceC720940SPs == null || (strLIZ = interfaceC720940SPs.LIZ(c720890SPn.LLILLL)) == null) {
            strLIZ = "";
        }
        c2344009Gk.LJIIIIZZ("content_type", strLIZ);
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
    }
}
