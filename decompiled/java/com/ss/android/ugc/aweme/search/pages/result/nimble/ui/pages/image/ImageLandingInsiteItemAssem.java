package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image;

import X.C01GW;
import X.C07H8;
import X.C0HXV;
import X.C0Q5W;
import X.C13LP;
import X.C1602160rnK;
import X.C1839407Ii;
import X.C21512819Ha;
import X.C2188811AlT;
import X.C284380BCq;
import X.C301280BrS;
import X.C301510Brp;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426490Gnv;
import X.C426750GoL;
import X.C452501pT;
import X.C658080Pra;
import X.C664730Q5n;
import X.C703302op;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC657270PqH;
import X.InterfaceC1587906Jp;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TranslateSearchDesc;
import com.zhiliaoapp.musically.R;
import irm.AkS82S0100000_10;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageLandingInsiteItemAssem extends ImageLandingItemBaseAssem<C658080Pra> {
    public View LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 597));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 598));
    public String LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ewu;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final String tp() {
        SearchAwemeInfo searchAwemeInfo;
        List<TranslateSearchDesc> list;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((C658080Pra) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        InsiteImageData insiteImageData = ((C658080Pra) (c724270Sb32 != null ? c724270Sb32.LL : null)).LLILLJJLI;
        TranslateSearchDesc translateSearchDesc = (insiteImageData == null || (searchAwemeInfo = insiteImageData.searchAwemeInfo) == null || (list = searchAwemeInfo.translateSearchList) == null) ? null : (TranslateSearchDesc) C13LP.LJJJLL(list);
        C664730Q5n.LIZ.getClass();
        String strLJ = C664730Q5n.LJ(aweme, translateSearchDesc);
        if (C703302op.LIZ(translateSearchDesc != null ? translateSearchDesc.searchDesc : null) && strLJ != null && (!Intrinsics.LJFF(strLJ, C664730Q5n.LIZJ())) && C07H8.LIZ()) {
            C0Q5W.LIZ.getClass();
            if (C0Q5W.LIZJ() && C664730Q5n.LIZLLL(strLJ)) {
                if (translateSearchDesc != null) {
                    return translateSearchDesc.searchDesc;
                }
                return null;
            }
        }
        return C703302op.LIZ(aweme.getSearchDesc()) ? aweme.getSearchDesc() : aweme.getDesc();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final void Bp() {
        C21512819Ha c21512819HaYp = yp();
        if (c21512819HaYp != null) {
            int visibility = c21512819HaYp.getVisibility();
            c21512819HaYp.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c21512819HaYp);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final ConstraintLayout up() {
        return (ConstraintLayout) getContentView().findViewById(R.id.dws);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final C21512819Ha yp() {
        return (C21512819Ha) getContentView().findViewById(R.id.lla);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final TuxTextView zp() {
        return (TuxTextView) getContentView().findViewById(R.id.zqc);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Fp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C658080Pra c658080Pra) {
        Object obj;
        String strTp;
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            C337180DJs.LIZ(tuxTextView);
        }
        super.up(c658080Pra);
        InsiteImageData insiteImageData = c658080Pra.LL.insiteImage;
        if (insiteImageData != null) {
            if (C301280BrS.LIZ() && ((strTp = tp()) == null || strTp.length() == 0)) {
                View view = this.LLJL;
                if (view != null) {
                    C337180DJs.LIZ(view);
                }
            } else {
                View view2 = this.LLJL;
                if (view2 != null) {
                    C337180DJs.LIZJ(view2);
                }
            }
            Integer num = insiteImageData.insiteType;
            Object obj2 = null;
            if (num != null) {
                if (num.intValue() == 1) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    if (((C658080Pra) obj).LLILLL) {
                        Ip(1);
                    } else {
                        TuxTextView tuxTextView2 = this.LLJLIL;
                        if (tuxTextView2 != null) {
                            C337180DJs.LIZ(tuxTextView2);
                        }
                    }
                    Gp(false);
                } else if (num.intValue() == 3) {
                    Ip(3);
                    Gp(false);
                } else if (num.intValue() == 2) {
                    TuxTextView tuxTextView3 = this.LLJLIL;
                    if (tuxTextView3 != null) {
                        C337180DJs.LIZ(tuxTextView3);
                    }
                    Gp(true);
                    TuxTextView tuxTextView4 = this.LLJLILLLLZIIL;
                    if (tuxTextView4 != null) {
                        String string = getContentView().getResources().getString(2131836380);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) string);
                        C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
                        spannableStringBuilder.append((CharSequence) "·");
                        C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
                        tuxTextView4.setText(spannableStringBuilder.toString());
                    }
                }
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            if (((C658080Pra) obj2).LLILZ) {
                C21512819Ha c21512819HaYp = yp();
                if (c21512819HaYp != null) {
                    C844470XAv.LIZ.getClass();
                    C0HXV.LIZ(C844470XAv.LIZ().getResources().getDimensionPixelSize(R.dimen.a2m), c21512819HaYp);
                }
            } else {
                C21512819Ha c21512819HaYp2 = yp();
                if (c21512819HaYp2 != null) {
                    C0HXV.LIZ(0, c21512819HaYp2);
                }
            }
            if (C1839407Ii.LIZ() && !Intrinsics.LJFF(this.LLJLLL, insiteImageData.url)) {
                this.LLJLLL = insiteImageData.url;
                C21512819Ha c21512819HaYp3 = yp();
                if (c21512819HaYp3 != null) {
                    int visibility = c21512819HaYp3.getVisibility();
                    c21512819HaYp3.setVisibility(4);
                    C1602160rnK.LIZIZ(visibility, 4, c21512819HaYp3);
                }
            }
        }
    }

    public final void Gp(boolean z) {
        String strTp;
        if (C301280BrS.LIZ() && ((strTp = tp()) == null || strTp.length() == 0)) {
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                C337180DJs.LIZ(tuxTextView);
                return;
            }
            return;
        }
        if (z) {
            TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
            if (tuxTextView2 != null) {
                C337180DJs.LIZJ(tuxTextView2);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
        if (tuxTextView3 == null) {
            return;
        }
        C337180DJs.LIZ(tuxTextView3);
    }

    public final void Ip(int i) {
        int i2;
        TuxIconDrawable tuxIconDrawable;
        Object obj;
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            if (i != 1) {
                if (i == 3) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    if (((C658080Pra) obj).LLILLL) {
                        tuxTextView.setText(2131835835);
                    } else {
                        tuxTextView.setText(2131850670);
                    }
                }
                i2 = R.raw.icon_play_fill;
            } else {
                tuxTextView.setText(2131835834);
                i2 = R.raw.icon_square_corner_border_fill;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i2;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(14.0f)));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(14.0f)));
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView.getContext());
            if (Boolean.valueOf(true ^ C426750GoL.LIZLLL(tuxTextView.getContext())).booleanValue()) {
                tuxIconDrawable = tuxIconDrawableLIZ;
            } else {
                tuxIconDrawable = null;
            }
            if (!C426750GoL.LIZLLL(tuxTextView.getContext())) {
                tuxIconDrawableLIZ = null;
            }
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawable, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zf);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
            C786410Ut5.I7(new AkS82S0100000_10(this, 1), tuxTextView);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayoutUp;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view);
        ViewGroup.LayoutParams layoutParams2 = null;
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 248));
        this.LLJL = view.findViewById(R.id.ksw);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.tv_view_full);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.ztn);
        if (((Boolean) C284380BCq.LIZ.getValue()).booleanValue() && (constraintLayoutUp = up()) != null) {
            ConstraintLayout constraintLayoutUp2 = up();
            if (constraintLayoutUp2 != null && (layoutParams = constraintLayoutUp2.getLayoutParams()) != null) {
                layoutParams.height = -2;
                layoutParams2 = layoutParams;
            }
            C786410Ut5.m6(constraintLayoutUp, layoutParams2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final void Ep(Bitmap bitmap, C21512819Ha c21512819Ha) {
        Object obj;
        Object obj2;
        Integer num;
        Object obj3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object obj4;
        Aweme aweme;
        Integer num2;
        int visibility = c21512819Ha.getVisibility();
        boolean z = false;
        c21512819Ha.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c21512819Ha);
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            InsiteImageData insiteImageData = ((C658080Pra) obj).LL.insiteImage;
            if (insiteImageData == null || (num2 = insiteImageData.insiteType) == null || num2.intValue() != 3) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                InsiteImageData insiteImageData2 = ((C658080Pra) obj2).LL.insiteImage;
                if (insiteImageData2 == null || (num = insiteImageData2.insiteType) == null || num.intValue() != 1) {
                    return;
                }
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                if (!((C658080Pra) obj3).LLILLL) {
                    return;
                }
            }
            if (C301510Brp.LIZ()) {
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj4 = c724270Sb34.LL;
                } else {
                    obj4 = null;
                }
                InsiteImageData insiteImageData3 = ((C658080Pra) obj4).LL.insiteImage;
                if (insiteImageData3 == null || (aweme = insiteImageData3.awemeData) == null || aweme.getAid() == null) {
                    return;
                }
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            if (c21512819Ha.getWidth() > c21512819Ha.getHeight()) {
                z = true;
            }
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            float f = 0.0f;
            if (z) {
                float width = c21512819Ha.getWidth() - (bitmap.getWidth() * (c21512819Ha.getHeight() / bitmap.getHeight()));
                if (width >= 0.0f) {
                    f = width;
                }
                float fIntValue = (f / 2) + ((Number) this.LLJLLIL.getValue()).intValue();
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginEnd((int) fIntValue);
                    marginLayoutParams2 = marginLayoutParams;
                }
                C786410Ut5.R6(tuxTextView, marginLayoutParams2);
                return;
            }
            float height = c21512819Ha.getHeight() - (bitmap.getHeight() * (c21512819Ha.getWidth() / bitmap.getWidth()));
            if (height >= 0.0f) {
                f = height;
            }
            float fIntValue2 = (f / 2) + ((Number) this.LLJLL.getValue()).intValue();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = (int) fIntValue2;
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.R6(tuxTextView, marginLayoutParams2);
            C0HXV.LIZ((int) fIntValue2, tuxTextView);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        String str;
        C658080Pra c658080Pra = (C658080Pra) interfaceC1587906Jp;
        if (list != null && list.contains(EnumC657270PqH.IMAGE_LANDING_INSITE_CELL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update image, id:");
            InsiteImageData insiteImageData = c658080Pra.LLILLJJLI;
            if (insiteImageData != null) {
                str = insiteImageData.imageId;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(" holder: ");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            Ap(c658080Pra);
            return;
        }
        up(c658080Pra);
    }
}
