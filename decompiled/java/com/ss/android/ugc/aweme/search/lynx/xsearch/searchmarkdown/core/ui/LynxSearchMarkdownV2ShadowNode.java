package com.ss.android.ugc.aweme.search.lynx.xsearch.searchmarkdown.core.ui;

import X.C07GD;
import X.C0BQE;
import X.C0H7V;
import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C1312290kFn;
import X.C20267114Rx;
import X.C21419418s4;
import X.C2188811AlT;
import X.C341990Dav;
import X.C418440Gaw;
import X.C688750Qzx;
import X.C689200R1q;
import X.C689220R1s;
import X.C689240R1u;
import X.C814420VxA;
import X.EnumC431710GwL;
import X.InterfaceC1312240kFi;
import X.InterfaceC1312540kGC;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import j27.s;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxSearchMarkdownV2ShadowNode extends ShadowNode implements InterfaceC1312240kFi {
    public C689200R1q LJIJJLI;
    public String LJIL = "";
    public boolean LJJ;
    public Integer LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public EnumC431710GwL LJJIII;
    public boolean LJJIIJ;
    public Integer LJJIIJZLJL;
    public Integer LJJIIZ;

    @Override // X.InterfaceC1312240kFi
    public final void LIZJ(C1312290kFn c1312290kFn, C1312260kFk c1312260kFk) {
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJI() {
        this.LJIJJLI = null;
    }

    public LynxSearchMarkdownV2ShadowNode() {
        LJI(this);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(s sVar) {
        this.LJIIL = sVar;
        if ((sVar instanceof Context) && sVar != null) {
            C689200R1q c689200R1q = new C689200R1q(sVar, null, 6);
            c689200R1q.LLLILZ = true;
            c689200R1q.setTruncateType(EnumC431710GwL.VIEW_ALL);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(100, 100);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c689200R1q);
            c689200R1q.setLayoutParams(layoutParams);
            c689200R1q.setCustomShowTruncateIcon(true);
            c689200R1q.setEnableToggleAction(false);
            this.LJIJJLI = c689200R1q;
        }
    }

    @InterfaceC1312540kGC(name = "config")
    public final void setConfig(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap;
        String str;
        boolean zBooleanValue;
        Integer numValueOf;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        String str2;
        boolean zBooleanValue4;
        C689200R1q c689200R1q;
        int iLIZIZ;
        Boolean bool;
        boolean z;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Number number;
        Boolean bool5;
        if (readableMap != null && (mapAsHashMap = readableMap.asHashMap()) != null) {
            boolean zBooleanValue5 = false;
            if (!Intrinsics.LJFF(mapAsHashMap.get("content"), this.LJIL) && this.LJIL.length() > 0) {
                LJIILLIIL();
                this.LJJIIJZLJL = null;
            }
            Object obj = mapAsHashMap.get("content");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.LJIL = str;
            Object obj2 = mapAsHashMap.get("isPage");
            if ((obj2 instanceof Boolean) && (bool5 = (Boolean) obj2) != null) {
                zBooleanValue = bool5.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LJJ = zBooleanValue;
            Object obj3 = mapAsHashMap.get("maxLine");
            if ((obj3 instanceof Number) && (number = (Number) obj3) != null) {
                numValueOf = Integer.valueOf(number.intValue());
            } else {
                numValueOf = null;
            }
            this.LJJI = numValueOf;
            Object obj4 = mapAsHashMap.get("shouldMergeQuote");
            if ((obj4 instanceof Boolean) && (bool4 = (Boolean) obj4) != null) {
                zBooleanValue2 = bool4.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            this.LJJIFFI = zBooleanValue2;
            Object obj5 = mapAsHashMap.get("useSeeMoreTruncation");
            if ((obj5 instanceof Boolean) && (bool3 = (Boolean) obj5) != null) {
                zBooleanValue3 = bool3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            this.LJJII = zBooleanValue3;
            C0H7V c0h7v = EnumC431710GwL.Companion;
            Object obj6 = mapAsHashMap.get("truncateType");
            if (obj6 instanceof String) {
                str2 = (String) obj6;
            } else {
                str2 = null;
            }
            c0h7v.getClass();
            this.LJJIII = C0H7V.LIZ(str2);
            Object obj7 = mapAsHashMap.get("useSimpleMarkdown");
            if ((obj7 instanceof Boolean) && (bool2 = (Boolean) obj7) != null) {
                zBooleanValue4 = bool2.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            this.LJJIIJ = zBooleanValue4;
            if (!zBooleanValue4 && (c689200R1q = this.LJIJJLI) != null) {
                if (this.LJIL.length() == 0) {
                    c689200R1q.setText("");
                    return;
                }
                int iLIZ = C689220R1s.LIZ(this.LJJ, this.LJJI);
                if (C0BQE.LIZ()) {
                    if (c689200R1q.LLJJLIIIJLLLLLLLZ != null && iLIZ != c689200R1q.getShowMaxLines()) {
                        c689200R1q.LJJJJL();
                    }
                    EnumC431710GwL enumC431710GwL = this.LJJIII;
                    if (enumC431710GwL == null) {
                        if (this.LJJII) {
                            enumC431710GwL = EnumC431710GwL.SEE_MORE;
                        } else {
                            enumC431710GwL = EnumC431710GwL.VIEW_ALL;
                        }
                    }
                    c689200R1q.setTruncateType(enumC431710GwL);
                    if (enumC431710GwL == EnumC431710GwL.SEE_MORE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c689200R1q.setEnableDownChevron(z);
                    s sVar = this.LJIIL;
                    if (sVar == null) {
                        return;
                    }
                    if (this.LJJ) {
                        C341990Dav.LIZ(c689200R1q, sVar, 41, 0, null, 12);
                    } else {
                        C341990Dav.LIZ(c689200R1q, sVar, 51, 0, null, 12);
                    }
                }
                c689200R1q.setShowMaxLines(iLIZ);
                c689200R1q.LJJJZ(!this.LJJ);
                C20267114Rx.LJII(c689200R1q, mapAsHashMap);
                String str3 = this.LJIL;
                C689240R1u c689240R1u = C689240R1u.LIZ;
                Context context = c689200R1q.getContext();
                c689240R1u.getClass();
                C21419418s4 c21419418s4LJ = C689240R1u.LJ(context, null);
                if (this.LJJ) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ = c21419418s4LJ.LJJIII;
                }
                c689200R1q.LJJLIIIIJ(str3, C20267114Rx.LIZ(C689240R1u.LIZ(c689240R1u, C21419418s4.LIZ(c21419418s4LJ, null, 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, iLIZIZ, false, false, 0, false, null, null, this.LJJIFFI, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -134217729, 16777207), this.LJJ, null, C0BQE.LIZ(), null, 10), c689200R1q, mapAsHashMap), null, null, null, C07GD.LIZ(), false, !this.LJJ, null, false);
                Object obj8 = mapAsHashMap.get("markDirty");
                if ((obj8 instanceof Boolean) && (bool = (Boolean) obj8) != null) {
                    zBooleanValue5 = bool.booleanValue();
                }
                if (!C0BQE.LIZ() || !zBooleanValue5) {
                    return;
                }
                LJIILLIIL();
            }
        }
    }

    @Override // X.InterfaceC1312240kFi
    public final C1312250kFj LIZ(C1312280kFm c1312280kFm, C1312230kFh c1312230kFh) {
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start measure ");
        sbLIZ.append(Float.valueOf(c1312230kFh.LIZ));
        sbLIZ.append(' ');
        sbLIZ.append(Float.valueOf(c1312230kFh.LIZJ));
        C2188811AlT.LIZIZ(sbLIZ);
        float f = c1312230kFh.LIZ;
        float fLIZIZ = f - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(32.0f)));
        if (fLIZIZ < 0.0f) {
            fLIZIZ = 0.0f;
        }
        int i = (int) fLIZIZ;
        if (i <= 0) {
            return new C1312250kFj(f, 0.0f);
        }
        CharSequence text = null;
        int iIntValue = 0;
        if (this.LJJIIJ) {
            if (this.LJJIIJZLJL != null && (num = this.LJJIIZ) != null && num.intValue() == i) {
                Integer num2 = this.LJJIIJZLJL;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                return new C1312250kFj(f, iIntValue);
            }
            int height = C688750Qzx.LIZ(i, C688750Qzx.LIZIZ(this.LJIJJLI, this.LJIL, this.LJJ), this.LJJ, null).getHeight();
            this.LJJIIZ = Integer.valueOf(i);
            this.LJJIIJZLJL = Integer.valueOf(height);
            return new C1312250kFj(f, height);
        }
        C689200R1q c689200R1q = this.LJIJJLI;
        if (c689200R1q == null) {
            return new C1312250kFj(f, 0.0f);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        c689200R1q.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("measure1 h: ");
        sbLIZ2.append(c689200R1q.getMeasuredHeight());
        sbLIZ2.append(" t:");
        Layout layout = c689200R1q.getLayout();
        if (layout != null) {
            text = layout.getText();
        }
        sbLIZ2.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (c689200R1q.LLLILZJ) {
            CharSequence charSequenceLJJLIIIJJI = c689200R1q.LJJLIIIJJI(c689200R1q.LJIIIIZZ());
            c689200R1q.setExpand(false);
            if (charSequenceLJJLIIIJJI == null) {
                charSequenceLJJLIIIJJI = "";
            }
            c689200R1q.setText(charSequenceLJJLIIIJJI);
            c689200R1q.setMaxLines(Integer.MAX_VALUE);
            c689200R1q.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            return new C1312250kFj(f, c689200R1q.getMeasuredHeight());
        }
        return new C1312250kFj(f, c689200R1q.getMeasuredHeight());
    }
}
