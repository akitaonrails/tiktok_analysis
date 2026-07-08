package com.ss.android.ugc.aweme.tako.botpage.bottombox.actionbarsug;

import X.C03IT;
import X.C1163410gNf;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LC;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1854130yLj;
import X.C1854470yMH;
import X.C1855670yOD;
import X.C1855770yON;
import X.C1857690yRT;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoActionBarSugItemAssem extends ReusedUISlotAssem<TakoActionBarSugItemAssem> implements InterfaceC712990Rxx<C1854470yMH> {
    public View LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C1854470yMH LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fjz;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public static float op() {
        C1163410gNf.LIZ.getClass();
        return C1163410gNf.LIZJ() ? C418440Gaw.LIZIZ(999) : C418440Gaw.LIZIZ(8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        View view3;
        ViewGroup.LayoutParams layoutParams;
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.a1v);
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZ() && (view3 = this.LLJJLIIIJLLLLLLLZ) != null && (layoutParams = view3.getLayoutParams()) != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        View view4 = this.LLJJLIIIJLLLLLLLZ;
        if (view4 != null) {
            C786410Ut5.I7(new AkS64S0200000_27(this, view, 3), view4);
        }
        View view5 = this.LLJJLIIIJLLLLLLLZ;
        if (view5 != null) {
            C427690Gpr.LJ(view5, op());
        }
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            Context context = getContext();
            if (context != null && (view2 = this.LLJJLIIIJLLLLLLLZ) != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
                c384050F3z.LIZJ = Float.valueOf(op());
                view2.setBackground(c384050F3z.LIZ(context));
            }
        } else {
            View view6 = this.LLJJLIIIJLLLLLLLZ;
            if (view6 != null) {
                C1857690yRT.LJIILJJIL(view6, Float.valueOf(op()));
            }
        }
        this.LLJL = (TuxIconView) view.findViewById(R.id.a1u);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.a1w);
        if (tuxTextView != null) {
            if (C1163410gNf.LIZ()) {
                tuxTextView.setTuxFont(62);
            }
        } else {
            tuxTextView = null;
        }
        this.LLJLIL = tuxTextView;
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.a1t);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1854470yMH c1854470yMH) throws JSONException {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        String strLJJLIIIJ;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        List<BaseImage> listTG1;
        String str3;
        C1854470yMH c1854470yMH2 = c1854470yMH;
        this.LLJLL = c1854470yMH2;
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1854470yMH2.LL);
        }
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            TuxIconView tuxIconView = this.LLJL;
            if (tuxIconView != null) {
                C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(c1854470yMH2.LLJJ.getFirst()))), 0, 0, 0, false, 16);
            }
            TuxTextView tuxTextView2 = this.LLJLIL;
            if (tuxTextView2 != null) {
                C426750GoL.LJIIIZ(tuxTextView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(c1854470yMH2.LLJJ.getSecond()))), 0, 0, 0, false, 16);
            }
        }
        if (c1854470yMH2.LLILZ != null || ((str3 = c1854470yMH2.LLIZ) != null && C123100dR.LIZ(str3))) {
            TuxIconView tuxIconView2 = this.LLJL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            TuxIconView tuxIconView3 = this.LLJL;
            if (tuxIconView3 != null) {
                if (c1854470yMH2.LLILZ != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = c1854470yMH2.LLILZ.intValue();
                    C1163410gNf.LIZ.getClass();
                    if (C1163410gNf.LIZ()) {
                        i3 = 18;
                    } else {
                        i3 = 14;
                    }
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
                    if (C1163410gNf.LIZ()) {
                        i4 = 18;
                    } else {
                        i4 = 14;
                    }
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i4));
                    tuxIconView3.setTuxIcon(c419910GdJ);
                    tuxIconView3.setTintColorRes(R.attr.a1h);
                } else {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
                    Drawable drawableLIZ = c384050F3z.LIZ(tuxIconView3.getContext());
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(c1854470yMH2.LLIZ)));
                    if (C1855770yON.LIZIZ() && c1854470yMH2.LLJ) {
                        C1331750klB c1331750klB = new C1331750klB();
                        C1163410gNf.LIZ.getClass();
                        if (C1163410gNf.LIZJ()) {
                            i2 = 4;
                        } else {
                            i2 = 6;
                        }
                        c1331750klB.LJ = C418440Gaw.LIZIZ(i2);
                        c1331670kl3LJIIJ.LJJI = new C1331730kl9(c1331750klB);
                    } else {
                        C1855670yOD.LIZ.getClass();
                        if (C1855670yOD.LIZ() && c1854470yMH2.LLJ) {
                            C1331750klB c1331750klB2 = new C1331750klB();
                            C1163410gNf.LIZ.getClass();
                            if (C1163410gNf.LIZJ()) {
                                i = 4;
                            } else {
                                i = 8;
                            }
                            c1331750klB2.LJ = C418440Gaw.LIZIZ(i);
                            c1331670kl3LJIIJ.LJJI = new C1331730kl9(c1331750klB2);
                        }
                    }
                    c1331670kl3LJIIJ.LJJI(tuxIconView3);
                    c1331670kl3LJIIJ.LJJIIZI(drawableLIZ);
                    c1331670kl3LJIIJ.LJIL(drawableLIZ);
                    c1331670kl3LJIIJ.LJIIJJI();
                }
                C1855670yOD.LIZ.getClass();
                if (C1855670yOD.LIZ()) {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1854470yMH2.LLIZLLLIL.getWidth())));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1854470yMH2.LLIZLLLIL.getHeight())));
                    if (tuxIconView3.getWidth() != iLIZIZ || tuxIconView3.getHeight() != iLIZIZ2) {
                        ViewGroup.LayoutParams layoutParams = tuxIconView3.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iLIZIZ;
                            layoutParams.height = iLIZIZ2;
                        }
                        tuxIconView3.requestLayout();
                    }
                    sp(c1854470yMH2);
                }
            }
        } else {
            TuxIconView tuxIconView4 = this.LLJL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
            }
            C1855670yOD.LIZ.getClass();
            if (C1855670yOD.LIZ()) {
                sp(c1854470yMH2);
            }
        }
        if (c1854470yMH2.LLJILJILJ == null) {
            TuxIconView tuxIconView5 = this.LLJLILLLLZIIL;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
        } else {
            TuxIconView tuxIconView6 = this.LLJLILLLLZIIL;
            if (tuxIconView6 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
            }
            TuxIconView tuxIconView7 = this.LLJLILLLLZIIL;
            if (tuxIconView7 != null) {
                tuxIconView7.setIconRes(c1854470yMH2.LLJILJILJ.intValue());
            }
        }
        ActionBarImageItem actionBarImageItem = c1854470yMH2.LLJI;
        Map<String, String> commonParams = null;
        if (actionBarImageItem != null) {
            int i5 = actionBarImageItem.actionType;
            if (i5 == 3) {
                str2 = "convert_style";
            } else if (i5 == 5) {
                str2 = "image_to_video";
            } else {
                str2 = actionBarImageItem.uniqueKey;
            }
            TakoInputViewUIAbility takoInputViewUIAbility = (TakoInputViewUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoInputViewUIAbility.class, null);
            if (takoInputViewUIAbility != null && (listTG1 = takoInputViewUIAbility.TG1()) != null) {
                ArrayList arrayList = new ArrayList();
                for (BaseImage baseImage : listTG1) {
                    if (C123100dR.LIZ(baseImage.imageSource)) {
                        arrayList.add(baseImage);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((BaseImage) it2.next()).imageSource);
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, "/", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str4 = c1863850ybP.LL;
                String str5 = c1863850ybP.LLILLJJLI;
                String str6 = c1863850ybP.LLILZIL;
                String str7 = c1863850ybP.LLILZLL;
                if (str7 == null) {
                    str7 = "";
                }
                C1862330yYx.LJLIIIL(c1862330yYx, str4, str5, str6, str7, c1863850ybP.LLIZ, "off", "default", str2, strLJJLIIIJ, "shortcut", "base", SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
                return;
            }
            return;
        }
        String str8 = C1854130yLj.LIZLLL;
        C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
        Pair[] pairArr = new Pair[5];
        if (str8 != null) {
            str = "11";
        } else {
            str = "10";
        }
        pairArr[0] = new Pair("source", str);
        pairArr[1] = new Pair("rank", String.valueOf(c1854470yMH2.LLILLJJLI));
        pairArr[2] = new Pair("interaction_name", c1854470yMH2.LL);
        pairArr[3] = new Pair("log_id", c1854470yMH2.LLILLL);
        pairArr[4] = new Pair("sub_mode_type", C1854130yLj.LIZLLL);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility2 != null) {
            commonParams = iTakoContextAbility2.getCommonParams();
        }
        c1862330yYx2.mobTikbotQuickInteractionShow(mapLJIIJ, commonParams);
    }

    public final void sp(C1854470yMH c1854470yMH) {
        int dimensionPixelOffset;
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            if (c1854470yMH.LLJ) {
                dimensionPixelOffset = 0;
            } else {
                dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.aid);
            }
            view.setPaddingRelative(dimensionPixelOffset, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1854470yMH c1854470yMH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1854470yMH c1854470yMH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        up(interfaceC1587906Jp);
    }
}
