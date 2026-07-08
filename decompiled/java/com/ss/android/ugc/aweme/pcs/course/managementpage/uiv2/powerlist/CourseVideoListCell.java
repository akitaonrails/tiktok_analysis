package com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist;

import X.AbstractC1433460nPE;
import X.C01GW;
import X.C0JH1;
import X.C0JH5;
import X.C0JH6;
import X.C0JH7;
import X.C0JHC;
import X.C0JHG;
import X.C1220000hqw;
import X.C1324720kZq;
import X.C13LE;
import X.C1433450nPD;
import X.C1554960qZC;
import X.C1697506kn;
import X.C16F5;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20337914i1;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426320Gne;
import X.C452070Ho5;
import X.C452501pT;
import X.C488450JDn;
import X.C488530JDv;
import X.C489110JGb;
import X.C489350JGz;
import X.C492390JSr;
import X.C497740JfY;
import X.C500260Jjc;
import X.C635860Owq;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC489200JGk;
import Y.ACListenerS111S0200000_7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.live.pcs.course.model.CreatePcsAwemeResponse;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS11S1310000_7;
import kotlin.jvm.internal.AwS121S1100000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS499S0200000_7;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class CourseVideoListCell extends PowerCell<C488530JDv> {
    public final C736950SvV LL;
    public final C736950SvV LLILLJJLI;
    public final C736950SvV LLILLL;
    public C0JHC LLILZ;
    public C1324720kZq LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public LiveIconView LLIZLLLIL;
    public C16F5 LLJ;
    public C426320Gne LLJI;
    public C16F5 LLJIJIL;
    public LiveIconView LLJILJIL;
    public final C01GW LLJILJILJ;
    public InterfaceC489200JGk LLJILLL;
    public boolean LLJJ;

    public final PcsCourseManageVM I5() {
        return (PcsCourseManageVM) this.LLILLJJLI.getValue();
    }

    public final C0JHC L5() {
        if (this.LLILZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLILZ = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZ;
    }

    public final void S5() {
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131855831));
            c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezv, c16f5.getContext()));
        }
    }

    public final void U5() {
        C0JH6 c0jh6LJIJJ;
        AbstractC1433460nPE abstractC1433460nPE;
        InterfaceC489200JGk interfaceC489200JGk = this.LLJILLL;
        if (interfaceC489200JGk == null) {
            return;
        }
        this.LLILLL.getValue();
        String strLIZJ = interfaceC489200JGk.LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        C0JH7 c0jh7VQ2 = PcsVideoPublishVM.vQ2(strLIZJ);
        if (c0jh7VQ2 != null && (abstractC1433460nPE = c0jh7VQ2.LIZIZ) != null) {
            N5(abstractC1433460nPE, interfaceC489200JGk);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateUploadProgressRelatedUi, videoTitle: ");
        C16F5 c16f5 = this.LLILZLL;
        sbLIZ.append((Object) (c16f5 != null ? c16f5.getText() : null));
        sbLIZ.append(", uploadStatus: ");
        sbLIZ.append(interfaceC489200JGk.LJIIIIZZ());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C489350JGz.LIZ[interfaceC489200JGk.LJIIIIZZ().ordinal()];
        if (i == 1) {
            C426320Gne c426320Gne = this.LLJI;
            if (c426320Gne != null) {
                C500260Jjc.LLFFF(c426320Gne);
            }
            C500260Jjc.LLFFF(this.LLJIJIL);
            C500260Jjc.LJIILIIL((View) this.LLJILJILJ.getValue());
            C426320Gne c426320Gne2 = this.LLJI;
            if (c426320Gne2 != null) {
                c426320Gne2.LIZ(c0jh7VQ2 != null ? c0jh7VQ2.LIZ : 0.0f, false);
            }
            C16F5 c16f52 = this.LLJIJIL;
            if (c16f52 != null) {
                Object[] objArr = new Object[1];
                objArr[0] = String.valueOf(c0jh7VQ2 != null ? c0jh7VQ2.LIZ : 0);
                c16f52.setText(C497740JfY.LJIJJ(2131855827, objArr));
            }
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
            C500260Jjc.LJIILIIL(this.LLIZ);
            C1324720kZq c1324720kZq = this.LLILZIL;
            if (c1324720kZq == null || interfaceC489200JGk.LJIJJ() == null) {
                return;
            }
            c1324720kZq.setImageBitmap(null);
            c1324720kZq.setImageURI("");
            return;
        }
        if (i == 2) {
            C500260Jjc.LJIILIIL(this.LLJI);
            C500260Jjc.LJIILIIL(this.LLJIJIL);
            C500260Jjc.LJIILIIL((View) this.LLJILJILJ.getValue());
            C500260Jjc.LLFFF(this.LLIZLLLIL);
            C500260Jjc.LLFFF(this.LLIZ);
            C1324720kZq c1324720kZq2 = this.LLILZIL;
            if (c1324720kZq2 != null && (c0jh6LJIJJ = interfaceC489200JGk.LJIJJ()) != null) {
                C0JH5.LIZ(c0jh6LJIJJ, c1324720kZq2);
            }
            T5(false);
            LiveIconView liveIconView = this.LLIZLLLIL;
            if (liveIconView != null) {
                P5(liveIconView, interfaceC489200JGk);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4) {
                C500260Jjc.LJIILIIL(this.LLJI);
                C500260Jjc.LJIILIIL(this.LLJIJIL);
                C500260Jjc.LJIILIIL((View) this.LLJILJILJ.getValue());
                return;
            } else {
                if (i != 5) {
                    throw new C1954807lC();
                }
                C500260Jjc.LJIILIIL(this.LLJI);
                C500260Jjc.LJIILIIL(this.LLJIJIL);
                C500260Jjc.LJIILIIL((View) this.LLJILJILJ.getValue());
                return;
            }
        }
        C500260Jjc.LJIILIIL(this.LLJI);
        C500260Jjc.LJIILIIL(this.LLJIJIL);
        C500260Jjc.LLFFF(this.LLIZLLLIL);
        C500260Jjc.LLFFF(this.LLIZ);
        C1324720kZq c1324720kZq3 = this.LLILZIL;
        if (c1324720kZq3 != null && interfaceC489200JGk.LJIJJ() != null) {
            c1324720kZq3.setImageBitmap(null);
            c1324720kZq3.setImageURI("");
        }
        View view = (View) this.LLJILJILJ.getValue();
        if (view != null) {
            C500260Jjc.LLFFF(view);
            C786410Ut5.I7(new AbS499S0200000_7(this, interfaceC489200JGk, 1), view);
        }
        LiveIconView liveIconView2 = this.LLIZLLLIL;
        if (liveIconView2 != null) {
            R5(liveIconView2, interfaceC489200JGk);
        }
    }

    public CourseVideoListCell() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsVideoReEditVm.class);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(154);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LL = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS237S0000000_7, null, null, null);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(155), null, null, null);
        this.LLILLL = new C736950SvV(C13LE.LIZ(PcsVideoPublishVM.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(156), null, null, null);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 387));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZIL = (C1324720kZq) this.itemView.findViewById(R.id.video_cover);
        this.LLILZLL = (C16F5) this.itemView.findViewById(R.id.video_title);
        this.LLIZ = (C16F5) this.itemView.findViewById(R.id.video_length);
        this.LLIZLLLIL = (LiveIconView) this.itemView.findViewById(R.id.a23);
        this.LLJ = (C16F5) this.itemView.findViewById(R.id.w18);
        this.LLJI = (C426320Gne) this.itemView.findViewById(R.id.video_upload_progress_bar);
        this.LLJIJIL = (C16F5) this.itemView.findViewById(R.id.video_upload_progress_tv);
        this.LLJILJIL = (LiveIconView) this.itemView.findViewById(R.id.oy4);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
    }

    public final void T5(boolean z) {
        int i;
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            if (z) {
                i = 2131855833;
            } else {
                i = 2131855832;
            }
            c16f5.setText(C497740JfY.LJIJI(i));
            c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezy, c16f5.getContext()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CharSequence text;
        CharSequence text2;
        Drawable drawableLIZ;
        boolean z;
        C0JH1 c0jh1LJIIIIZZ;
        PcsCourseManageVM pcsCourseManageVMI5;
        C0JH1 c0jh1LJIIIIZZ2;
        InterfaceC489200JGk interfaceC489200JGk;
        Integer numValueOf;
        C16F5 c16f5;
        LinkedHashMap linkedHashMap;
        Long lValueOf;
        boolean z2;
        C0JH1 c0jh1LJIIIIZZ3;
        C1324720kZq c1324720kZq;
        InterfaceC489200JGk interfaceC489200JGk2;
        C0JH6 c0jh6LJIJJ;
        String strLIZ;
        String strLJIILIIL;
        InterfaceC489200JGk interfaceC489200JGk3;
        C0JH1 c0jh1LJIIIIZZ4;
        Drawable drawableLIZ2;
        String strLIZJ;
        C0JH1 c0jh1LJIIIIZZ5;
        CharSequence text3;
        C488530JDv c488530JDv = (C488530JDv) interfaceC1891350zJl;
        super.onBindItemView(c488530JDv);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindItemView, videoTitle: ");
        C16F5 c16f52 = this.LLILZLL;
        Long lValueOf2 = null;
        if (c16f52 != null) {
            text = c16f52.getText();
        } else {
            text = null;
        }
        sbLIZ.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILLL = c488530JDv.LL;
        this.LLJJ = c488530JDv.LLILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("syncUploadResultIfNeeded, videoTitle: ");
        C16F5 c16f53 = this.LLILZLL;
        if (c16f53 != null) {
            text2 = c16f53.getText();
        } else {
            text2 = null;
        }
        sbLIZ2.append((Object) text2);
        C2188811AlT.LIZIZ(sbLIZ2);
        InterfaceC489200JGk interfaceC489200JGk4 = this.LLJILLL;
        if (interfaceC489200JGk4 != null && (strLIZJ = interfaceC489200JGk4.LIZJ()) != null && strLIZJ.length() != 0 && ((c0jh1LJIIIIZZ5 = interfaceC489200JGk4.LJIIIIZZ()) == null || !c0jh1LJIIIIZZ5.isUploaded())) {
            this.LLILLL.getValue();
            C0JH7 c0jh7VQ2 = PcsVideoPublishVM.vQ2(strLIZJ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("syncUploadResultIfNeeded, videoTitle: ");
            C16F5 c16f54 = this.LLILZLL;
            if (c16f54 != null) {
                text3 = c16f54.getText();
            } else {
                text3 = null;
            }
            sbLIZ3.append((Object) text3);
            sbLIZ3.append(", progress: ");
            sbLIZ3.append(c0jh7VQ2);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (c0jh7VQ2 != null) {
                AbstractC1433460nPE abstractC1433460nPE = c0jh7VQ2.LIZIZ;
                if (abstractC1433460nPE != null) {
                    N5(abstractC1433460nPE, interfaceC489200JGk4);
                } else {
                    C0JH1 c0jh1LJIIIIZZ6 = interfaceC489200JGk4.LJIIIIZZ();
                    C0JH1 c0jh1 = C0JH1.UPLOAD_IN_PROGRESS;
                    if (c0jh1LJIIIIZZ6 != c0jh1) {
                        interfaceC489200JGk4.LJIILL(c0jh1);
                    }
                }
            }
        }
        boolean z3 = c488530JDv.LLILLJJLI;
        Integer numValueOf2 = Integer.valueOf(R.attr.exx);
        int i = 8;
        if (z3) {
            View view = this.itemView;
            Context context = getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = numValueOf2;
                c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(22));
                c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(22));
                drawableLIZ2 = c384050F3z.LIZ(context);
            } else {
                drawableLIZ2 = null;
            }
            view.setBackground(drawableLIZ2);
            this.itemView.setPadding((int) C418440Gaw.LIZIZ(16), (int) C418440Gaw.LIZIZ(8), (int) C418440Gaw.LIZIZ(16), (int) C418440Gaw.LIZIZ(16));
        } else {
            View view2 = this.itemView;
            Context context2 = getContext();
            if (context2 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = numValueOf2;
                c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(0));
                c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(0));
                drawableLIZ = c384050F3z2.LIZ(context2);
            } else {
                drawableLIZ = null;
            }
            view2.setBackground(drawableLIZ);
            this.itemView.setPadding((int) C418440Gaw.LIZIZ(16), (int) C418440Gaw.LIZIZ(8), (int) C418440Gaw.LIZIZ(16), (int) C418440Gaw.LIZIZ(8));
        }
        InterfaceC489200JGk interfaceC489200JGk5 = this.LLJILLL;
        if (interfaceC489200JGk5 != null && (c0jh1LJIIIIZZ4 = interfaceC489200JGk5.LJIIIIZZ()) != null && c0jh1LJIIIIZZ4.isUploaded()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (interfaceC489200JGk3 = this.LLJILLL) != null) {
            String strLIZJ2 = interfaceC489200JGk3.LIZJ();
            if (strLIZJ2 == null) {
                strLIZJ2 = "";
            }
            if (strLIZJ2.length() != 0) {
                ((PcsVideoPublishVM) this.LLILLL.getValue()).N02(strLIZJ2, new AwS121S1100000_7(this, strLIZJ2, 5));
            }
        }
        C16F5 c16f55 = this.LLILZLL;
        if (c16f55 != null) {
            InterfaceC489200JGk interfaceC489200JGk6 = this.LLJILLL;
            if (interfaceC489200JGk6 != null) {
                strLJIILIIL = interfaceC489200JGk6.LJIILIIL();
            } else {
                strLJIILIIL = null;
            }
            c16f55.setText(strLJIILIIL);
        }
        C16F5 c16f56 = this.LLIZ;
        if (c16f56 != null) {
            InterfaceC489200JGk interfaceC489200JGk7 = this.LLJILLL;
            if (interfaceC489200JGk7 != null) {
                strLIZ = C488450JDn.LIZ(interfaceC489200JGk7);
            } else {
                strLIZ = null;
            }
            c16f56.setText(strLIZ);
        }
        InterfaceC489200JGk interfaceC489200JGk8 = this.LLJILLL;
        if (interfaceC489200JGk8 != null && (c0jh1LJIIIIZZ3 = interfaceC489200JGk8.LJIIIIZZ()) != null && c0jh1LJIIIIZZ3.isUploaded() && (c1324720kZq = this.LLILZIL) != null && (interfaceC489200JGk2 = this.LLJILLL) != null && (c0jh6LJIJJ = interfaceC489200JGk2.LJIJJ()) != null) {
            C0JH5.LIZ(c0jh6LJIJJ, c1324720kZq);
        }
        C1324720kZq c1324720kZq2 = this.LLILZIL;
        if (c1324720kZq2 != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 22), c1324720kZq2);
        }
        C489110JGb.LJIIJJI(L5(), this.LLJILLL, "", "show");
        U5();
        InterfaceC489200JGk interfaceC489200JGk9 = this.LLJILLL;
        if (interfaceC489200JGk9 != null) {
            c0jh1LJIIIIZZ = interfaceC489200JGk9.LJIIIIZZ();
        } else {
            c0jh1LJIIIIZZ = null;
        }
        if (c0jh1LJIIIIZZ == C0JH1.UPLOAD_SUCCESS_PUBLISHED_TO_COURSE && (interfaceC489200JGk = this.LLJILLL) != null && (numValueOf = Integer.valueOf(interfaceC489200JGk.LIZLLL())) != null) {
            if (numValueOf.intValue() == 2) {
                InterfaceC489200JGk interfaceC489200JGk10 = this.LLJILLL;
                if (interfaceC489200JGk10 != null && interfaceC489200JGk10.LJIL()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                T5(z2);
            } else if (numValueOf.intValue() == 3) {
                InterfaceC489200JGk interfaceC489200JGk11 = this.LLJILLL;
                if (interfaceC489200JGk11 != null && interfaceC489200JGk11.LJIL()) {
                    C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.k9;
                    Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                    if (mapLIZIZ != null) {
                        linkedHashMap = new LinkedHashMap(mapLIZIZ);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    InterfaceC489200JGk interfaceC489200JGk12 = this.LLJILLL;
                    if (interfaceC489200JGk12 != null) {
                        lValueOf = Long.valueOf(interfaceC489200JGk12.LJ(true));
                    } else {
                        lValueOf = null;
                    }
                    Object obj = linkedHashMap.get(String.valueOf(lValueOf));
                    Boolean bool = Boolean.FALSE;
                    if (!Intrinsics.LJFF(obj, bool)) {
                        S5();
                        InterfaceC489200JGk interfaceC489200JGk13 = this.LLJILLL;
                        if (interfaceC489200JGk13 != null) {
                            lValueOf2 = Long.valueOf(interfaceC489200JGk13.LJ(true));
                        }
                        linkedHashMap.put(String.valueOf(lValueOf2), bool);
                        c20337914i1.LJFF(C2097608Jq.LJIIZILJ(linkedHashMap));
                    }
                } else {
                    S5();
                }
            } else if (numValueOf.intValue() == 1) {
                C16F5 c16f57 = this.LLJ;
                if (c16f57 != null) {
                    c16f57.setText(C497740JfY.LJIJI(2131855830));
                    c16f57.setTextColor(C20736316Cj.LIZIZ(R.attr.f03, c16f57.getContext()));
                }
            } else if (numValueOf.intValue() == 4) {
                C500260Jjc.LLFFF(this.LLJILJIL);
                C16F5 c16f58 = this.LLJ;
                if (c16f58 != null) {
                    AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 668);
                    String strLJIJI = C497740JfY.LJIJI(2131855818);
                    C1697506kn.LIZ(c16f58, strLJIJI, C497740JfY.LJIJJ(2131855817, strLJIJI), 8, R.attr.ezq, R.attr.ezt, new AwS408S0200000_7(awS551S0100000_7, this, 57));
                }
            } else if (numValueOf.intValue() == 5) {
                C16F5 c16f59 = this.LLJ;
                if (c16f59 != null) {
                    c16f59.setText(C497740JfY.LJIJI(2131855789));
                    c16f59.setTextColor(C20736316Cj.LIZIZ(R.attr.ezu, c16f59.getContext()));
                }
            } else if (numValueOf.intValue() == 0 && (c16f5 = this.LLJ) != null) {
                C500260Jjc.LJIILIIL(c16f5);
            }
        }
        LiveIconView liveIconView = this.LLJILJIL;
        if (liveIconView != null) {
            InterfaceC489200JGk interfaceC489200JGk14 = this.LLJILLL;
            if (interfaceC489200JGk14 != null && interfaceC489200JGk14.isMute()) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, liveIconView);
        }
        InterfaceC489200JGk interfaceC489200JGk15 = this.LLJILLL;
        if (interfaceC489200JGk15 != null && (c0jh1LJIIIIZZ2 = interfaceC489200JGk15.LJIIIIZZ()) != null && c0jh1LJIIIIZZ2.isUploaded()) {
            if (interfaceC489200JGk15.LJIJI() != 2 && interfaceC489200JGk15.LJIIL() != 2) {
                P5(this.LLIZLLLIL, interfaceC489200JGk15);
            } else {
                R5(this.LLIZLLLIL, interfaceC489200JGk15);
            }
        }
        InterfaceC489200JGk interfaceC489200JGk16 = this.LLJILLL;
        if (interfaceC489200JGk16 != null && (pcsCourseManageVMI5 = I5()) != null) {
            pcsCourseManageVMI5.HQ2(interfaceC489200JGk16, new AwS586S0100000_7(this, 424));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dcf, false, 4, null);
    }

    public final void N5(AbstractC1433460nPE abstractC1433460nPE, InterfaceC489200JGk interfaceC489200JGk) {
        CreatePcsAwemeResponse createPcsAwemeResponse;
        C0JHG c0jhg;
        if (abstractC1433460nPE instanceof C492390JSr) {
            interfaceC489200JGk.LJIILL(C0JH1.UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE);
            CreateBaseAwemeResponse createBaseAwemeResponse = ((C492390JSr) abstractC1433460nPE).LIZ;
            CreatePcsAwemeResponse.Data data = null;
            if (createBaseAwemeResponse instanceof CreatePcsAwemeResponse) {
                createPcsAwemeResponse = (CreatePcsAwemeResponse) createBaseAwemeResponse;
            } else {
                createPcsAwemeResponse = null;
            }
            if ((interfaceC489200JGk instanceof C0JHG) && (c0jhg = (C0JHG) interfaceC489200JGk) != null) {
                if (createPcsAwemeResponse != null) {
                    data = createPcsAwemeResponse.data;
                }
                c0jhg.LJFF = data;
            }
            if (I5() != null) {
                PcsCourseManageVM.IQ2(interfaceC489200JGk);
                return;
            }
            return;
        }
        if (!(abstractC1433460nPE instanceof C1433450nPD)) {
            return;
        }
        interfaceC489200JGk.LJIILL(C0JH1.UPLOAD_FAILED);
    }

    public final void P5(final LiveIconView liveIconView, final InterfaceC489200JGk interfaceC489200JGk) {
        if (liveIconView != null) {
            C500260Jjc.LLFFF(liveIconView);
            liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.dmc, liveIconView.getContext()));
            liveIconView.setIconTintAttr(R.attr.ezt);
            C635860Owq.LIZ.LIZJ(8, liveIconView);
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JGy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EnumC489120JGc enumC489120JGcWQ2;
                    boolean z;
                    int i;
                    String strLJIJI;
                    C0JHC c0jhcZQ2;
                    C19EG c19egLIZIZ;
                    int i2;
                    CourseVideoListCell courseVideoListCell = this.LL;
                    InterfaceC489200JGk interfaceC489200JGk2 = interfaceC489200JGk;
                    LiveIconView liveIconView2 = liveIconView;
                    if (courseVideoListCell.I5() != null) {
                        enumC489120JGcWQ2 = PcsCourseManageVM.wQ2(interfaceC489200JGk2.LJIJJLI());
                    } else {
                        enumC489120JGcWQ2 = null;
                    }
                    if (enumC489120JGcWQ2 == EnumC489120JGc.CAN_EDIT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (enumC489120JGcWQ2 == null) {
                        i = -1;
                    } else {
                        i = C489350JGz.LIZIZ[enumC489120JGcWQ2.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                strLJIJI = "";
                            } else {
                                strLJIJI = C497740JfY.LJIJI(2131855809);
                            }
                        } else {
                            strLJIJI = C497740JfY.LJIJI(2131855808);
                        }
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131855810);
                    }
                    Context context = courseVideoListCell.getContext();
                    if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                        C0HWQ c0hwq = new C0HWQ(context);
                        c0hwq.LLJ = true;
                        c0hwq.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
                        C443090HZb[] c443090HZbArr = new C443090HZb[3];
                        SpannableString spannableString = new SpannableString(C497740JfY.LJIJI(2131855807));
                        if (z) {
                            i2 = R.attr.ezq;
                        } else {
                            i2 = R.attr.ezt;
                        }
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(i2, context)), 0, spannableString.length(), 33);
                        c443090HZbArr[0] = new C443090HZb(spannableString, new AwS11S1310000_7(z, c19egLIZIZ, strLJIJI, courseVideoListCell, interfaceC489200JGk2, 0), 0, new AwS89S0110000_1(context, z, 21), 0, null, 0, true, false, null, 884);
                        c443090HZbArr[1] = new C443090HZb(C497740JfY.LJIJI(2131855856), new AwS408S0200000_7(courseVideoListCell, interfaceC489200JGk2, 58), R.raw.icon_arrow_to_top_fill, null, 0, null, 0, !courseVideoListCell.LLJJ, false, null, 888);
                        c443090HZbArr[2] = new C443090HZb(C497740JfY.LJIJI(2131855806), new AwS408S0200000_7(courseVideoListCell, interfaceC489200JGk2, 60), R.raw.icon_trash_bin_fill, null, 0, null, 1, false, false, null, 952);
                        c0hwq.LJIIL(Collections.singletonList(C1697810uHb.LJIIJJI(c443090HZbArr)));
                        C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                        c1391600mJi.LIZIZ = liveIconView2;
                        c1391600mJi.LJIIL = false;
                        c0hwq.LIZIZ().show();
                        C489110JGb.LJIIIZ(courseVideoListCell.L5(), "", "show");
                    }
                    PcsCourseManageVM pcsCourseManageVMI5 = this.LL.I5();
                    if (pcsCourseManageVMI5 != null) {
                        c0jhcZQ2 = pcsCourseManageVMI5.zQ2();
                    } else {
                        c0jhcZQ2 = null;
                    }
                    C489110JGb.LJIIJJI(c0jhcZQ2, interfaceC489200JGk, "more_operation", "click");
                }
            });
        }
    }

    public final void R5(LiveIconView liveIconView, InterfaceC489200JGk interfaceC489200JGk) {
        if (liveIconView != null) {
            liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.el2, liveIconView.getContext()));
            liveIconView.setIconTintAttr(R.attr.ezt);
            C786410Ut5.g8(liveIconView, new ACListenerS111S0200000_7(this, interfaceC489200JGk, 18));
        }
    }
}
