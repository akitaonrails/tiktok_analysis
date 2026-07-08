package com.ss.android.ugc.aweme.poi.detail.gallery;

import X.C098200Yq;
import X.C1180600gpO;
import X.C1186260gyW;
import X.C1186300gya;
import X.C1189360h3W;
import X.C1208600hYY;
import X.C123100dR;
import X.C1264160j0A;
import X.C12ES;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1388190mED;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1749280vcc;
import X.C189200o6;
import X.C19HL;
import X.C2211631BhB;
import X.C339190DRl;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC1182630gsf;
import X.InterfaceC1192250h8B;
import X.InterfaceC1325460kb2;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.ViewOnLayoutChangeListenerC1208750hYn;
import Y.ALAdapterS14S0100000_18;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS87S0200000_18;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS30S1201000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS405S0200000_4;

/* JADX INFO: loaded from: classes19.dex */
public class PoiGalleryCell extends PowerCell<C1186260gyW> implements InterfaceC20631915oL, InterfaceC1182630gsf, InterfaceC1192250h8B {
    public static final /* synthetic */ int LLJI = 0;
    public C19HL LL;
    public C1749280vcc LLILLJJLI;
    public volatile boolean LLILLL;
    public volatile boolean LLILZ;
    public View LLILZIL;
    public TuxTextView LLILZLL;
    public SmartImageView LLIZ;
    public TuxIconView LLIZLLLIL;
    public Animator LLJ;

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e3y;
    }

    @Override // X.InterfaceC1182630gsf
    public final void Yx() {
        InterfaceC1182630gsf interfaceC1182630gsf = (InterfaceC1182630gsf) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), PoiGalleryAbility.class, null);
        if (interfaceC1182630gsf != null) {
            interfaceC1182630gsf.Yx();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View viewFindViewById;
        super.onItemViewCreated();
        this.LL = (C19HL) this.itemView.findViewById(R.id.r2o);
        this.LLILLJJLI = (C1749280vcc) this.itemView.findViewById(R.id.r30);
        this.LLILZIL = this.itemView.findViewById(R.id.r2q);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.r2r);
        this.LLIZ = (SmartImageView) this.itemView.findViewById(R.id.r2s);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.r2p);
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 35), view);
        }
        C19HL c19hl = this.LL;
        if (c19hl != null) {
            c19hl.setOnDragOuterWidgetsChangeListener(this);
        }
        C19HL c19hl2 = this.LL;
        if (c19hl2 != null) {
            c19hl2.LIZ(this);
        }
        Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
        if (activityLIZ == null || (viewFindViewById = activityLIZ.findViewById(R.id.rai)) == null) {
            return;
        }
        AwS405S0200000_4 awS405S0200000_4 = new AwS405S0200000_4(viewFindViewById, this, 31);
        HandlerHook.viewPost(viewFindViewById, new ARunnableS104S0100000_4((Object) awS405S0200000_4, 80));
        viewFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1208750hYn(awS405S0200000_4, 3));
    }

    public final void I5(boolean z) {
        View view = this.LLILZIL;
        if (view == null) {
            return;
        }
        if (z) {
            Animator animator = this.LLJ;
            if (animator != null) {
                animator.cancel();
            }
            if (view.getVisibility() == 0) {
                C786410Ut5.T4(view, 1.0f);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            this.LLJ = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.addListener(new ALAdapterS14S0100000_18(view, 2));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return;
        }
        Animator animator2 = this.LLJ;
        if (animator2 != null) {
            animator2.cancel();
        }
        if (view.getVisibility() != 0) {
            C786410Ut5.T4(view, 1.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        this.LLJ = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.addListener(new ALAdapterS14S0100000_18(view, 3));
        C786410Ut5.Pd(objectAnimatorOfFloat2);
    }

    public final void R5(boolean z) {
        PoiPicture poiPicture;
        PoiPictureAuthorModel poiPictureAuthorModel;
        View view;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!z) {
            I5(false);
            return;
        }
        C1186260gyW item = getItem();
        if (item != null && (poiPicture = item.LLILLL) != null && (poiPictureAuthorModel = poiPicture.author) != null && C123100dR.LIZ(poiPictureAuthorModel.keyword)) {
            I5(true);
            C19HL c19hl = this.LL;
            if (c19hl != null) {
                RectF rectFLJI = c19hl.LJI(null);
                Object parent = c19hl.getParent();
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    float width = rectFLJI.left + ((measuredWidth - c19hl.getWidth()) / 2);
                    float height = rectFLJI.bottom + ((measuredHeight - c19hl.getHeight()) / 2);
                    View view2 = this.LLILZIL;
                    if (view2 != null) {
                        layoutParams = view2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMarginStart((int) (width + C339190DRl.LIZ(16)));
                        marginLayoutParams.bottomMargin = (int) ((measuredHeight - height) + C339190DRl.LIZ(12));
                    }
                    View view3 = this.LLILZIL;
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
        I5(false);
    }

    @Override // X.InterfaceC1192250h8B
    public final void ee(C19HL c19hl) {
        if (c19hl != null) {
            HandlerHook.viewPost(c19hl, new ARunnableS87S0200000_18(this, c19hl.LJIIIIZZ(null), 11));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        PoiPicture poiPicture;
        PoiPictureAuthorModel poiPictureAuthorModel;
        List<String> urlList;
        String str2;
        int iIntValue;
        int iLIZ;
        int iLIZ2;
        List<String> urlList2;
        String str3;
        List<String> urlList3;
        String str4;
        TuxTextView tuxTextView;
        C1186260gyW c1186260gyW = (C1186260gyW) interfaceC1891350zJl;
        super.onBindItemView(c1186260gyW);
        String str5 = c1186260gyW.LLILLJJLI;
        int bindingAdapterPosition = getBindingAdapterPosition();
        this.LLILLL = false;
        this.LLILZ = false;
        C1186260gyW item = getItem();
        if (item != null) {
            str = item.LLILZLL;
        } else {
            str = null;
        }
        C19HL c19hl = this.LL;
        if (c19hl != null) {
            c19hl.setTag(str5);
        }
        Uri uri = UriProtector.parse(str5);
        this.LLILLL = false;
        this.LLILZ = false;
        InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
        if (interfaceC1325460kb2LIZJ != null) {
            interfaceC1325460kb2LIZJ.LJIIL(uri, new C1186300gya(bindingAdapterPosition, uri, this, str));
        }
        C19HL c19hl2 = this.LL;
        if (c19hl2 != null) {
            C2211631BhB.LJ(c19hl2, new AwS384S0200000_18(c1186260gyW, this, 202));
        }
        C1186260gyW item2 = getItem();
        if (item2 != null && (poiPicture = item2.LLILLL) != null && (poiPictureAuthorModel = poiPicture.author) != null && C123100dR.LIZ(poiPictureAuthorModel.keyword)) {
            String str6 = poiPictureAuthorModel.keyword;
            if (str6 != null && (tuxTextView = this.LLILZLL) != null) {
                tuxTextView.setText(str6);
            }
            TuxTextView tuxTextView2 = this.LLILZLL;
            if (tuxTextView2 != null) {
                float fLIZ = C339190DRl.LIZ(28);
                UrlModel urlModel = poiPictureAuthorModel.icon;
                if (urlModel != null && (urlList3 = urlModel.getUrlList()) != null && (str4 = (String) C13LP.LJJJLL(urlList3)) != null && C123100dR.LIZ(str4)) {
                    iLIZ = (int) C339190DRl.LIZ(20);
                } else {
                    iLIZ = 0;
                }
                UrlModel urlModel2 = poiPictureAuthorModel.authorLink;
                if (urlModel2 != null && (urlList2 = urlModel2.getUrlList()) != null && (str3 = (String) C13LP.LJJJLL(urlList2)) != null && C123100dR.LIZ(str3)) {
                    iLIZ2 = (int) C339190DRl.LIZ(12);
                } else {
                    iLIZ2 = 0;
                }
                tuxTextView2.setMaxWidth((int) (((C12ES.LJIIJ(tuxTextView2.getContext()) - fLIZ) - iLIZ) - iLIZ2));
            }
            UrlModel urlModel3 = poiPictureAuthorModel.icon;
            if (urlModel3 != null) {
                SmartImageView smartImageView = this.LLIZ;
                if (smartImageView != null) {
                    C786410Ut5.LLFF(0, smartImageView);
                }
                C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_gallery", "poi_gallery_info_icon", null).LIZ(C438710HIf.LIZ(urlModel3));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7, this.itemView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                c1189360h3WLIZ.LIZ.LJIJJ = new ColorDrawable(iIntValue);
                c1189360h3WLIZ.LIZLLL(this.LLIZ);
                c1189360h3WLIZ.LIZJ(new C1208600hYY(this, 2));
            } else {
                SmartImageView smartImageView2 = this.LLIZ;
                if (smartImageView2 != null) {
                    C786410Ut5.LLFF(8, smartImageView2);
                }
            }
            UrlModel urlModel4 = poiPictureAuthorModel.authorLink;
            if (urlModel4 != null && (urlList = urlModel4.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList)) != null && C123100dR.LIZ(str2)) {
                TuxIconView tuxIconView = this.LLIZLLLIL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    return;
                }
                return;
            }
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            if (tuxIconView2 == null) {
                return;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        PoiGalleryAbility poiGalleryAbility = (PoiGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), PoiGalleryAbility.class, null);
        if (poiGalleryAbility != null) {
            poiGalleryAbility.Je2(i, this.LL);
        }
    }

    @Override // X.InterfaceC1182630gsf
    public final void yt(float f) {
        InterfaceC1182630gsf interfaceC1182630gsf = (InterfaceC1182630gsf) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), PoiGalleryAbility.class, null);
        if (interfaceC1182630gsf != null) {
            interfaceC1182630gsf.yt(f);
        }
    }

    public static boolean L5(PoiGalleryCell poiGalleryCell, float f) {
        if (Math.abs(f - 1.0f) <= 1.0E-4f) {
            return true;
        }
        return false;
    }

    public final void N5(int i, Uri uri, String str, boolean z) {
        C19HL c19hl = this.LL;
        if (c19hl == null) {
            return;
        }
        if (z) {
            C1749280vcc c1749280vcc = this.LLILLJJLI;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            C786410Ut5.LLFZ(0, c19hl);
        } else {
            C786410Ut5.LLFZ(8, c19hl);
            C1749280vcc c1749280vcc2 = this.LLILLJJLI;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                C1264160j0A.LIZIZ(c1749280vcc2, "", null, new AwS30S1201000_18(i, uri, this, str, 2));
            }
        }
        try {
            Unit unit = null;
            PoiGalleryAbility poiGalleryAbility = (PoiGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), PoiGalleryAbility.class, null);
            if (poiGalleryAbility != null) {
                poiGalleryAbility.Gg(z, c19hl, i);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
