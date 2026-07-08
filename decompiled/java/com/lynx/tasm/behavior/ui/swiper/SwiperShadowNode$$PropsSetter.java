package com.lynx.tasm.behavior.ui.swiper;

import com.lynx.tasm.behavior.shadow.CustomLayoutShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class SwiperShadowNode$$PropsSetter extends CustomLayoutShadowNode$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
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
    @Override // com.lynx.tasm.behavior.shadow.CustomLayoutShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.lynx.tasm.behavior.shadow.ShadowNode r6, java.lang.String r7, X.C1311730kEt r8) {
        /*
            r5 = this;
            r2 = r6
            com.lynx.tasm.behavior.ui.swiper.SwiperShadowNode r2 = (com.lynx.tasm.behavior.ui.swiper.SwiperShadowNode) r2
            r7.getClass()
            int r0 = r7.hashCode()
            r4 = 0
            switch(r0) {
                case -1984141450: goto L4f;
                case -686438324: goto L40;
                case -111166008: goto L37;
                case 3357091: goto L2e;
                case 24002884: goto L25;
                case 201065357: goto L1b;
                case 1665556140: goto L12;
                default: goto Le;
            }
        Le:
            super.LIZIZ(r6, r7, r8)
            return
        L12:
            java.lang.String r0 = "page-margin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L58
            goto Le
        L1b:
            java.lang.String r0 = "max-y-scale"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Le
            r3 = 5
            goto L49
        L25:
            java.lang.String r0 = "previous-margin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L68
            goto Le
        L2e:
            java.lang.String r0 = "mode"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L70
            goto Le
        L37:
            java.lang.String r0 = "next-margin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L78
            goto Le
        L40:
            java.lang.String r0 = "max-x-scale"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Le
            r3 = 1
        L49:
            r0 = 0
            switch(r3) {
                case 0: goto L88;
                case 1: goto L80;
                case 2: goto L78;
                case 3: goto L70;
                case 4: goto L68;
                case 5: goto L60;
                case 6: goto L58;
                default: goto L4e;
            }
        L4e:
            goto Le
        L4f:
            java.lang.String r0 = "vertical"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L88
            goto Le
        L58:
            X.0jsr r0 = r8.LIZLLL(r7)
            r2.setPageMargin(r0)
            return
        L60:
            double r0 = r8.LIZJ(r7, r0)
            r2.setMaxYScale(r0)
            return
        L68:
            X.0jsr r0 = r8.LIZLLL(r7)
            r2.setPreviousMargin(r0)
            return
        L70:
            java.lang.String r0 = r8.LJII(r7)
            r2.setMode(r0)
            return
        L78:
            X.0jsr r0 = r8.LIZLLL(r7)
            r2.setNextMargin(r0)
            return
        L80:
            double r0 = r8.LIZJ(r7, r0)
            r2.setMaxXScale(r0)
            return
        L88:
            boolean r0 = r8.LIZIZ(r7, r4)
            r2.setVertical(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.swiper.SwiperShadowNode$$PropsSetter.LIZIZ(com.lynx.tasm.behavior.shadow.ShadowNode, java.lang.String, X.0kEt):void");
    }
}
