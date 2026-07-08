package com.lynx.tasm.ui.image;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UIImage$$PropsSetter extends AbsUIImage$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIImage uIImage = (UIImage) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    uIImage.setCapInsetsScale(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1900756664:
                if (str.equals("enable-super-resolution")) {
                    uIImage.setImageSR(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1492006372:
                if (str.equals("enable-resource-hint")) {
                    uIImage.setEnableResourceHint(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    uIImage.setSkipRedirection(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1320385523:
                if (str.equals("async-redirect")) {
                    uIImage.setAsyncRedirect(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1138223116:
                if (str.equals("image-config")) {
                    uIImage.setImageConfig(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1059824547:
                if (str.equals("enable-report-info")) {
                    uIImage.setEnableReportInfo(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -931992873:
                if (str.equals("android-simple-cache-key")) {
                    uIImage.setSimpleCacheKey(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    uIImage.setFrescoNinePatch(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 259555579:
                if (str.equals("super-resolution-scale")) {
                    uIImage.setImageSRScale(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
            case 263914060:
                if (str.equals("cache-choice")) {
                    uIImage.setImageCacheChoice(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 305374695:
                if (str.equals("region-to-decode")) {
                    uIImage.setRegionToDecode(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 512852970:
                if (str.equals("subsample")) {
                    uIImage.setSubSample(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    uIImage.setCapInsetsBackUp(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 660415178:
                if (str.equals("progressive-rendering")) {
                    uIImage.setProgressiveRendering(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 828761943:
                if (str.equals("fetch-priority")) {
                    uIImage.setImageRequestPriority(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 893413739:
                if (str.equals("image-transition-style")) {
                    uIImage.setImageTransitionStyle(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 902281110:
                if (str.equals("suspendable")) {
                    uIImage.setSuspendable(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1090746891:
                if (str.equals("fresco-visible")) {
                    uIImage.setFrescoVisible(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1145216977:
                if (str.equals("android-enable-smooth-animation")) {
                    uIImage.setEnableSmoothAnimation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1245269388:
                if (str.equals("fresco-attach")) {
                    uIImage.setFrescoAttach(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1282944765:
                if (str.equals("android-cache-key-path-only")) {
                    uIImage.setCacheKeyPathOnly(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1338737543:
                if (str.equals("placeholder-hash-config")) {
                    uIImage.setImagePlaceHolderHashConfig(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    uIImage.setAutoPlay(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1672916293:
                if (str.equals("fix-fresco-bug")) {
                    uIImage.fixFrescoWebPBug(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1739487650:
                if (str.equals("defer-src-invalidation")) {
                    uIImage.setDeferInvalidation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1856274660:
                if (str.equals("additional-custom-info")) {
                    uIImage.setCustomParams(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 1860054545:
                if (str.equals("tint-color")) {
                    uIImage.setTintColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    uIImage.setVisibility(c1311730kEt.LJFF(str, 1));
                    return;
                }
                break;
            case 1998893929:
                if (str.equals("enable-custom-gif-decoder")) {
                    uIImage.setEnableCustomGifDecoder(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2141225912:
                if (str.equals("extra-load-info")) {
                    uIImage.setExtraLoadInfo(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
