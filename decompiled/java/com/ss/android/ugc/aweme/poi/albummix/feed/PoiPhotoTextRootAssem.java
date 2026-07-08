package com.ss.android.ugc.aweme.poi.albummix.feed;

import X.C01GW;
import X.C123100dR;
import X.C1331660kl2;
import X.C1749280vcc;
import X.C19HL;
import X.C339190DRl;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1182630gsf;
import X.InterfaceC1192250h8B;
import X.InterfaceC1325460kb2;
import X.InterfaceC442640HXi;
import Y.ALAdapterS14S0100000_18;
import Y.ARunnableS87S0200000_18;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAwemePicAuthorStruct;
import com.ss.android.ugc.aweme.poi.PoiAwemePictureInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.albummix.feed.PoiPhotoTextRootAssem;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS7S3200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPhotoTextRootAssem extends ReusedUIContentAssem<PoiPhotoTextRootAssem> implements InterfaceC1182630gsf, InterfaceC1192250h8B {
    public String LLJJJJ;
    public C19HL LLJJJJLIIL;
    public C1749280vcc LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public SmartImageView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public ObjectAnimator LLJLLL;
    public Aweme LLJZ;
    public String LLJZIJLIL;
    public PageFinder LLL;
    public Animator LLLFFI;
    public volatile boolean LLLFZ;
    public volatile boolean LLLI;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 869));
    public final String LLLF = "post_inner_page";
    public final String LLLFF = "pic_report_click";

    @Override // X.InterfaceC1182630gsf
    public final void Yx() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1182630gsf
    public final void yt(float f) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        View view = this.LLJLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ObjectAnimator objectAnimator = this.LLJLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLJLLL = null;
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            C786410Ut5.ed(view2, 0.0f);
        }
    }

    public final PoiInnerPageMobData dp() {
        return (PoiInnerPageMobData) this.LLJJJJJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    public final void cp(boolean z) {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view == null) {
            return;
        }
        if (z) {
            Animator animator = this.LLLFFI;
            if (animator != null) {
                animator.cancel();
            }
            if (view.getVisibility() == 0) {
                C786410Ut5.T4(view, 1.0f);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            this.LLLFFI = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.addListener(new ALAdapterS14S0100000_18(view, 0));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return;
        }
        Animator animator2 = this.LLLFFI;
        if (animator2 != null) {
            animator2.cancel();
        }
        if (view.getVisibility() != 0) {
            C786410Ut5.T4(view, 1.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        this.LLLFFI = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.addListener(new ALAdapterS14S0100000_18(view, 1));
        C786410Ut5.Pd(objectAnimatorOfFloat2);
    }

    @Override // X.InterfaceC1192250h8B
    public final void ee(C19HL c19hl) {
        if (c19hl != null) {
            HandlerHook.viewPost(c19hl, new ARunnableS87S0200000_18(this, c19hl.LJIIIIZZ(null), 6));
        }
    }

    public final boolean hp(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        if (!ep(this, fArr[0]) || !ep(this, fArr[4]) || !ep(this, fArr[8])) {
            return false;
        }
        return true;
    }

    public final void kp(boolean z) {
        String str;
        View view;
        ViewGroup.LayoutParams layoutParams;
        PoiDataStruct poiDataStruct;
        PoiAwemePictureInfo poiAwemePictureInfo;
        PoiAwemePicAuthorStruct poiAwemePicAuthorStruct;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!z) {
            cp(false);
            return;
        }
        Aweme aweme = this.LLJZ;
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (poiAwemePictureInfo = poiDataStruct.poiAwemePictureInfo) != null && (poiAwemePicAuthorStruct = poiAwemePictureInfo.author) != null) {
            str = poiAwemePicAuthorStruct.keyword;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            cp(true);
            C19HL c19hl = this.LLJJJJLIIL;
            if (c19hl != null) {
                RectF rectFLJI = c19hl.LJI(null);
                Object parent = c19hl.getParent();
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    float width = rectFLJI.left + ((measuredWidth - c19hl.getWidth()) / 2);
                    float height = rectFLJI.bottom + ((measuredHeight - c19hl.getHeight()) / 2);
                    View view2 = this.LLJJLIIIJLLLLLLLZ;
                    if (view2 != null) {
                        layoutParams = view2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        float f = 16;
                        marginLayoutParams.setMarginStart((int) (width + C339190DRl.LIZ(f)));
                        marginLayoutParams.bottomMargin = (int) ((measuredHeight - height) + C339190DRl.LIZ(f));
                    }
                    View view3 = this.LLJJLIIIJLLLLLLLZ;
                    if (view3 != null) {
                        C786410Ut5.W5(view3, marginLayoutParams);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        cp(false);
    }

    public static boolean ep(PoiPhotoTextRootAssem poiPhotoTextRootAssem, float f) {
        poiPhotoTextRootAssem.getClass();
        if (Math.abs(f - 1.0f) <= 1.0E-4f) {
            return true;
        }
        return false;
    }

    public final void ip(final Uri uri, final String str, final String str2, final String str3) {
        this.LLLFZ = false;
        this.LLLI = false;
        C19HL c19hl = this.LLJJJJLIIL;
        if (c19hl != null) {
            c19hl.setTag(uri.toString());
        }
        InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
        if (interfaceC1325460kb2LIZJ != null) {
            interfaceC1325460kb2LIZJ.LJIIL(uri, new InterfaceC442640HXi() { // from class: X.0h87
                @Override // X.InterfaceC442640HXi
                public final void onResult(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        C1749280vcc c1749280vcc = this.LLJJL;
                        if (c1749280vcc != null) {
                            C786410Ut5.LLLZLZ(c1749280vcc, 0);
                        }
                        C1749280vcc c1749280vcc2 = this.LLJJL;
                        if (c1749280vcc2 != null) {
                            c1749280vcc2.LJ();
                        }
                        C19HL c19hl2 = this.LLJJJJLIIL;
                        if (c19hl2 != null) {
                            C786410Ut5.LLFZ(8, c19hl2);
                        }
                        String str4 = str;
                        if (str4 != null && str4.length() != 0) {
                            final PoiPhotoTextRootAssem poiPhotoTextRootAssem = this;
                            String str5 = str;
                            Uri uri2 = uri;
                            final C19HL c19hl3 = poiPhotoTextRootAssem.LLJJJJLIIL;
                            if (c19hl3 != null) {
                                final String string = uri2.toString();
                                C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_post_inner_page", "poi_gallery_image_small", null).LIZIZ(str5);
                                c1189360h3WLIZIZ.LIZ.LJJIJL(c19hl3.getContext());
                                c1189360h3WLIZIZ.LJ(new AbstractC468201s0() { // from class: X.0h88
                                    @Override // X.InterfaceC1331910klR
                                    public final void LIZ(Bitmap bitmap) {
                                        if (Intrinsics.LJFF(c19hl3.getTag(), string) && !poiPhotoTextRootAssem.LLLFZ) {
                                            poiPhotoTextRootAssem.LLLI = true;
                                            c19hl3.setImageBitmap(bitmap);
                                            C1749280vcc c1749280vcc3 = poiPhotoTextRootAssem.LLJJL;
                                            if (c1749280vcc3 != null) {
                                                C786410Ut5.LLLZLZ(c1749280vcc3, 8);
                                            }
                                            C786410Ut5.LLFZ(0, c19hl3);
                                        }
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void onFailed(Throwable th) {
                                        Intrinsics.LJFF(c19hl3.getTag(), string);
                                    }
                                });
                            }
                        }
                    } else {
                        C1749280vcc c1749280vcc3 = this.LLJJL;
                        if (c1749280vcc3 != null) {
                            C786410Ut5.LLLZLZ(c1749280vcc3, 8);
                        }
                        C19HL c19hl4 = this.LLJJJJLIIL;
                        if (c19hl4 != null) {
                            C786410Ut5.LLFZ(0, c19hl4);
                        }
                    }
                    final PoiPhotoTextRootAssem poiPhotoTextRootAssem2 = this;
                    final Uri uri3 = uri;
                    final String str6 = str;
                    final String str7 = str2;
                    final String str8 = str3;
                    final C19HL c19hl5 = poiPhotoTextRootAssem2.LLJJJJLIIL;
                    if (c19hl5 != null) {
                        final String string2 = uri3.toString();
                        c19hl5.setTag(string2);
                        C1180600gpO c1180600gpO = new C1180600gpO("poi_post_inner_page", "poi_gallery_image", null);
                        c1180600gpO.LIZLLL = new C1202680hP0(str7, str8, null, null, null, 28);
                        c1180600gpO.LJFF = uri3;
                        C1189360h3W c1189360h3WLIZJ = c1180600gpO.LIZJ(C1331660kl2.LJI(uri3));
                        c1189360h3WLIZJ.LIZ.LJJIJL(c19hl5.getContext());
                        c1189360h3WLIZJ.LJ(new AbstractC468201s0() { // from class: X.0h89
                            @Override // X.InterfaceC1331910klR
                            public final void LIZ(Bitmap bitmap) {
                                if (!Intrinsics.LJFF(c19hl5.getTag(), string2)) {
                                    return;
                                }
                                poiPhotoTextRootAssem2.LLLFZ = true;
                                c19hl5.setImageBitmap(bitmap);
                                C1749280vcc c1749280vcc4 = poiPhotoTextRootAssem2.LLJJL;
                                if (c1749280vcc4 != null) {
                                    C786410Ut5.LLLZLZ(c1749280vcc4, 8);
                                }
                                C786410Ut5.LLFZ(0, c19hl5);
                                C19HL c19hl6 = c19hl5;
                                HandlerHook.viewPost(c19hl6, new ARunnableS87S0200000_18(poiPhotoTextRootAssem2, c19hl6, 28));
                            }

                            @Override // X.InterfaceC1331910klR
                            public final void onFailed(Throwable th) {
                                if (!Intrinsics.LJFF(c19hl5.getTag(), string2)) {
                                    return;
                                }
                                if (poiPhotoTextRootAssem2.LLLI) {
                                    C1749280vcc c1749280vcc4 = poiPhotoTextRootAssem2.LLJJL;
                                    if (c1749280vcc4 != null) {
                                        C786410Ut5.LLLZLZ(c1749280vcc4, 8);
                                    }
                                    C786410Ut5.LLFZ(0, c19hl5);
                                    return;
                                }
                                C1749280vcc c1749280vcc5 = poiPhotoTextRootAssem2.LLJJL;
                                if (c1749280vcc5 != null) {
                                    C786410Ut5.LLLZLZ(c1749280vcc5, 0);
                                }
                                C786410Ut5.LLFZ(8, c19hl5);
                                PoiPhotoTextRootAssem poiPhotoTextRootAssem3 = poiPhotoTextRootAssem2;
                                C1749280vcc c1749280vcc6 = poiPhotoTextRootAssem3.LLJJL;
                                if (c1749280vcc6 != null) {
                                    C1264160j0A.LIZIZ(c1749280vcc6, "", null, new AwS7S3200000_18(uri3, poiPhotoTextRootAssem3, str6, str7, str8, 0));
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
