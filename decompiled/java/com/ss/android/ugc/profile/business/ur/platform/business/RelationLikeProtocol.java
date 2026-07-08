package com.ss.android.ugc.profile.business.ur.platform.business;

import X.C1176850gjL;
import X.C1250210idf;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationLikeProtocol extends ProfilePlatformProtocol<RelationData> {
    public String LLJJJIL;
    public RelationData LLJJJJ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "relation_info_like";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        TextView textView;
        String string;
        Resources resources;
        Describe describe;
        Describe describe2;
        Describe describe3;
        Describe describe4;
        Describe describe5;
        RelationData relationData = this.LLJJJJ;
        String text = (relationData == null || (describe5 = relationData.getDescribe()) == null) ? null : describe5.getText();
        T t = this.LLJILJIL;
        if (!Intrinsics.LJFF(text, (t == 0 || (describe4 = t.getDescribe()) == null) ? null : describe4.getText())) {
            RelationData relationData2 = this.LLJJJJ;
            String subText = (relationData2 == null || (describe3 = relationData2.getDescribe()) == null) ? null : describe3.getSubText();
            T t2 = this.LLJILJIL;
            if (!Intrinsics.LJFF(subText, (t2 == 0 || (describe2 = t2.getDescribe()) == null) ? null : describe2.getSubText())) {
                View view = this.LLILZLL;
                if ((view instanceof LinearLayout) && view != null && (textView = (TextView) view.findViewById(R.id.s5w)) != null) {
                    T t3 = this.LLJILJIL;
                    if (t3 == 0 || (describe = t3.getDescribe()) == null || (string = describe.getSubText()) == null) {
                        Context context = getContext();
                        string = (context == null || (resources = context.getResources()) == null) ? null : resources.getString(2131837650);
                    }
                    textView.setText(string);
                }
            }
        }
        TextView textView2 = (TextView) this.LLILZLL.findViewById(R.id.s5x);
        if (textView2 == null) {
            return false;
        }
        RelationData relationData3 = (RelationData) this.LLJILJIL;
        textView2.setText(C1176850gjL.LIZ(1, relationData3 != null ? relationData3.getTotalFavorite() : null, "-"));
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJI() {
        View view;
        if (!C268330AfP.LJIIIZ() || (view = this.LLILZLL) == null) {
            return;
        }
        C426750GoL.LJIIL(view, Integer.valueOf(C268330AfP.LIZLLL() ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0, 0, 0, 16);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJIFFI() {
        Resources resources;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getString(2131837650);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.business.RelationLikeProtocol.LJII(android.view.View):boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        RelationData relationData;
        try {
            relationData = (RelationData) C1250210idf.LIZ(nVar.toString(), RelationData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            relationData = null;
        }
        this.LLJILJIL = relationData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r3) != false) goto L28;
     */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r7) {
        /*
            r6 = this;
            com.google.gson.n r0 = r7.bizData
            r3 = 0
            if (r0 == 0) goto L64
            java.lang.String r2 = r0.toString()
        L9:
            java.lang.String r0 = r6.LLJJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r5 = 0
            if (r0 != 0) goto L5f
            com.google.gson.n r0 = r7.bizData
            if (r0 == 0) goto L5f
            r6.LJJJLZIJ(r0)
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r4 = r6.LLJILJIL
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r4 = (com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData) r4
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJ
            if (r0 == 0) goto L66
            java.lang.Long r1 = r0.getTotalFavorite()
            java.lang.Long r0 = r4.getTotalFavorite()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L66
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJ
            if (r0 == 0) goto L62
            java.lang.String r1 = r0.getNumber()
        L37:
            java.lang.String r0 = r4.getNumber()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L66
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r6.LLJJJJ
            if (r0 == 0) goto L60
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r0.getDescribe()
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.getText()
        L4f:
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L59
            java.lang.String r3 = r0.getText()
        L59:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L66
        L5f:
            return r5
        L60:
            r1 = r3
            goto L4f
        L62:
            r1 = r3
            goto L37
        L64:
            r2 = r3
            goto L9
        L66:
            r6.LJJLIIIJILLIZJL()
            r6.LLJJJIL = r2
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r6.LLJILJIL
            com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = (com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData) r0
            r6.LLJJJJ = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.business.RelationLikeProtocol.LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):boolean");
    }
}
