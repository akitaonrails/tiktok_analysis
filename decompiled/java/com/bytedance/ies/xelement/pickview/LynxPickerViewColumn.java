package com.bytedance.ies.xelement.pickview;

import X.C051500Gr;
import X.C117500cX;
import X.C1299120juY;
import X.C1300980jxY;
import X.C1301060jxg;
import X.C1319700kRk;
import X.C1319790kRt;
import X.InterfaceC1298070jsr;
import X.InterfaceC1301080jxi;
import X.InterfaceC1305140k4G;
import X.InterfaceC1312540kGC;
import X.InterfaceC1319850kRz;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxPickerViewColumn extends LynxUI<C1319790kRt> {
    public static final /* synthetic */ int LLILZIL = 0;
    public InterfaceC1298070jsr LL;
    public InterfaceC1298070jsr LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC1305140k4G LLILZ;

    public LynxPickerViewColumn() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C1319790kRt c1319790kRt = new C1319790kRt(context);
        if (this.LLILZ == null) {
            this.LLILZ = new InterfaceC1305140k4G() { // from class: X.0juX
                @Override // X.InterfaceC1305140k4G
                public final Map<String, String> LIZ() {
                    return new HashMap();
                }
            };
        }
        c1319790kRt.setLocalizeAdapter(this.LLILZ);
        c1319790kRt.setCyclic(false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1319790kRt);
        c1319790kRt.setLayoutParams(layoutParams);
        c1319790kRt.setOnItemSelectedListener(new C1319700kRk(this));
        c1319790kRt.setCurrentIndex(0);
        return c1319790kRt;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLILLL = map.containsKey("change");
        }
    }

    @InterfaceC1312540kGC(name = "font-family")
    public final void setFontFamily(String str) {
        if (str == null) {
            return;
        }
        Typeface typefaceLJ = C1300980jxY.LJ(0, this.mContext, str);
        if (typefaceLJ == null) {
            typefaceLJ = C1301060jxg.LIZ.LJ(this.mContext, str, 0, new InterfaceC1301080jxi() { // from class: X.0kRj
                @Override // X.InterfaceC1301080jxi
                public final void LIZIZ(Typeface typeface, int i) {
                    ((C1319790kRt) this.LIZ.mView).setTypeface(Typeface.create(typeface, i));
                }
            });
            if (typefaceLJ == null) {
                return;
            }
        }
        ((C1319790kRt) this.mView).setTypeface(Typeface.create(typefaceLJ, 0));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kRf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kRg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0kRh] */
    @InterfaceC1312540kGC(name = "indicator-style")
    public final void setIndicatorStyle(String str) {
        List listLIZ = C117500cX.LIZ(str);
        ?? r1 = new Object() { // from class: X.0kRf
            public final void LIZ(String str2) {
                Long lLIZ = C0XR8.LIZ(str2);
                if (lLIZ != null) {
                    LynxPickerViewColumn lynxPickerViewColumn = this.LIZ;
                    int iLongValue = (int) lLIZ.longValue();
                    ((C1319790kRt) lynxPickerViewColumn.mView).setTextColorCenter(iLongValue);
                    ((C1319790kRt) lynxPickerViewColumn.mView).setTextColorOut(iLongValue);
                }
            }

            public final void LIZIZ(String str2) {
                ((C1319790kRt) this.LIZ.mView).setTextSizePx(C0XR8.LIZIZ(this.LIZ.mContext, str2));
            }

            public final void LIZJ(String str2) {
                ((C1319790kRt) this.LIZ.mView).setCenterWeight(str2);
            }
        };
        String strLIZ = C051500Gr.LIZ("font-size", listLIZ);
        if (strLIZ != null) {
            r1.LIZIZ(strLIZ);
        }
        String strLIZ2 = C051500Gr.LIZ("color", listLIZ);
        if (strLIZ2 != null) {
            r1.LIZ(strLIZ2);
        }
        String strLIZ3 = C051500Gr.LIZ("font-weight", listLIZ);
        if (strLIZ3 != null) {
            r1.LIZJ(strLIZ3);
        }
        ?? r12 = new Object() { // from class: X.0kRg
            public final void LIZ(String str2) {
                Long lLIZ = C0XR8.LIZ(str2);
                if (lLIZ != null) {
                    ((C1319790kRt) this.LIZ.mView).setDividerColor((int) lLIZ.longValue());
                }
            }

            public final void LIZIZ(String str2) {
                ((C1319790kRt) this.LIZ.mView).setDividerWidth(C0XR8.LIZIZ(this.LIZ.mContext, str2));
            }
        };
        String strLIZ4 = C051500Gr.LIZ("border-width", listLIZ);
        if (strLIZ4 != null) {
            r12.LIZIZ(strLIZ4);
        }
        String strLIZ5 = C051500Gr.LIZ("border-color", listLIZ);
        if (strLIZ5 != null) {
            r12.LIZ(strLIZ5);
        }
        ?? r13 = new Object() { // from class: X.0kRh
            public final void LIZ(String str2) {
                ((C1319790kRt) this.LIZ.mView).setUserItemHeight(C0XR8.LIZIZ(this.LIZ.mContext, str2));
            }
        };
        String strLIZ6 = C051500Gr.LIZ("height", listLIZ);
        if (strLIZ6 != null) {
            r13.LIZ(strLIZ6);
        }
        C051500Gr.LIZ("foreground", listLIZ);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kRi] */
    @InterfaceC1312540kGC(name = "mask-style")
    public final void setMaskStyle(String str) {
        List listLIZ = C117500cX.LIZ(str);
        ?? r1 = new Object() { // from class: X.0kRi
            public final void LIZ(String str2) {
                Long lLIZ = C0XR8.LIZ(str2);
                if (lLIZ != null) {
                    ((C1319790kRt) this.LIZ.mView).setMaskColor((int) lLIZ.longValue());
                }
            }
        };
        C051500Gr.LIZ("height", listLIZ);
        String strLIZ = C051500Gr.LIZ("foreground", listLIZ);
        if (strLIZ != null) {
            r1.LIZ(strLIZ);
        }
    }

    @InterfaceC1312540kGC(name = "range")
    public final void setRange(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableArray readableArrayAsArray;
        String strAsString;
        this.LL = interfaceC1298070jsr;
        if (interfaceC1298070jsr.getType() == ReadableType.Array && !interfaceC1298070jsr.isNull() && 1 != 0 && (readableArrayAsArray = interfaceC1298070jsr.asArray()) != null && readableArrayAsArray.size() > 0 && !readableArrayAsArray.isNull(0)) {
            final ArrayList arrayList = new ArrayList();
            if (readableArrayAsArray.getType(0) == ReadableType.String) {
                ArrayList<Object> arrayListAsArrayList = readableArrayAsArray.asArrayList();
                if (arrayListAsArrayList != null) {
                    arrayList.addAll(arrayListAsArrayList);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
            } else {
                InterfaceC1298070jsr interfaceC1298070jsr2 = this.LLILLJJLI;
                if (interfaceC1298070jsr2 != null && (strAsString = interfaceC1298070jsr2.asString()) != null) {
                    int size = readableArrayAsArray.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(readableArrayAsArray.getMap(i).getString(strAsString));
                    }
                }
            }
            ((C1319790kRt) this.mView).setAdapter(new InterfaceC1319850kRz<String>(arrayList) { // from class: X.0T9s
                public final List<String> LIZ;

                @Override // X.InterfaceC1319850kRz
                public final int Q0() {
                    return this.LIZ.size();
                }

                {
                    this.LIZ = arrayList;
                }

                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
                @Override // X.InterfaceC1319850kRz
                public final String getItem(int i2) {
                    if (i2 >= 0 && i2 < this.LIZ.size()) {
                        return ListProtector.get(this.LIZ, i2);
                    }
                    return "";
                }
            });
            ((C1319790kRt) this.mView).setItemsVisibleCount(5);
        }
    }

    @InterfaceC1312540kGC(name = "range-key")
    public final void setRangeKey(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLILLJJLI = interfaceC1298070jsr;
    }

    @InterfaceC1312540kGC(name = "value")
    public final void setValue(InterfaceC1298070jsr interfaceC1298070jsr) {
        int iAsInt = 0;
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            try {
                iAsInt = CastIntegerProtector.parseInt(interfaceC1298070jsr.asString());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else if (interfaceC1298070jsr.getType() != ReadableType.Int && interfaceC1298070jsr.getType() != ReadableType.Long) {
            if (interfaceC1298070jsr.getType() == ReadableType.Number) {
                try {
                    iAsInt = (int) interfaceC1298070jsr.asDouble();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } else {
            try {
                iAsInt = interfaceC1298070jsr.asInt();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        C1319790kRt c1319790kRt = (C1319790kRt) this.mView;
        if (c1319790kRt != null) {
            c1319790kRt.setCurrentIndex(iAsInt);
        }
    }

    @InterfaceC1312540kGC(name = "visible-count")
    public final void setVisibleCount(String str) {
        int i;
        try {
            i = CastIntegerProtector.parseInt(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = 5;
        }
        ((C1319790kRt) this.mView).setItemsVisibleCount(i);
    }

    public LynxPickerViewColumn(s sVar, InterfaceC1305140k4G interfaceC1305140k4G, Object obj) {
        super(sVar, obj);
        this.LLILZ = interfaceC1305140k4G;
    }
}
