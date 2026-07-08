package com.bytedance.ies.xelement.input;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes33.dex */
public class LynxBaseInputView$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) throws IllegalAccessException, InvocationTargetException {
        Integer numValueOf;
        LynxBaseInputView lynxBaseInputView = (LynxBaseInputView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2063037069:
                if (str.equals("compat-number-type")) {
                    lynxBaseInputView.setCompatNumberType(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1988401764:
                if (str.equals("letter-spacing")) {
                    lynxBaseInputView.setLetterSpacing(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
            case -1730062511:
                if (str.equals("smart-scroll")) {
                    lynxBaseInputView.setSmartScroll(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -1664091044:
                if (str.equals("placeholder-font-weight")) {
                    lynxBaseInputView.setPlaceholderTextWeight(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -1586082113:
                if (str.equals("font-size")) {
                    lynxBaseInputView.setFontTextSize(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    lynxBaseInputView.setLynxDirection(c1311730kEt.LJFF(str, 3));
                    return;
                }
                break;
            case -866730430:
                if (str.equals("readonly")) {
                    lynxBaseInputView.setIsReadOnly(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -865043584:
                if (str.equals("android-set-soft-input-mode")) {
                    lynxBaseInputView.setSoftInputMode(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -723781827:
                if (str.equals("android-selection-handle-color")) {
                    lynxBaseInputView.setSelectionHandleColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -525534091:
                if (str.equals("fullscreen-mode")) {
                    lynxBaseInputView.setKeyBoardFullscreenMode(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -445272125:
                if (str.equals("show-soft-input-onfocus")) {
                    lynxBaseInputView.setShowSoftInputOnFocus(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -140393755:
                if (str.equals("placeholder-font-size")) {
                    lynxBaseInputView.setPlaceholderTextSize(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    lynxBaseInputView.setInputType(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    lynxBaseInputView.setFontColor(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    lynxBaseInputView.setFocus(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 103960492:
                if (str.equals("keyboard-hide-blur")) {
                    lynxBaseInputView.setBlurKeyboardHide(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 108532386:
                if (str.equals("font-family")) {
                    lynxBaseInputView.setFontFamily(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxBaseInputView.setInputValue(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 124732746:
                if (str.equals("maxlength")) {
                    lynxBaseInputView.setMaxLength(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    lynxBaseInputView.setDisable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    lynxBaseInputView.setPlaceholder(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 598800822:
                if (str.equals("font-weight")) {
                    if (c1311730kEt.LJIIJ(str)) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(c1311730kEt.LJFF(str, 0));
                    }
                    lynxBaseInputView.setFontWeight(numValueOf);
                    return;
                }
                break;
            case 746232421:
                if (str.equals("text-align")) {
                    lynxBaseInputView.setTextAlign(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 1101235489:
                if (str.equals("adjust-mode")) {
                    lynxBaseInputView.setAdjustMode(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1155760891:
                if (str.equals("bottom-inset")) {
                    lynxBaseInputView.setBottomInset(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1437560563:
                if (str.equals("auto-fit")) {
                    lynxBaseInputView.setAutoFit(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1579804907:
                if (str.equals("android-selection-highlight-color")) {
                    lynxBaseInputView.setSelectionHighLightColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1614704353:
                if (str.equals("auto-fill")) {
                    lynxBaseInputView.setAutoFill(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1782197877:
                if (str.equals("enableAutoFill")) {
                    lynxBaseInputView.setIsAutoFillEnabled(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1901673625:
                if (str.equals("caret-color")) {
                    lynxBaseInputView.setCursorColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 2018420361:
                if (str.equals("placeholder-color")) {
                    lynxBaseInputView.setPlaceholderColor(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 2033358039:
                if (str.equals("placeholder-style")) {
                    lynxBaseInputView.setPlaceHolderStyle(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 2051146279:
                if (str.equals("confirm-type")) {
                    lynxBaseInputView.setConfirmType(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 2140607816:
                if (str.equals("placeholder-font-family")) {
                    lynxBaseInputView.setPlaceholderFontFamily(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
