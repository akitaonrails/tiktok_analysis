package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells;

import X.AbstractC1335900krs;
import X.C09R3;
import X.C0QSJ;
import X.C1066100dqi;
import X.C1320310kSj;
import X.C1326790kdB;
import X.C1331070kk5;
import X.C1331670kl3;
import X.C1334210kp9;
import X.C13LE;
import X.C13LP;
import X.C1744700vVE;
import X.C1750100vdw;
import X.C1762070vxF;
import X.C1762260vxY;
import X.C1762610vy7;
import X.C1765290w2R;
import X.C2217381BqS;
import X.C259800zU;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1320380kSq;
import X.InterfaceC1587906Jp;
import X.InterfaceC1761670vwb;
import X.InterfaceC1762510vxx;
import X.InterfaceC1762910vyb;
import X.InterfaceC1763030vyn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC427850Gq7;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS104S0210000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselImageReusedAssem extends ReusedUISlotAssem<PdpCarouselImageReusedAssem> implements InterfaceC712990Rxx<C1762070vxF>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public volatile InterfaceC1762510vxx LLJLIL;
    public volatile InterfaceC1762910vyb LLJLILLLLZIIL;
    public volatile InterfaceC1763030vyn LLJLL;
    public volatile InterfaceC1761670vwb LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;
    public C0QSJ LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselImageReusedAssem.class, "pageViewerAbility", "getPageViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/headerabilities/IPagerViewerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselImageReusedAssem.class, "detectBlankHandler", "getDetectBlankHandler()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/module/header/opt2/IHeadBlankDetectHandler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselImageReusedAssem.class, "galleryViewerAbility", "getGalleryViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/ICarouselGalleryViewerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PdpCarouselImageReusedAssem.class, "pdpVMAbility", "getPdpVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.arc;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpCarouselScope.class, PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpCarouselScope.class);
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C0QSJ op() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJZIJLIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLLL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLJZIJLIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1762910vyb sp() {
        InterfaceC1762910vyb interfaceC1762910vyb = this.LLJLILLLLZIIL;
        if (interfaceC1762910vyb == null) {
            synchronized (this) {
                interfaceC1762910vyb = this.LLJLILLLLZIIL;
                if (interfaceC1762910vyb == null) {
                    C0QSJ c0qsjOp = op();
                    InterfaceC1762910vyb interfaceC1762910vyb2 = c0qsjOp != null ? (InterfaceC1762910vyb) c0qsjOp.getAbility(InterfaceC1762910vyb.class) : null;
                    this.LLJLILLLLZIIL = interfaceC1762910vyb2;
                    return interfaceC1762910vyb2;
                }
            }
        }
        return interfaceC1762910vyb;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1762510vxx up() {
        /*
            r4 = this;
            X.0vxx r1 = r4.LLJLIL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            X.0vxx r1 = r4.LLJLIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLJZ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLLL     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJLLL = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJZ = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            r1 = 0
            goto L36
        L29:
            java.lang.Class<X.0vxx> r0 = X.InterfaceC1762510vxx.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            X.0vxx r1 = (X.InterfaceC1762510vxx) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<X.0vxx> r0 = X.InterfaceC1762510vxx.class
            X.C687700QyG.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L36:
            r4.LLJLIL = r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            monitor-exit(r4)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselImageReusedAssem.up():X.0vxx");
    }

    public final InterfaceC1761670vwb yp() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLJLLIL;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLJLLIL;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjOp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJLLIL = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    public final C1765290w2R tp() {
        C1762260vxY c1762260vxYKR2 = yp().lX().KR2();
        if (c1762260vxYKR2 != null) {
            return c1762260vxYKR2.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewLJJIJL = LJJIJL();
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewLJJIJL.findViewById(R.id.kb6);
            SmartImageView smartImageView = (SmartImageView) callbackFindViewById;
            if (smartImageView == null) {
                smartImageView = null;
            }
            this.LLJJLIIIJLLLLLLLZ = smartImageView;
        }
        this.LLJJLIIIJLLLLLLLZ = (SmartImageView) callbackFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1762070vxF c1762070vxF) {
        boolean z;
        Boolean boolValueOf;
        C1320310kSj scaleType;
        final boolean z2;
        int i;
        HeaderDisplayImageOpt headerDisplayImageOptB0;
        PdpPreviewInfo pdpPreviewInfo;
        InterfaceC1762510vxx interfaceC1762510vxxUp;
        Set<String> setU7;
        InterfaceC1762510vxx interfaceC1762510vxxUp2;
        Set<String> setO3;
        Set<String> setO32;
        ViewGroup viewGroup;
        C1762070vxF c1762070vxF2 = c1762070vxF;
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            String str = null;
            if (c1762070vxF2.LLILLJJLI == 0) {
                viewLJJIJL.setClipToOutline(false);
                if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                    viewGroup.setClipChildren(false);
                }
                viewLJJIJL.setElevation(C418440Gaw.LIZIZ(99));
                viewLJJIJL.setTranslationZ(C418440Gaw.LIZIZ(99));
            }
            SmartImageView smartImageView = this.LLJJLIIIJLLLLLLLZ;
            if (smartImageView != null) {
                final C259800zU c259800zU = new C259800zU();
                ?? r12 = c1762070vxF2.LLILLL;
                c259800zU.element = r12;
                c259800zU.element = r12.copy(r12.width, r12.height, r12.mimetype, r12.uri, r12.urls, r12.thumbUri, r12.thumbUrls, r12.removeGap, r12.localImageScene, r12.localThumbImageScene, r12.sourceType, r12.viewHeight, r12.viewWidth);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC1762510vxx interfaceC1762510vxxUp3 = up();
                if (interfaceC1762510vxxUp3 != null && interfaceC1762510vxxUp3.tl()) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = "1";
                if (z && c1762070vxF2.LLILLJJLI == up().getCurrentPosition()) {
                    InterfaceC1762510vxx interfaceC1762510vxxUp4 = up();
                    if (interfaceC1762510vxxUp4 != null) {
                        interfaceC1762510vxxUp4.ag();
                    }
                    linkedHashMap.put("biz_is_first", "1");
                }
                InterfaceC1762510vxx interfaceC1762510vxxUp5 = up();
                if (interfaceC1762510vxxUp5 != null && (setO32 = interfaceC1762510vxxUp5.O3()) != null) {
                    boolValueOf = Boolean.valueOf(C13LP.LJJJJ(((Image) c259800zU.element).getUri(), setO32));
                } else {
                    boolValueOf = null;
                }
                if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("biz_is_repeat_load", str2);
                C1334210kp9.LJ((Image) c259800zU.element, linkedHashMap);
                String uri = ((Image) c259800zU.element).getUri();
                if (uri != null && (interfaceC1762510vxxUp2 = up()) != null && (setO3 = interfaceC1762510vxxUp2.O3()) != null) {
                    setO3.add(uri);
                }
                final C1066100dqi c1066100dqi = new C1066100dqi();
                c1066100dqi.LIZJ = c1762070vxF2.LLILZ;
                c1066100dqi.LIZ(c1762070vxF2.LLILLJJLI);
                c1066100dqi.LIZIZ((Image) c259800zU.element);
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                T t = c259800zU.element;
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(t);
                c1331670kl3LIZLLL.LIZLLL("CommerceCarouselVH");
                InterfaceC1762510vxx interfaceC1762510vxxUp6 = up();
                if (interfaceC1762510vxxUp6 != null) {
                    scaleType = interfaceC1762510vxxUp6.getScaleType();
                } else {
                    scaleType = null;
                }
                c1331670kl3LIZLLL.LJJ = C1326790kdB.LJI(scaleType);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C1750100vdw.LIZIZ(c1331670kl3LIZLLL, (Image) c259800zU.element);
                if (c1762070vxF2.LLILLJJLI == up().getCurrentPosition()) {
                    z2 = true;
                    C1765290w2R c1765290w2RTp = tp();
                    if (c1765290w2RTp != null) {
                        c1765290w2RTp.LIZIZ((Image) c259800zU.element);
                    }
                    InterfaceC1762510vxx interfaceC1762510vxxUp7 = up();
                    if (interfaceC1762510vxxUp7 != null) {
                        interfaceC1762510vxxUp7.v1(c1762070vxF2.LLILLJJLI, Float.valueOf(1.0f));
                    }
                } else {
                    z2 = false;
                }
                InterfaceC1762910vyb interfaceC1762910vybSp = sp();
                if (interfaceC1762910vybSp != null) {
                    interfaceC1762910vybSp.Qe(((Image) c259800zU.element).getUri());
                }
                if (c1762070vxF2.LLILLL.getUri() != null && Intrinsics.LJFF(this.LLJL, c1762070vxF2.LLILLL.getUri()) && (interfaceC1762510vxxUp = up()) != null && (setU7 = interfaceC1762510vxxUp.u7()) != null && C13LP.LJJJJ(((Image) c259800zU.element).getUri(), setU7)) {
                    final Image image = (Image) c259800zU.element;
                    final C1762610vy7 c1762610vy7 = new C1762610vy7(c1762070vxF2.LLILLJJLI, this, image, c1066100dqi);
                    c1331670kl3LIZLLL.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0vyG
                        @Override // X.InterfaceC427850Gq7
                        public final void e1(Uri uri2) {
                            C01GW c01gw = C1066190dqr.LIZ;
                            C1066190dqr.LJII(this.yp().lX().getProductId(), image.getUri());
                            c1762610vy7.e1(uri2);
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void A3(Uri uri2, C428600GrK c428600GrK) {
                            c1762610vy7.A3(uri2, c428600GrK);
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Bh(Uri uri2, View view) {
                            c1762610vy7.Bh(uri2, view);
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void lg(Uri uri2, Throwable th) {
                            c1762610vy7.lg(uri2, th);
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void cm(Uri uri2, View view, Throwable th) {
                            c1762610vy7.cm(uri2, view, th);
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Ad(Uri uri2, View view, C428600GrK c428600GrK, Animatable animatable) {
                            c1762610vy7.Ad(uri2, view, c428600GrK, animatable);
                        }
                    });
                } else {
                    C1331070kk5 hierarchy = smartImageView.getHierarchy();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    c419910GdJ.LIZ = R.raw.icon_large_bag;
                    if (C1744700vVE.LJ(smartImageView.getContext(), null)) {
                        i = R.attr.eg;
                    } else {
                        i = R.attr.ea;
                    }
                    c419910GdJ.LJ = Integer.valueOf(i);
                    hierarchy.LJJIFFI(c419910GdJ.LIZ(smartImageView.getContext()), InterfaceC1320380kSq.LJ);
                    InterfaceC1762510vxx interfaceC1762510vxxUp8 = up();
                    if (interfaceC1762510vxxUp8 != null && (headerDisplayImageOptB0 = interfaceC1762510vxxUp8.B0()) != null) {
                        Image image2 = (Image) c259800zU.element;
                        int i2 = c1762070vxF2.LLILLJJLI;
                        if (i2 == up().Y9() && (pdpPreviewInfo = yp().lX().LLLIILIL) != null) {
                            str = pdpPreviewInfo.cover;
                        }
                        headerDisplayImageOptB0.LIZ(smartImageView, image2, i2, str, false, up().getScaleType(), new AwS104S0210000_26(this, (PdpCarouselImageReusedAssem) c259800zU, (C259800zU<Image>) z2, true), c1331670kl3LIZLLL, new AbstractC1335900krs() { // from class: X.0vy1
                            @Override // X.InterfaceC427850Gq7
                            public final void cm(Uri uri2, View view, Throwable th) {
                                C1765290w2R c1765290w2RTp2;
                                c1066100dqi.LJ(th);
                                if (z2 && (c1765290w2RTp2 = this.tp()) != null) {
                                    c1765290w2RTp2.LIZ(c259800zU.element, false, false);
                                }
                            }

                            @Override // X.InterfaceC427850Gq7
                            public final void Ad(Uri uri2, View view, C428600GrK c428600GrK, Animatable animatable) {
                                C1765290w2R c1765290w2RTp2;
                                InterfaceC1762510vxx interfaceC1762510vxxUp9;
                                Set<String> setU72;
                                String uri3 = c259800zU.element.getUri();
                                if (uri3 != null && (interfaceC1762510vxxUp9 = this.up()) != null && (setU72 = interfaceC1762510vxxUp9.u7()) != null) {
                                    setU72.add(uri3);
                                }
                                InterfaceC1762910vyb interfaceC1762910vybSp2 = this.sp();
                                if (interfaceC1762910vybSp2 != null) {
                                    interfaceC1762910vybSp2.Np(c259800zU.element.getUri());
                                }
                                c1066100dqi.LIZLLL(c428600GrK);
                                if (z2 && (c1765290w2RTp2 = this.tp()) != null) {
                                    c1765290w2RTp2.LIZ(c259800zU.element, true, false);
                                }
                            }
                        }, true, true);
                    }
                }
                C786410Ut5.I7(new AjS44S0200000_26(this, c1762070vxF2, 51), getContentView());
                this.LLJL = c1762070vxF2.LLILLL.getUri();
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1762070vxF c1762070vxF) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1762070vxF c1762070vxF) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
