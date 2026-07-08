package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0IK5;
import X.C0JT6;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C158B;
import X.C1833640xog;
import X.C1834350xpp;
import X.C1834580xqC;
import X.C1835390xrV;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C426320Gne;
import X.C452080Ho6;
import X.C452501pT;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C737910Sx3;
import X.C783270Uo1;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ARunnableS127S0100000_27;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightPageRefactorSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUserPostHighlightSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveHighlightVideoCell extends PowerCell<C1834580xqC> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 370));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 368));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 385));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 383));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 389));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 387));
    public View LLIZ;
    public C426320Gne LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxIconView LLJI;
    public final AssemVMLazy LLJIJIL;
    public int LLJILJIL;
    public final ARunnableS127S0100000_27 LLJILJILJ;
    public final ARunnableS127S0100000_27 LLJILLL;
    public final long LLJJ;
    public final ARunnableS127S0100000_27 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveHighlightVideoCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/highlight/viewmodel/LiveHighlightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.de1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLIZ = this.itemView.findViewById(R.id.nnp);
        this.LLIZLLLIL = (C426320Gne) this.itemView.findViewById(R.id.lno);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.message_tv);
        this.LLJI = (TuxIconView) this.itemView.findViewById(R.id.lti);
        C786410Ut5.I7(new AkS94S0100000_27(this, 9), this.itemView);
        AssemViewModel.asyncSubscribe$default(L5(), new C2217381BqS() { // from class: X.0xqH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1834780xqW) obj).LLILZ;
            }
        }, this, null, null, null, new AwS606S0100000_27(this, 130), 28, null);
    }

    public LiveHighlightVideoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveHighlightViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 392);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(79);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 373), awS571S0100000_27, AFwS216S0000000_27.get$arr$(128), new AwS571S0100000_27((C03K6) this, 374), new AwS571S0100000_27((C03K6) this, 376), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 378), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 380), null, new AwS571S0100000_27((C03K6) this, 381));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C03K6) this, 375);
            AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 377);
            AwS571S0100000_27 awS571S0100000_274 = new AwS571S0100000_27(c19719912DlLIZ, 379);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_272, 20));
            AwS571S0100000_27 awS571S0100000_275 = new AwS571S0100000_27(c01gwLIZIZ, 382);
            AwS571S0100000_27 awS571S0100000_276 = new AwS571S0100000_27(c01gwLIZIZ, 384);
            AwS571S0100000_27 awS571S0100000_277 = new AwS571S0100000_27(c01gwLIZIZ, 386);
            AwS571S0100000_27 awS571S0100000_278 = new AwS571S0100000_27(c01gwLIZIZ, 388);
            AwS571S0100000_27 awS571S0100000_279 = new AwS571S0100000_27(c01gwLIZIZ, 390);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_274, awS571S0100000_27, new C452080Ho6(), awS571S0100000_275, awS571S0100000_276, awS571S0100000_273, aFwS269S0000000_27, awS571S0100000_277, awS571S0100000_278, awS571S0100000_279);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 391), awS571S0100000_27, AFwS216S0000000_27.get$arr$(129), new AwS571S0100000_27((C03K6) this, 393), new AwS571S0100000_27((C03K6) this, 394), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 395), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 396), null, new AwS571S0100000_27((C03K6) this, 397));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 398), awS571S0100000_27, AFwS216S0000000_27.get$arr$(130), new AwS571S0100000_27((C03K6) this, 367), new AwS571S0100000_27((C03K6) this, 369), new AwS571S0100000_27((C03K6) this, 371), aFwS269S0000000_27, null, null, new AwS571S0100000_27((C03K6) this, 372));
        }
        this.LLJIJIL = assemVMLazy;
        this.LLJILJILJ = new ARunnableS127S0100000_27(this, 25);
        this.LLJILLL = new ARunnableS127S0100000_27(this, 24);
        C1834580xqC item = getItem();
        this.LLJJ = (item != null ? (long) item.LLJILJIL : 150L) * ((long) 2) * ((long) 60) * 1000;
        this.LLJJI = new ARunnableS127S0100000_27(this, 23);
    }

    public final TuxTextView I5() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public final LiveHighlightViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (LiveHighlightViewModel) assemVMLazy.getValue();
    }

    public final void N5() {
        C0IK5.LIZLLL(this.LLJILJILJ);
        C0IK5.LIZLLL(this.LLJILLL);
        C783270Uo1.LJFF(this.LLJJI);
        this.LLJILJIL = 0;
        C500260Jjc.LJIILIIL(this.LLIZ);
        C500260Jjc.LJIILIIL(this.LLJI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C0IK5.LIZLLL(this.LLJILJILJ);
        C783270Uo1.LJFF(this.LLJJI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1834580xqC c1834580xqC) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c1834580xqC.LLILZIL);
        c1331670kl3LJIIIZ.LJJ((SmartImageView) this.LL.getValue());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        if (c1834580xqC.LLILZLL.length() == 0) {
            C500260Jjc.LJIILIIL(I5());
        } else {
            C500260Jjc.LLFFF(I5());
            I5().setText(c1834580xqC.LLILZLL);
            I5().setHorizontalFadingEdgeEnabled(true);
        }
        S5(c1834580xqC);
        V5(c1834580xqC);
        T5(c1834580xqC);
        U5(c1834580xqC);
    }

    public final boolean R5(C1834580xqC c1834580xqC) {
        Long lValueOf;
        Long lValueOf2 = null;
        if (c1834580xqC != null) {
            lValueOf = Long.valueOf(c1834580xqC.LLILZ);
        } else {
            lValueOf = null;
        }
        C1834580xqC c1834580xqCLIZ = L5().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null) {
            lValueOf2 = Long.valueOf(c1834580xqCLIZ.LLILZ);
        }
        return Intrinsics.LJFF(lValueOf, lValueOf2);
    }

    public final void S5(C1834580xqC c1834580xqC) {
        if (R5(c1834580xqC)) {
            C500260Jjc.LLFFF((View) this.LLILLJJLI.getValue());
            I5().setMarqueeRepeatLimit(-1);
            I5().setSelected(true);
            I5().setFocusable(true);
            I5().setEllipsize(TextUtils.TruncateAt.MARQUEE);
            if (this.LLJILJIL == 100) {
                C486790J7d.LIZLLL(this.LLJILLL, null, 2000L);
                C1834580xqC item = getItem();
                if (item != null) {
                    item.LLJJLIIIJLLLLLLLZ = false;
                }
            } else {
                TuxIconView tuxIconView = this.LLJI;
                if (tuxIconView != null && C500260Jjc.LJJJJIZL(tuxIconView)) {
                    C486790J7d.LIZLLL(this.LLJILLL, null, 2000L);
                    C1834580xqC item2 = getItem();
                    if (item2 != null) {
                        item2.LLJL = false;
                    }
                }
            }
        } else {
            C786410Ut5.LJLLLLLL(4, (View) this.LLILLJJLI.getValue());
            I5().setSelected(false);
            I5().setEllipsize(TextUtils.TruncateAt.END);
        }
        if (LiveUserPostHighlightSetting.INSTANCE.getValue()) {
            if (c1834580xqC.LLJJIJIL == 4 && c1834580xqC.LLJJJ > 0) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd", Locale.ENGLISH);
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                ((TextView) this.LLILZLL.getValue()).setText(simpleDateFormat.format(new Date(c1834580xqC.LLJJJ * ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                C500260Jjc.LLFFF((View) this.LLILZLL.getValue());
                return;
            }
            C500260Jjc.LJIILIIL((View) this.LLILZLL.getValue());
            return;
        }
        C500260Jjc.LJIILIIL((View) this.LLILZLL.getValue());
    }

    public final void T5(C1834580xqC c1834580xqC) {
        if (LiveReplayHighlightPageRefactorSetting.INSTANCE.isV3()) {
            if (c1834580xqC.LLJJI) {
                C500260Jjc.LLFFF((View) this.LLILZIL.getValue());
                ((TextView) this.LLILZIL.getValue()).setText(C497740JfY.LJIJI(2131843939));
            } else {
                C500260Jjc.LJIILIIL((View) this.LLILZIL.getValue());
            }
        }
    }

    public final void U5(C1834580xqC c1834580xqC) {
        Long lValueOf;
        Long lValueOf2;
        if (c1834580xqC.LLJJL) {
            N5();
            return;
        }
        int i = c1834580xqC.LLJJJJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    N5();
                    return;
                }
                if (c1834580xqC.LLJL) {
                    C0IK5.LIZLLL(this.LLJILJILJ);
                    C783270Uo1.LJFF(this.LLJJI);
                    C1834580xqC item = getItem();
                    if (item != null) {
                        lValueOf2 = Long.valueOf(item.LLILZ);
                    } else {
                        lValueOf2 = null;
                    }
                    C1835390xrV.LIZ(lValueOf2);
                    this.LLJILJIL = 0;
                    C500260Jjc.LJIILIIL(this.LLIZ);
                    C500260Jjc.LLFFF(this.LLJI);
                    if (R5(getItem())) {
                        C486790J7d.LIZLLL(this.LLJILLL, null, 2000L);
                        C1834580xqC item2 = getItem();
                        if (item2 != null) {
                            item2.LLJL = false;
                        }
                    }
                    C1833640xog.LIZ.getClass();
                    C1833640xog.LIZLLL("fail", "highlight_clips");
                    return;
                }
                N5();
                return;
            }
            if (c1834580xqC.LLJJLIIIJLLLLLLLZ) {
                C0IK5.LIZLLL(this.LLJILJILJ);
                C783270Uo1.LJFF(this.LLJJI);
                C1834580xqC item3 = getItem();
                if (item3 != null) {
                    lValueOf = Long.valueOf(item3.LLILZ);
                } else {
                    lValueOf = null;
                }
                C1835390xrV.LIZ(lValueOf);
                this.LLJILJIL = 100;
                C426320Gne c426320Gne = this.LLIZLLLIL;
                if (c426320Gne != null) {
                    c426320Gne.LIZ(100, false);
                }
                TuxTextView tuxTextView = this.LLJ;
                if (tuxTextView != null) {
                    tuxTextView.setText(C497740JfY.LJIJJ(2131855653, "100"));
                }
                C500260Jjc.LLFFF(this.LLIZ);
                if (R5(getItem())) {
                    C486790J7d.LIZLLL(this.LLJILLL, null, 2000L);
                    C1834580xqC item4 = getItem();
                    if (item4 != null) {
                        item4.LLJJLIIIJLLLLLLLZ = false;
                    }
                }
                C1833640xog.LIZ.getClass();
                C1833640xog.LIZLLL("success", "highlight_clips");
                return;
            }
            N5();
            return;
        }
        C1834580xqC item5 = getItem();
        if (item5 == null) {
            return;
        }
        long j = item5.LLILZ;
        Integer numLIZJ = C1835390xrV.LIZJ(j);
        C1834350xpp.LIZ.getClass();
        C0JT6<Map<Long, Long>> c0jt6 = C1834350xpp.LJIIIIZZ;
        Map<Long, Long> mapLIZ = c0jt6.LIZ();
        if (mapLIZ == null) {
            mapLIZ = new LinkedHashMap<>();
        }
        if (numLIZJ == null) {
            this.LLJILJIL = 0;
            mapLIZ.put(Long.valueOf(j), Long.valueOf(C158B.LIZJ()));
            c0jt6.LIZJ(mapLIZ);
        } else {
            this.LLJILJIL = numLIZJ.intValue();
        }
        C500260Jjc.LLFFF(this.LLIZ);
        this.LLJILJILJ.run();
        C786410Ut5.LJLIIL(this.LLJJ, C783270Uo1.LIZJ(), this.LLJJI);
    }

    public final void V5(C1834580xqC c1834580xqC) {
        int i;
        if (c1834580xqC.LLIZ != 2) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (c1834580xqC.LLIZ == 1) {
                i = R.raw.icon_hourglass;
            } else {
                i = R.raw.icon_video_slash;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            ((TuxIconView) this.LLILZ.getValue()).setTuxIcon(c419910GdJ);
            C500260Jjc.LLFFF((View) this.LLILZ.getValue());
            C786410Ut5.u5((SmartImageView) this.LL.getValue(), 0.3f);
            return;
        }
        C500260Jjc.LJIILIIL((View) this.LLILZ.getValue());
        C786410Ut5.u5((SmartImageView) this.LL.getValue(), 1.0f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1834580xqC c1834580xqC = (C1834580xqC) interfaceC1891350zJl;
        if ((!list.isEmpty()) && (ListProtector.get(list, 0) instanceof Integer)) {
            if (Intrinsics.LJFF(ListProtector.get(list, 0), 1)) {
                S5(c1834580xqC);
                return;
            }
            if (Intrinsics.LJFF(ListProtector.get(list, 0), 2)) {
                V5(c1834580xqC);
                return;
            } else if (Intrinsics.LJFF(ListProtector.get(list, 0), 3)) {
                T5(c1834580xqC);
                return;
            } else {
                if (!Intrinsics.LJFF(ListProtector.get(list, 0), 4)) {
                    return;
                }
                U5(c1834580xqC);
                return;
            }
        }
        onBindItemView(c1834580xqC);
    }
}
