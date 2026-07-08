package com.ss.android.ugc.aweme.feed.title.anchor;

import X.C1066850drv;
import X.C1066860drw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C20094213jo;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1066840dru;
import X.InterfaceC1891350zJl;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import u4.q0;
import wh6.AbS506S0200000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class TitlePanelAnchorCell extends PowerCell<C1066860drw> {
    public C1066850drv LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLIZLLL;
        String strLIZIZ;
        String strLIZ;
        String strLIZIZ2;
        TuxTextView tuxTextView;
        String strLJII;
        CharSequence text;
        TuxTextView tuxTextView2;
        String strLJII2;
        UrlModel iconUrl;
        final C1066860drw c1066860drw = (C1066860drw) interfaceC1891350zJl;
        C1066850drv c1066850drv = this.LL;
        if (c1066850drv != null) {
            View view = c1066850drv.LLILLJJLI;
            if (view != null) {
                C786410Ut5.I7(new AbS506S0200000_16(c1066860drw, c1066850drv, 1), view);
            }
            TuxIconView tuxIconView = c1066850drv.LLILLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            SmartImageView smartImageView = c1066850drv.LLILZ;
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
            }
            TuxTextView tuxTextView3 = c1066850drv.LLILZIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
            TuxTextView tuxTextView4 = c1066850drv.LLILZLL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 8);
            }
            TuxTextView tuxTextView5 = c1066850drv.LLIZ;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 8);
            }
            TuxTextView tuxTextView6 = c1066850drv.LLIZLLLIL;
            if (tuxTextView6 != null) {
                C786410Ut5.LLLLZLL(tuxTextView6, 8);
            }
            InterfaceC1066840dru interfaceC1066840dru = c1066860drw.LL;
            if (interfaceC1066840dru != null && (iconUrl = interfaceC1066840dru.getIconUrl()) != null) {
                SmartImageView smartImageView2 = c1066850drv.LLILZ;
                if (smartImageView2 != null) {
                    C786410Ut5.LLFF(0, smartImageView2);
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(iconUrl));
                c1331670kl3LJIIIIZZ.LJJ(c1066850drv.LLILZ);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            } else {
                InterfaceC1066840dru interfaceC1066840dru2 = c1066860drw.LL;
                if (interfaceC1066840dru2 != null && (iLIZLLL = interfaceC1066840dru2.LIZLLL()) > 0) {
                    TuxIconView tuxIconView2 = c1066850drv.LLILLL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                    TuxIconView tuxIconView3 = c1066850drv.LLILLL;
                    if (tuxIconView3 != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = iLIZLLL;
                        c419910GdJ.LIZIZ = iLIZIZ;
                        c419910GdJ.LIZJ = iLIZIZ;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                        tuxIconView3.setTuxIcon(c419910GdJ);
                    }
                }
            }
            InterfaceC1066840dru interfaceC1066840dru3 = c1066860drw.LL;
            String str = "";
            if (interfaceC1066840dru3 == null || (strLIZIZ = interfaceC1066840dru3.LIZIZ()) == null) {
                strLIZIZ = "";
            }
            if (TextUtils.isEmpty(strLIZIZ)) {
                TuxTextView tuxTextView7 = c1066850drv.LLILZIL;
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 8);
                }
            } else {
                TuxTextView tuxTextView8 = c1066850drv.LLILZIL;
                if (tuxTextView8 != null) {
                    tuxTextView8.setMaxWidth(c1066850drv.LL);
                }
                TuxTextView tuxTextView9 = c1066850drv.LLILZIL;
                if (tuxTextView9 != null) {
                    tuxTextView9.setText(strLIZIZ);
                }
                TuxTextView tuxTextView10 = c1066850drv.LLILZIL;
                if (tuxTextView10 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView10, 0);
                }
                q0.LJIJ(c1066850drv, new C20094213jo() { // from class: X.0e8J
                    @Override // X.C20094213jo
                    public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        String strLIZIZ3;
                        super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                        InterfaceC1066840dru interfaceC1066840dru4 = c1066860drw.LL;
                        if (interfaceC1066840dru4 == null || (strLIZIZ3 = interfaceC1066840dru4.LIZIZ()) == null) {
                            strLIZIZ3 = "";
                        }
                        accessibilityNodeInfoCompat.setContentDescription(strLIZIZ3);
                        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                        accessibilityNodeInfoCompat.addAction(16);
                    }
                });
            }
            InterfaceC1066840dru interfaceC1066840dru4 = c1066860drw.LL;
            if (interfaceC1066840dru4 == null || (strLIZ = interfaceC1066840dru4.LIZ()) == null) {
                strLIZ = "";
            }
            TuxTextView tuxTextView11 = c1066850drv.LLILZLL;
            if (tuxTextView11 != null) {
                C786410Ut5.LLLLZLL(tuxTextView11, 8);
            }
            if (TextUtils.isEmpty(strLIZ)) {
                TuxTextView tuxTextView12 = c1066850drv.LLIZ;
                if (tuxTextView12 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView12, 8);
                }
            } else {
                TuxTextView tuxTextView13 = c1066850drv.LLIZ;
                if (tuxTextView13 != null) {
                    tuxTextView13.setMaxWidth(c1066850drv.LL);
                }
                TuxTextView tuxTextView14 = c1066850drv.LLIZ;
                if (tuxTextView14 != null) {
                    tuxTextView14.setText(strLIZ);
                }
                TuxTextView tuxTextView15 = c1066850drv.LLIZ;
                if (tuxTextView15 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView15, 0);
                }
                InterfaceC1066840dru interfaceC1066840dru5 = c1066860drw.LL;
                if (interfaceC1066840dru5 == null || (strLIZIZ2 = interfaceC1066840dru5.LIZIZ()) == null) {
                    strLIZIZ2 = "";
                }
                if (!TextUtils.isEmpty(strLIZIZ2) && (tuxTextView = c1066850drv.LLILZLL) != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
            }
            InterfaceC1066840dru interfaceC1066840dru6 = c1066860drw.LL;
            if (interfaceC1066840dru6 != null && (strLJII2 = interfaceC1066840dru6.LJII()) != null) {
                str = strLJII2;
            }
            CharSequence text2 = null;
            if (TextUtils.isEmpty(str)) {
                TuxTextView tuxTextView16 = c1066850drv.LLIZLLLIL;
                if (tuxTextView16 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView16, 8);
                }
            } else {
                TuxTextView tuxTextView17 = c1066850drv.LLIZLLLIL;
                if (tuxTextView17 != null) {
                    InterfaceC1066840dru interfaceC1066840dru7 = c1066860drw.LL;
                    if (interfaceC1066840dru7 != null) {
                        strLJII = interfaceC1066840dru7.LJII();
                    } else {
                        strLJII = null;
                    }
                    tuxTextView17.setText(strLJII);
                }
                TuxTextView tuxTextView18 = c1066850drv.LLIZLLLIL;
                if (tuxTextView18 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView18, 0);
                }
            }
            TuxTextView tuxTextView19 = c1066850drv.LLILZIL;
            if (tuxTextView19 != null) {
                text = tuxTextView19.getText();
            } else {
                text = null;
            }
            if (!TextUtils.isEmpty(text)) {
                TuxTextView tuxTextView20 = c1066850drv.LLIZ;
                if (tuxTextView20 != null) {
                    text2 = tuxTextView20.getText();
                }
                if (!TextUtils.isEmpty(text2)) {
                    int i = c1066850drv.LL / 2;
                    TuxTextView tuxTextView21 = c1066850drv.LLILZIL;
                    if (tuxTextView21 != null && (tuxTextView2 = c1066850drv.LLIZ) != null) {
                        tuxTextView21.measure(0, 0);
                        int measuredWidth = tuxTextView21.getMeasuredWidth();
                        if (measuredWidth <= i) {
                            tuxTextView2.setMaxWidth(c1066850drv.LL - measuredWidth);
                        } else {
                            tuxTextView21.setMaxWidth(i);
                            tuxTextView2.setMaxWidth(i);
                        }
                    }
                }
            }
            InterfaceC1066840dru interfaceC1066840dru8 = c1066860drw.LL;
            if (interfaceC1066840dru8 != null) {
                interfaceC1066840dru8.LJ(C1066850drv.LIZ(c1066860drw));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1066850drv c1066850drv = new C1066850drv(viewGroup.getContext());
        this.LL = c1066850drv;
        return c1066850drv;
    }
}
