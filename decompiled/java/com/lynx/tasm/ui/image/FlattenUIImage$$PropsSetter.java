package com.lynx.tasm.ui.image;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class FlattenUIImage$$PropsSetter extends LynxFlattenUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        FlattenUIImage flattenUIImage = (FlattenUIImage) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    flattenUIImage.setCapInsetsScale(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1900756664:
                if (str.equals("enable-super-resolution")) {
                    flattenUIImage.setImageSR(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1492006372:
                if (str.equals("enable-resource-hint")) {
                    flattenUIImage.setEnableResourceHint(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    flattenUIImage.setSkipRedirection(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1320385523:
                if (str.equals("async-redirect")) {
                    flattenUIImage.setAsyncRedirect(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1138223116:
                if (str.equals("image-config")) {
                    flattenUIImage.setImageConfig(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1059824547:
                if (str.equals("enable-report-info")) {
                    flattenUIImage.setEnableReportInfo(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    flattenUIImage.setRepeat(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -931992873:
                if (str.equals("android-simple-cache-key")) {
                    flattenUIImage.setSimpleCacheKey(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -629825370:
                if (str.equals("loop-count")) {
                    flattenUIImage.setLoopCount(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    flattenUIImage.setFrescoNinePatch(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -320982203:
                if (str.equals("disable-default-resize")) {
                    flattenUIImage.setDisableDefaultResize(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    flattenUIImage.setPreFetchWidth(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    flattenUIImage.setSource(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    flattenUIImage.setObjectFit(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 108305470:
                if (str.equals("async-request")) {
                    flattenUIImage.setAsyncRequest(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    flattenUIImage.setPreFetchHeight(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 259555579:
                if (str.equals("super-resolution-scale")) {
                    flattenUIImage.setImageSRScale(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
            case 263914060:
                if (str.equals("cache-choice")) {
                    flattenUIImage.setImageCacheChoice(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 305374695:
                if (str.equals("region-to-decode")) {
                    flattenUIImage.setRegionToDecode(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 512852970:
                if (str.equals("subsample")) {
                    flattenUIImage.setSubSample(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    flattenUIImage.setCapInsetsBackUp(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    flattenUIImage.setPlaceholder(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 660415178:
                if (str.equals("progressive-rendering")) {
                    flattenUIImage.setProgressiveRendering(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 681292984:
                if (str.equals("blur-radius")) {
                    flattenUIImage.setBlurRadius(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 828761943:
                if (str.equals("fetch-priority")) {
                    flattenUIImage.setImageRequestPriority(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 893413739:
                if (str.equals("image-transition-style")) {
                    flattenUIImage.setImageTransitionStyle(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 902281110:
                if (str.equals("suspendable")) {
                    flattenUIImage.setSuspendable(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1145216977:
                if (str.equals("android-enable-smooth-animation")) {
                    flattenUIImage.setEnableSmoothAnimation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1282944765:
                if (str.equals("android-cache-key-path-only")) {
                    flattenUIImage.setCacheKeyPathOnly(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1338737543:
                if (str.equals("placeholder-hash-config")) {
                    flattenUIImage.setImagePlaceHolderHashConfig(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    flattenUIImage.setAutoPlay(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1515751784:
                if (str.equals("capInsets")) {
                    flattenUIImage.setCapInsets(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1615092063:
                if (str.equals("auto-size")) {
                    flattenUIImage.setAutoSize(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1739487650:
                if (str.equals("defer-src-invalidation")) {
                    flattenUIImage.setDeferInvalidation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1856274660:
                if (str.equals("additional-custom-info")) {
                    flattenUIImage.setCustomParams(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 1860054545:
                if (str.equals("tint-color")) {
                    flattenUIImage.setTintColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1998893929:
                if (str.equals("enable-custom-gif-decoder")) {
                    flattenUIImage.setEnableCustomGifDecoder(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2141225912:
                if (str.equals("extra-load-info")) {
                    flattenUIImage.setExtraLoadInfo(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
