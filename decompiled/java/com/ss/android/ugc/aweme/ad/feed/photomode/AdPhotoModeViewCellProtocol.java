package com.ss.android.ugc.aweme.ad.feed.photomode;

import X.C0SOB;
import X.C1017070cZd;
import X.C1558520qew;
import X.InterfaceC665370Q7z;
import X.InterfaceC988630bpl;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.pid.IPidAbility;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeViewCellProtocol;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.protocol.PhotoViewCellProtocol;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPhotoModeViewCellProtocol extends PhotoViewCellProtocol {
    public IPhotoSlidesAbility LL;
    public IPhotoSlidesEventDispatchAbility LLILLJJLI;
    public Aweme LLILLL;
    public final List<C0SOB> LLILZ = new ArrayList();
    public String LLILZIL = "#FFFFFF";
    public int LLILZLL;

    @Override // com.ss.android.ugc.aweme.protocol.PhotoViewCellProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.protocol.PhotoViewCellProtocol
    public final void LIZ(Aweme aweme) {
        this.LLILLL = aweme;
    }

    @Override // com.ss.android.ugc.aweme.protocol.PhotoViewCellProtocol
    public final void LIZJ(final InterfaceC665370Q7z interfaceC665370Q7z) {
        AwemeRawAd awemeRawAd;
        final AdDisclaimer disclaimer;
        AwemeRawAd awemeRawAd2;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        this.LL = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPhotoSlidesAbility.class, null);
        this.LLILLJJLI = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPhotoSlidesEventDispatchAbility.class, null);
        if (C1017070cZd.LJLLI(this.LLILLL)) {
            Aweme aweme = this.LLILLL;
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd2.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null && (!productList.isEmpty()) && !TextUtils.isEmpty(((PhotoCarouselProductStruct) ListProtector.get(productList, 0)).getColor())) {
                this.LLILZIL = ((PhotoCarouselProductStruct) ListProtector.get(productList, 0)).getColor();
            }
            C0SOB c0sob = new C0SOB() { // from class: X.0c9t
                @Override // X.C0SOB
                public final void Aa() {
                }

                @Override // X.C0SOB
                public final void onPageSelected(int i) {
                    AwemeRawAd awemeRawAd3;
                    PhotoCarouselInfoStruct photoCarouselInfo2;
                    List<PhotoCarouselProductStruct> productList2;
                    Aweme aweme2 = this.LL.LLILLL;
                    if (aweme2 != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && (photoCarouselInfo2 = awemeRawAd3.getPhotoCarouselInfo()) != null && (productList2 = photoCarouselInfo2.getProductList()) != null && productList2.size() > i && !TextUtils.isEmpty(((PhotoCarouselProductStruct) ListProtector.get(productList2, i)).getColor())) {
                        AdPhotoModeViewCellProtocol adPhotoModeViewCellProtocol = this.LL;
                        InterfaceC988630bpl interfaceC988630bplLJIIZILJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIZILJ();
                        if (interfaceC988630bplLJIIZILJ != null) {
                            interfaceC988630bplLJIIZILJ.QB(ColorProtector.parseColor(((PhotoCarouselProductStruct) ListProtector.get(productList2, i)).getColor()), ColorProtector.parseColor(adPhotoModeViewCellProtocol.LLILZIL), i, adPhotoModeViewCellProtocol.LLILZLL);
                        }
                        adPhotoModeViewCellProtocol.LLILZIL = ((PhotoCarouselProductStruct) ListProtector.get(productList2, i)).getColor();
                        adPhotoModeViewCellProtocol.LLILZLL = i;
                    }
                }
            };
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = this.LLILLJJLI;
            if (iPhotoSlidesEventDispatchAbility != null) {
                iPhotoSlidesEventDispatchAbility.u52(c0sob);
            }
            ((ArrayList) this.LLILZ).add(c0sob);
        }
        if (C1017070cZd.LJLLILLLL(this.LLILLL)) {
            C0SOB c0sob2 = new C0SOB() { // from class: X.0c9s
                @Override // X.C0SOB
                public final void Aa() {
                }

                @Override // X.C0SOB
                public final void onPageSelected(int i) {
                    AwemeRawAd awemeRawAd3;
                    PhotoCarouselInfoStruct photoCarouselInfo2;
                    List<PhotoCarouselProductStruct> productList2;
                    String buttonText;
                    AwemeRawAd awemeRawAd4;
                    Aweme aweme2 = this.LL.LLILLL;
                    if (aweme2 != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && (photoCarouselInfo2 = awemeRawAd3.getPhotoCarouselInfo()) != null && (productList2 = photoCarouselInfo2.getProductList()) != null && productList2.size() > i && !TextUtils.isEmpty(((PhotoCarouselProductStruct) ListProtector.get(productList2, i)).getButtonText())) {
                        AdPhotoModeViewCellProtocol adPhotoModeViewCellProtocol = this.LL;
                        if (!TextUtils.isEmpty(((PhotoCarouselProductStruct) ListProtector.get(productList2, i)).getButtonText())) {
                            buttonText = ((PhotoCarouselProductStruct) ListProtector.get(productList2, i)).getButtonText();
                        } else {
                            Aweme aweme3 = adPhotoModeViewCellProtocol.LLILLL;
                            if (aweme3 == null || (awemeRawAd4 = aweme3.getAwemeRawAd()) == null || (buttonText = awemeRawAd4.getButtonText()) == null) {
                                buttonText = "";
                            }
                        }
                        InterfaceC988630bpl interfaceC988630bplLJIIZILJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIZILJ();
                        if (interfaceC988630bplLJIIZILJ != null) {
                            interfaceC988630bplLJIIZILJ.setText(buttonText);
                        }
                    }
                }
            };
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = this.LLILLJJLI;
            if (iPhotoSlidesEventDispatchAbility2 != null) {
                iPhotoSlidesEventDispatchAbility2.u52(c0sob2);
            }
            ((ArrayList) this.LLILZ).add(c0sob2);
        }
        Aweme aweme2 = this.LLILLL;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (disclaimer = awemeRawAd.getDisclaimer()) != null && disclaimer.type == 3) {
            C0SOB c0sob3 = new C0SOB() { // from class: X.0c9u
                public IPidAbility LL;

                @Override // X.C0SOB
                public final void Aa() {
                }

                @Override // X.C0SOB
                public final void onPageSelected(int i) {
                    String str;
                    List<String> list = disclaimer.pidList;
                    if (list != null && (str = (String) C13LP.LJJJLZIJ(i, list)) != null) {
                        IPidAbility iPidAbility = this.LL;
                        if (iPidAbility == null) {
                            iPidAbility = (IPidAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPidAbility.class, null);
                            if (iPidAbility != null) {
                                this.LL = iPidAbility;
                            } else {
                                return;
                            }
                        }
                        iPidAbility.ex0(str);
                    }
                }
            };
            IPhotoSlidesAbility iPhotoSlidesAbility = this.LL;
            if (iPhotoSlidesAbility != null) {
                Integer numValueOf = Integer.valueOf(iPhotoSlidesAbility.xt0());
                if (numValueOf.intValue() >= 0) {
                    c0sob3.onPageSelected(numValueOf.intValue());
                }
            }
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility3 = this.LLILLJJLI;
            if (iPhotoSlidesEventDispatchAbility3 != null) {
                iPhotoSlidesEventDispatchAbility3.u52(c0sob3);
            }
            ((ArrayList) this.LLILZ).add(c0sob3);
        }
    }

    @Override // com.ss.android.ugc.aweme.protocol.PhotoViewCellProtocol
    public final void LIZLLL(boolean z) {
        InterfaceC988630bpl interfaceC988630bplLJIIZILJ;
        String buttonText;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        this.LLILZLL = 0;
        InterfaceC988630bpl interfaceC988630bplLJIIZILJ2 = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIZILJ();
        if (interfaceC988630bplLJIIZILJ2 != null) {
            interfaceC988630bplLJIIZILJ2.lg1();
        }
        if (C1017070cZd.LJLLILLLL(this.LLILLL) && (interfaceC988630bplLJIIZILJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIZILJ()) != null) {
            Aweme aweme = this.LLILLL;
            if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || (productList = photoCarouselInfo.getProductList()) == null || (photoCarouselProductStruct = (PhotoCarouselProductStruct) ListProtector.get(productList, 0)) == null || (buttonText = photoCarouselProductStruct.getButtonText()) == null) {
                buttonText = "";
            }
            interfaceC988630bplLJIIZILJ.setText(buttonText);
        }
        for (C0SOB c0sob : (ArrayList) this.LLILZ) {
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = this.LLILLJJLI;
            if (iPhotoSlidesEventDispatchAbility != null) {
                iPhotoSlidesEventDispatchAbility.IL1(c0sob);
            }
        }
    }
}
