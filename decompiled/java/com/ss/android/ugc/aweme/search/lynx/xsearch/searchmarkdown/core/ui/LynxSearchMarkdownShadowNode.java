package com.ss.android.ugc.aweme.search.lynx.xsearch.searchmarkdown.core.ui;

import X.C07GD;
import X.C0BQE;
import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C1312290kFn;
import X.C21419418s4;
import X.C301240BrO;
import X.C341990Dav;
import X.C418440Gaw;
import X.C431730GwN;
import X.C688750Qzx;
import X.C689220R1s;
import X.C689240R1u;
import X.C814420VxA;
import X.EnumC431710GwL;
import X.InterfaceC1312240kFi;
import X.InterfaceC1312540kGC;
import X.InterfaceC342000Daw;
import android.content.Context;
import android.text.StaticLayout;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import j27.s;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxSearchMarkdownShadowNode extends ShadowNode implements InterfaceC1312240kFi {
    public C431730GwN LJIJJLI;
    public String LJIL = "";
    public boolean LJJ;
    public Integer LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public Integer LJJIII;
    public boolean LJJIIJ;

    @Override // X.InterfaceC1312240kFi
    public final void LIZJ(C1312290kFn c1312290kFn, C1312260kFk c1312260kFk) {
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJI() {
        this.LJIJJLI = null;
    }

    public LynxSearchMarkdownShadowNode() {
        LJI(this);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(s sVar) {
        this.LJIIL = sVar;
        if ((sVar instanceof Context) && sVar != null) {
            C431730GwN c431730GwN = new C431730GwN(sVar, null, 6);
            C341990Dav.LIZ(c431730GwN, sVar, 0, 0, null, 14);
            c431730GwN.setTruncateType(EnumC431710GwL.VIEW_ALL);
            c431730GwN.setCustomShowTruncateIcon(true);
            c431730GwN.setEnableToggleAction(false);
            this.LJIJJLI = c431730GwN;
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
        boolean zBooleanValue4;
        boolean zBooleanValue5;
        int iLIZIZ;
        EnumC431710GwL enumC431710GwL;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Number number;
        Boolean bool5;
        if (readableMap != null && (mapAsHashMap = readableMap.asHashMap()) != null) {
            if (!Intrinsics.LJFF(mapAsHashMap.get("content"), this.LJIL) && this.LJIL.length() > 0) {
                LJIILLIIL();
                this.LJJIII = null;
            }
            Object obj = mapAsHashMap.get("content");
            if (!(obj instanceof String) || (str = (String) obj) == null) {
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
            Object obj6 = mapAsHashMap.get("useSimpleMarkdown");
            if ((obj6 instanceof Boolean) && (bool2 = (Boolean) obj6) != null) {
                zBooleanValue4 = bool2.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            this.LJJIIJ = zBooleanValue4;
            Object obj7 = mapAsHashMap.get("markDirty");
            if ((obj7 instanceof Boolean) && (bool = (Boolean) obj7) != null) {
                zBooleanValue5 = bool.booleanValue();
            } else {
                zBooleanValue5 = false;
            }
            C431730GwN c431730GwN = this.LJIJJLI;
            if (c431730GwN == null) {
                return;
            }
            if (this.LJIL.length() > 0 && (!C301240BrO.LIZ() || !this.LJJIIJ)) {
                int iLIZ = C689220R1s.LIZ(this.LJJ, this.LJJI);
                if (C0BQE.LIZ()) {
                    if (c431730GwN.getTextNeedFold() && iLIZ != c431730GwN.getShowMaxLines()) {
                        c431730GwN.LLJJLIIIJLLLLLLLZ = null;
                    }
                    if (this.LJJII) {
                        enumC431710GwL = EnumC431710GwL.SEE_MORE;
                    } else {
                        enumC431710GwL = EnumC431710GwL.VIEW_ALL;
                    }
                    c431730GwN.setTruncateType(enumC431710GwL);
                    c431730GwN.setEnableDownChevron(this.LJJII);
                    s sVar = this.LJIIL;
                    if (sVar != null) {
                        if (this.LJJ) {
                            C341990Dav.LIZ(c431730GwN, sVar, 41, 0, null, 12);
                        } else {
                            C341990Dav.LIZ(c431730GwN, sVar, 51, 0, null, 12);
                        }
                    }
                }
                c431730GwN.setShowMaxLines(iLIZ);
                if (!this.LJJ) {
                    c431730GwN.LLJL = false;
                    c431730GwN.LLJLIL = true;
                } else {
                    c431730GwN.LLJL = true;
                    c431730GwN.LLJLIL = false;
                }
                String str2 = this.LJIL;
                C689240R1u c689240R1u = C689240R1u.LIZ;
                Context context = c431730GwN.getContext();
                c689240R1u.getClass();
                C21419418s4 c21419418s4LJ = C689240R1u.LJ(context, null);
                if (this.LJJ) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ = c21419418s4LJ.LJJIII;
                }
                C341990Dav.LIZLLL(c431730GwN, str2, C689240R1u.LIZ(c689240R1u, C21419418s4.LIZ(c21419418s4LJ, null, 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, iLIZIZ, false, false, 0, false, null, null, this.LJJIFFI, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -134217729, 16777207), this.LJJ, null, C0BQE.LIZ(), null, 10), null, null, null, null, null, null, C07GD.LIZ(), false, null, null, 3324);
            }
            if (C0BQE.LIZ() && zBooleanValue5) {
                LJIILLIIL();
            }
        }
    }

    @Override // X.InterfaceC1312240kFi
    public final C1312250kFj LIZ(C1312280kFm c1312280kFm, C1312230kFh c1312230kFh) {
        CharSequence charSequenceLIZLLL;
        float fLIZIZ = c1312230kFh.LIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(32.0f)));
        float f = c1312230kFh.LIZJ;
        if (C301240BrO.LIZ() && this.LJJIIJ) {
            Integer num = this.LJJIII;
            int iIntValue = 0;
            if (num != null && num.intValue() > 0) {
                Integer num2 = this.LJJIII;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                return new C1312250kFj(fLIZIZ, iIntValue);
            }
            int height = C688750Qzx.LIZ((int) fLIZIZ, C688750Qzx.LIZIZ(this.LJIJJLI, this.LJIL, this.LJJ), this.LJJ, null).getHeight();
            this.LJJIII = Integer.valueOf(height);
            return new C1312250kFj(fLIZIZ, height);
        }
        int i = (int) fLIZIZ;
        C431730GwN c431730GwN = this.LJIJJLI;
        if (c431730GwN != null) {
            InterfaceC342000Daw markdownContent = c431730GwN.getMarkdownContent();
            CharSequence charSequence = "";
            if (markdownContent == null || (charSequenceLIZLLL = markdownContent.LIZLLL()) == null) {
                charSequenceLIZLLL = "";
            }
            StaticLayout staticLayoutLJJJJLI = c431730GwN.LJJJJLI(i, charSequenceLIZLLL);
            if (staticLayoutLJJJJLI != null) {
                CharSequence charSequenceLJJJLIIL = c431730GwN.LJJJLIIL(staticLayoutLJJJJLI, charSequenceLIZLLL);
                if (charSequenceLJJJLIIL != null) {
                    charSequence = charSequenceLJJJLIIL;
                }
                if (c431730GwN.LJJJJLI(i, charSequence) != null) {
                    return new C1312250kFj(fLIZIZ, r0.getHeight());
                }
            }
        }
        return new C1312250kFj(fLIZIZ, f);
    }
}
