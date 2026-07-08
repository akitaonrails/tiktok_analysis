package com.lynx.xelement.input;

import X.C1311670kEn;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.xelement.input.LynxUIInputNG;
import com.lynx.xelement.input.LynxUIInputNGShadowNode;
import com.lynx.xelement.input.LynxUITextAreaNG;
import com.lynx.xelement.input.LynxUITextAreaNGShadowNode;
import j27.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class BehaviorGenerator {
    public static List<C1311670kEn> getBehaviors() {
        ArrayList arrayList = new ArrayList();
        final int i = 0;
        arrayList.add(new C1311670kEn(i) { // from class: X.1G0h
            public final int $t;

            @Override // X.C1311670kEn
            public final ShadowNode LJ() {
                switch (this.$t) {
                    case 0:
                        return LJ$0(this);
                    case 1:
                        return LJ$1(this);
                    default:
                        return super.LJ();
                }
            }

            @Override // X.C1311670kEn
            public final LynxUI LJI(s sVar, Object obj) {
                switch (this.$t) {
                    case 0:
                        return LJI$0(this, sVar, obj);
                    case 1:
                        return LJI$1(this, sVar, obj);
                    default:
                        return super.LJI(sVar, obj);
                }
            }

            public static final ShadowNode LJ$0(C2325291G0h c2325291G0h) {
                return new LynxUITextAreaNGShadowNode();
            }

            public static final ShadowNode LJ$1(C2325291G0h c2325291G0h) {
                return new LynxUIInputNGShadowNode();
            }

            public static final LynxUI LJI$0(C2325291G0h c2325291G0h, s sVar, Object obj) {
                return new LynxUITextAreaNG(sVar, obj);
            }

            public static final LynxUI LJI$1(C2325291G0h c2325291G0h, s sVar, Object obj) {
                return new LynxUIInputNG(sVar, obj);
            }
        });
        final int i2 = 1;
        arrayList.add(new C1311670kEn(i2) { // from class: X.1G0h
            public final int $t;

            @Override // X.C1311670kEn
            public final ShadowNode LJ() {
                switch (this.$t) {
                    case 0:
                        return LJ$0(this);
                    case 1:
                        return LJ$1(this);
                    default:
                        return super.LJ();
                }
            }

            @Override // X.C1311670kEn
            public final LynxUI LJI(s sVar, Object obj) {
                switch (this.$t) {
                    case 0:
                        return LJI$0(this, sVar, obj);
                    case 1:
                        return LJI$1(this, sVar, obj);
                    default:
                        return super.LJI(sVar, obj);
                }
            }

            public static final ShadowNode LJ$0(C2325291G0h c2325291G0h) {
                return new LynxUITextAreaNGShadowNode();
            }

            public static final ShadowNode LJ$1(C2325291G0h c2325291G0h) {
                return new LynxUIInputNGShadowNode();
            }

            public static final LynxUI LJI$0(C2325291G0h c2325291G0h, s sVar, Object obj) {
                return new LynxUITextAreaNG(sVar, obj);
            }

            public static final LynxUI LJI$1(C2325291G0h c2325291G0h, s sVar, Object obj) {
                return new LynxUIInputNG(sVar, obj);
            }
        });
        return arrayList;
    }
}
