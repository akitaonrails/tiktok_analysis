package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet;

import X.AbstractC468201s0;
import X.C07C3;
import X.C0Q0E;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C301460Brk;
import X.C342550Dbp;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427870Gq9;
import X.C434520H2c;
import X.C665180Q7g;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.ReferenceWebLinkItemAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceWebLinkItemAssem extends BaseReferenceSheetItemAssem<C434520H2c> {
    public final int LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C427870Gq9 LLJLLIL;
    public TuxTextView LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public C427870Gq9 LLL;
    public C427870Gq9 LLLF;
    public TuxTextView LLLFF;
    public TuxTextView LLLFFI;
    public String LLLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return up() ? R.layout.ezm : C301460Brk.LIZJ(Integer.valueOf(this.LLJLIL)) ? R.layout.ezo : R.layout.ezn;
    }

    public final boolean up() {
        return C07C3.LIZ() >= 1;
    }

    public ReferenceWebLinkItemAssem(int i) {
        this.LLJLIL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.BaseReferenceSheetItemAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        int i;
        super.onViewCreated(view);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.tv_summary);
        if (up()) {
            this.LLJZ = view.findViewById(R.id.kmq);
            this.LLJZIJLIL = view.findViewById(R.id.kmp);
            this.LLL = (C427870Gq9) view.findViewById(R.id.lzt);
            this.LLLF = (C427870Gq9) view.findViewById(R.id.lzs);
            this.LLLFF = (TuxTextView) view.findViewById(R.id.tv_web_name_top);
            this.LLLFFI = (TuxTextView) view.findViewById(R.id.tv_web_name_bottom);
            int i2 = 0;
            if (C07C3.LIZ() <= 1) {
                z = true;
            } else {
                z = false;
            }
            View view2 = this.LLJZ;
            if (view2 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }
            View view3 = this.LLJZIJLIL;
            if (view3 != null) {
                if (z) {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view3);
            }
        } else {
            this.LLJLLIL = (C427870Gq9) view.findViewById(R.id.l9h);
            this.LLJLLL = (TuxTextView) view.findViewById(R.id.zym);
        }
        int i3 = this.LLJLIL;
        if (i3 == 1) {
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                tuxTextView.setMaxLines(2);
            }
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setMaxLines(2);
                return;
            }
            return;
        }
        if (i3 == 2) {
            TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setMaxLines(1);
            }
            TuxTextView tuxTextView4 = this.LLJLL;
            if (tuxTextView4 == null) {
                return;
            }
            tuxTextView4.setMaxLines(2);
            return;
        }
        if (i3 != 3) {
            return;
        }
        TuxTextView tuxTextView5 = this.LLJLILLLLZIIL;
        if (tuxTextView5 != null) {
            tuxTextView5.setMaxLines(1);
        }
        TuxTextView tuxTextView6 = this.LLJLL;
        if (tuxTextView6 == null) {
            return;
        }
        tuxTextView6.setMaxLines(3);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        String strLJ;
        TuxTextView tuxTextView;
        String strLIZIZ;
        String strLIZIZ2;
        TuxTextView tuxTextView2;
        C434520H2c c434520H2c = (C434520H2c) obj;
        tp(c434520H2c);
        if (up()) {
            C665180Q7g c665180Q7g = C665180Q7g.LIZ;
            String str = c434520H2c.LLILZ;
            c665180Q7g.getClass();
            strLJ = C665180Q7g.LJ(str);
        } else {
            strLJ = c434520H2c.LLILZ;
        }
        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(c434520H2c.LLILLJJLI);
        }
        if (strLJ != null && strLJ.length() != 0) {
            TuxTextView tuxTextView4 = this.LLJLL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            TuxTextView tuxTextView5 = this.LLJLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(strLJ);
            }
            if (up() && (tuxTextView2 = this.LLJLILLLLZIIL) != null) {
                tuxTextView2.setMaxLines(1);
            }
        } else {
            TuxTextView tuxTextView6 = this.LLJLL;
            if (tuxTextView6 != null) {
                C786410Ut5.LLLLZLL(tuxTextView6, 8);
            }
            TuxTextView tuxTextView7 = this.LLJLL;
            if (tuxTextView7 != null) {
                tuxTextView7.setText((CharSequence) null);
            }
            if (up() && (tuxTextView = this.LLJLILLLLZIIL) != null) {
                tuxTextView.setMaxLines(2);
            }
        }
        String str2 = "";
        if (up()) {
            final String str3 = c434520H2c.LLILZLL;
            final Context context = getContext();
            if (context != null) {
                this.LLLFZ = str3;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_earth_w_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                final TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C427870Gq9 c427870Gq9 = this.LLL;
                if (c427870Gq9 != null) {
                    c427870Gq9.setImageDrawable(tuxIconDrawableLIZ);
                }
                C427870Gq9 c427870Gq92 = this.LLLF;
                if (c427870Gq92 != null) {
                    c427870Gq92.setImageDrawable(tuxIconDrawableLIZ);
                }
                if (str3 != null && (strLIZIZ2 = C0Q0E.LIZIZ(str3)) != null) {
                    str2 = strLIZIZ2;
                }
                C1331660kl2.LJIIIZ(str2).LJJIIJ(new AbstractC468201s0() { // from class: X.0Gya
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        if (!Intrinsics.LJFF(str3, this.LLLFZ)) {
                            return;
                        }
                        if (bitmap == null) {
                            ReferenceWebLinkItemAssem referenceWebLinkItemAssem = this;
                            TuxIconDrawable tuxIconDrawable = tuxIconDrawableLIZ;
                            C427870Gq9 c427870Gq93 = referenceWebLinkItemAssem.LLL;
                            if (c427870Gq93 != null) {
                                c427870Gq93.setImageDrawable(tuxIconDrawable);
                            }
                            C427870Gq9 c427870Gq94 = referenceWebLinkItemAssem.LLLF;
                            if (c427870Gq94 != null) {
                                c427870Gq94.setImageDrawable(tuxIconDrawable);
                                return;
                            }
                            return;
                        }
                        ReferenceWebLinkItemAssem referenceWebLinkItemAssem2 = this;
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                        C427870Gq9 c427870Gq95 = referenceWebLinkItemAssem2.LLL;
                        if (c427870Gq95 != null) {
                            c427870Gq95.setController(null);
                            c427870Gq95.getHierarchy().LJFF(bitmapDrawable, 1.0f, true);
                        }
                        C427870Gq9 c427870Gq96 = referenceWebLinkItemAssem2.LLLF;
                        if (c427870Gq96 == null) {
                            return;
                        }
                        c427870Gq96.setController(null);
                        c427870Gq96.getHierarchy().LJFF(bitmapDrawable, 1.0f, true);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        if (!Intrinsics.LJFF(str3, this.LLLFZ)) {
                            return;
                        }
                        ReferenceWebLinkItemAssem referenceWebLinkItemAssem = this;
                        TuxIconDrawable tuxIconDrawable = tuxIconDrawableLIZ;
                        C427870Gq9 c427870Gq93 = referenceWebLinkItemAssem.LLL;
                        if (c427870Gq93 != null) {
                            c427870Gq93.setImageDrawable(tuxIconDrawable);
                        }
                        C427870Gq9 c427870Gq94 = referenceWebLinkItemAssem.LLLF;
                        if (c427870Gq94 != null) {
                            c427870Gq94.setImageDrawable(tuxIconDrawable);
                        }
                    }
                });
            }
            TuxTextView tuxTextView8 = this.LLLFF;
            if (tuxTextView8 != null) {
                tuxTextView8.setText(c434520H2c.LLILLL);
            }
            TuxTextView tuxTextView9 = this.LLLFFI;
            if (tuxTextView9 != null) {
                tuxTextView9.setText(c434520H2c.LLILLL);
                return;
            }
            return;
        }
        String str4 = c434520H2c.LLILZLL;
        if (C301460Brk.LIZJ(Integer.valueOf(this.LLJLIL))) {
            final Context context2 = getContext();
            if (context2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_earth_w_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1p);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                final TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context2);
                C427870Gq9 c427870Gq93 = this.LLJLLIL;
                if (c427870Gq93 != null) {
                    c427870Gq93.setImageDrawable(tuxIconDrawableLIZ2);
                }
                if (str4 != null && (strLIZIZ = C0Q0E.LIZIZ(str4)) != null) {
                    str2 = strLIZIZ;
                }
                C1331660kl2.LJIIIZ(str2).LJJIIJ(new AbstractC468201s0() { // from class: X.0GyZ
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        if (bitmap == null) {
                            ReferenceWebLinkItemAssem referenceWebLinkItemAssem = this.LL;
                            TuxIconDrawable tuxIconDrawable = tuxIconDrawableLIZ2;
                            C427870Gq9 c427870Gq94 = referenceWebLinkItemAssem.LLJLLIL;
                            if (c427870Gq94 != null) {
                                c427870Gq94.setImageDrawable(tuxIconDrawable);
                                return;
                            }
                            return;
                        }
                        C427870Gq9 c427870Gq95 = this.LL.LLJLLIL;
                        if (c427870Gq95 == null) {
                            return;
                        }
                        Context context3 = context2;
                        c427870Gq95.setController(null);
                        c427870Gq95.getHierarchy().LJFF(new BitmapDrawable(context3.getResources(), bitmap), 1.0f, true);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        ReferenceWebLinkItemAssem referenceWebLinkItemAssem = this.LL;
                        TuxIconDrawable tuxIconDrawable = tuxIconDrawableLIZ2;
                        C427870Gq9 c427870Gq94 = referenceWebLinkItemAssem.LLJLLIL;
                        if (c427870Gq94 != null) {
                            c427870Gq94.setImageDrawable(tuxIconDrawable);
                        }
                    }
                });
            }
        } else {
            Context context3 = getContext();
            if (context3 != null && str4 != null) {
                Drawable drawableLIZIZ = C342550Dbp.LIZIZ(context3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C0Q0E.LIZIZ(str4));
                c1331670kl3LJIIIZ.LJJ(this.LLJLLIL);
                c1331670kl3LJIIIZ.LJIL(drawableLIZIZ);
                c1331670kl3LJIIIZ.LJJIIZI(drawableLIZIZ);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C418440Gaw.LIZIZ(200);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context3);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(0.5f));
                    c1331750klB.LIZJ = iIntValue;
                    c1331750klB.LIZIZ = fLIZIZ;
                }
                c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LJIIIZ.LJIIJJI();
            }
        }
        TuxTextView tuxTextView10 = this.LLJLLL;
        if (tuxTextView10 == null) {
            return;
        }
        tuxTextView10.setText(c434520H2c.LLILLL);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.BaseReferenceSheetItemAssem
    public final View sp(View view) {
        return view.findViewById(R.id.fz3);
    }
}
