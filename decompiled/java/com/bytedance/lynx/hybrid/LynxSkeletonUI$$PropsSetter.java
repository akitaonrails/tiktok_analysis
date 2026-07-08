package com.bytedance.lynx.hybrid;

import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes33.dex */
public class LynxSkeletonUI$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.lynx.tasm.behavior.ui.LynxBaseUI r5, java.lang.String r6, X.C1311730kEt r7) {
        /*
            r4 = this;
            r2 = r5
            com.bytedance.lynx.hybrid.LynxSkeletonUI r2 = (com.bytedance.lynx.hybrid.LynxSkeletonUI) r2
            r6.getClass()
            int r0 = r6.hashCode()
            r3 = 0
            switch(r0) {
                case -1992012396: goto L3c;
                case -1971595734: goto L33;
                case -1153009725: goto L25;
                case 114148: goto L1c;
                case 82301940: goto L12;
                default: goto Le;
            }
        Le:
            super.LIZ(r5, r6, r7)
            return
        L12:
            java.lang.String r0 = "fromalpha"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Le
            r1 = 4
            goto L2e
        L1c:
            java.lang.String r0 = "src"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4d
            goto Le
        L25:
            java.lang.String r0 = "toalpha"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Le
            r1 = 2
        L2e:
            r0 = 0
            switch(r1) {
                case 0: goto L65;
                case 1: goto L5d;
                case 2: goto L55;
                case 3: goto L4d;
                case 4: goto L45;
                default: goto L32;
            }
        L32:
            goto Le
        L33:
            java.lang.String r0 = "hasanimation"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5d
            goto Le
        L3c:
            java.lang.String r0 = "duration"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L65
            goto Le
        L45:
            float r0 = r7.LJ(r6, r0)
            r2.setFromAlpha(r0)
            return
        L4d:
            java.lang.String r0 = r7.LJII(r6)
            r2.setSrc(r0)
            return
        L55:
            float r0 = r7.LJ(r6, r0)
            r2.setToAlpha(r0)
            return
        L5d:
            boolean r0 = r7.LIZIZ(r6, r3)
            r2.setHasAnimation(r0)
            return
        L65:
            int r0 = r7.LJFF(r6, r3)
            r2.setDuration(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.LynxSkeletonUI$$PropsSetter.LIZ(com.lynx.tasm.behavior.ui.LynxBaseUI, java.lang.String, X.0kEt):void");
    }
}
