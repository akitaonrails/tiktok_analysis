package com.ss.android.ugc.aweme.template.view;

import X.C0C0F;
import X.C123100dR;
import X.C1390380mHk;
import X.C1398410mUh;
import X.C13BV;
import X.C13LP;
import X.C19576911iZ;
import X.C19EG;
import X.C628180OkS;
import X.C628290Okd;
import X.C628300Oke;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEpJD8/KTEpZzk6HELIOSLTJiHSo+OCktPSoXLTEtICMSPyAhLAM6OzEKOy40JSAiPQ==";
    public TemplateAnchorConfig LLLILZLLLI;
    public long LLLIZZ;
    public boolean LLLJ;
    public final ConcurrentHashMap<String, C628300Oke> LLLJIL = new ConcurrentHashMap<>();
    public boolean LLLJL;
    public CreativeDialogWrapper LLLL;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLLJIL.clear();
        CreativeDialogWrapper creativeDialogWrapper = this.LLLL;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
    }

    public static boolean uS(Aweme aweme) {
        Video video;
        VideoUrlModel playAddr;
        List<String> urlList;
        if (aweme != null && (video = aweme.getVideo()) != null && (playAddr = video.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null) {
            if (!urlList.isEmpty()) {
                Iterator<String> it2 = urlList.iterator();
                while (it2.hasNext()) {
                    if (!C123100dR.LIZ(it2.next())) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wS(com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel r10) {
        /*
            r9 = this;
            r1 = 1
            r9.LLLJL = r1
            com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper r0 = r9.LLLL
            if (r0 == 0) goto La
            r0.dismiss()
        La:
            r0 = 0
            r9.LLLJ = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Oke> r0 = r9.LLLJIL
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            if (r10 == 0) goto L22
            java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r10.awemeList
            if (r0 == 0) goto L22
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L22
        L21:
            return
        L22:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Oke> r0 = r9.LLLJIL
            java.util.Collection r0 = r0.values()
            java.util.List r1 = X.C13LP.LLIIII(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Oke> r0 = r9.LLLJIL
            r0.clear()
            java.util.Iterator r8 = r1.iterator()
        L35:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r5 = r8.next()
            X.0Oke r5 = (X.C628300Oke) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LIZIZ
            java.lang.String r2 = r0.getAid()
            if (r10 == 0) goto Lb8
            java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r10.awemeList
            if (r0 == 0) goto L99
            java.util.Iterator r1 = r0.iterator()
        L51:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r6 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
            java.lang.String r0 = r6.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L51
        L67:
            com.ss.android.ugc.aweme.template.TemplateAnchorConfig r0 = r9.LLLILZLLLI
            if (r0 == 0) goto L97
            int r7 = r0.getTemplateType()
        L6f:
            com.ss.android.ugc.aweme.template.TemplateAnchorConfig r0 = r9.LLLILZLLLI
            if (r0 == 0) goto L79
            java.lang.String r4 = r0.getTemplateId()
            if (r4 != 0) goto L7b
        L79:
            java.lang.String r4 = ""
        L7b:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r5.LJ
            long r2 = r2 - r0
            X.C628290Okd.LIZ(r7, r2, r4)
            if (r6 == 0) goto L35
            boolean r0 = uS(r6)
            if (r0 == 0) goto L35
            android.view.View r2 = r5.LIZ
            java.lang.String r1 = r5.LIZJ
            int r0 = r5.LIZLLL
            super.xe(r2, r6, r1, r0)
            goto L35
        L97:
            r7 = -1
            goto L6f
        L99:
            java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r10.topAwemeList
            if (r0 == 0) goto Lb8
            java.util.Iterator r1 = r0.iterator()
        La1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r6 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
            java.lang.String r0 = r6.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto La1
            goto L67
        Lb8:
            r6 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.template.view.TemplateDetailAwemeListFragment.wS(com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel):void");
    }

    public final void yS(boolean z) {
        C628180OkS c628180OkS;
        String str;
        int i;
        CreativeDialogWrapper creativeDialogWrapper = this.LLLL;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
        String string = getString(2131838915);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C1390380mHk.LJ(this, 10001, creativeToastBuilder);
        if (z) {
            T t = this.LLILZ.LL;
            if ((t instanceof C628180OkS) && (c628180OkS = (C628180OkS) t) != null && (str = c628180OkS.LLILZIL) != null && str.length() != 0 && (i = c628180OkS.LLILZLL) != -1) {
                c628180OkS.LJIIJ(i, 0L, 0, c628180OkS.LLILZIL, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        String templateId;
        Integer numValueOf;
        String enterFrom;
        String enterMethod;
        String mainAnchorType;
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        TemplateAnchorConfig templateAnchorConfig = this.LLLILZLLLI;
        AnchorCommonStruct anchor = null;
        if (templateAnchorConfig != null) {
            templateId = templateAnchorConfig.getTemplateId();
        } else {
            templateId = null;
        }
        smartRouteNR.withParam("template_id", templateId);
        TemplateAnchorConfig templateAnchorConfig2 = this.LLLILZLLLI;
        if (templateAnchorConfig2 != null) {
            numValueOf = Integer.valueOf(templateAnchorConfig2.getTemplateType());
        } else {
            numValueOf = null;
        }
        smartRouteNR.withParam("template_type", numValueOf);
        smartRouteNR.withParam("template_publish_count", this.LLLIZZ);
        TemplateAnchorConfig templateAnchorConfig3 = this.LLLILZLLLI;
        if (templateAnchorConfig3 != null) {
            enterFrom = templateAnchorConfig3.getEnterFrom();
        } else {
            enterFrom = null;
        }
        smartRouteNR.withParam("template_anchor_enter_from", enterFrom);
        TemplateAnchorConfig templateAnchorConfig4 = this.LLLILZLLLI;
        if (templateAnchorConfig4 != null) {
            enterMethod = templateAnchorConfig4.getEnterMethod();
        } else {
            enterMethod = null;
        }
        smartRouteNR.withParam("template_anchor_enter_method", enterMethod);
        TemplateAnchorConfig templateAnchorConfig5 = this.LLLILZLLLI;
        if (templateAnchorConfig5 != null) {
            mainAnchorType = templateAnchorConfig5.getMainAnchorType();
        } else {
            mainAnchorType = null;
        }
        smartRouteNR.withParam("main_anchor_type", mainAnchorType);
        TemplateAnchorConfig templateAnchorConfig6 = this.LLLILZLLLI;
        if (templateAnchorConfig6 != null) {
            anchor = templateAnchorConfig6.getAnchor();
        }
        smartRouteNR.withParam("template_anchor", anchor);
        return smartRouteNR;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC19400810vG
    public final void cb(boolean z, boolean z2) {
        super.cb(z, z2);
        this.LLLJL = false;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void xe(View view, Aweme aweme, String str, int i) {
        String templateId;
        Collection collection;
        Iterable iterable;
        String templateId2;
        TemplateDetailListModel templateDetailListModel;
        TemplateDetailListModel templateDetailListModel2;
        if (aweme == null) {
            return;
        }
        String str2 = "";
        int templateType = -1;
        if (C0C0F.LIZ()) {
            T t = this.LLILZ.LL;
            Object obj = null;
            if (!(t instanceof C628180OkS) || t == 0 || (templateDetailListModel2 = (TemplateDetailListModel) t.getData()) == null || (collection = templateDetailListModel2.awemeList) == null) {
                collection = C13BV.INSTANCE;
            }
            T t2 = this.LLILZ.LL;
            if (!(t2 instanceof C628180OkS) || t2 == 0 || (templateDetailListModel = (TemplateDetailListModel) t2.getData()) == null || (iterable = templateDetailListModel.topAwemeList) == null) {
                iterable = C13BV.INSTANCE;
            }
            Iterator it2 = ((ArrayList) C13LP.LJLIL(iterable, collection)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((Aweme) next).getAid(), aweme.getAid())) {
                    obj = next;
                    break;
                }
            }
            Aweme aweme2 = (Aweme) obj;
            if (aweme2 != null && uS(aweme2)) {
                super.xe(view, aweme2, str, i);
                TemplateAnchorConfig templateAnchorConfig = this.LLLILZLLLI;
                if (templateAnchorConfig != null) {
                    templateType = templateAnchorConfig.getTemplateType();
                }
                TemplateAnchorConfig templateAnchorConfig2 = this.LLLILZLLLI;
                if (templateAnchorConfig2 != null && (templateId2 = templateAnchorConfig2.getTemplateId()) != null) {
                    str2 = templateId2;
                }
                C628290Okd.LIZ(templateType, 0L, str2);
                return;
            }
            if (!uS(aweme)) {
                if (!this.LLLJ && !this.LLLJL) {
                    CreativeDialogWrapper creativeDialogWrapper = this.LLLL;
                    if (creativeDialogWrapper == null || !creativeDialogWrapper.isShowing()) {
                        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                        C19EG c19egRequireActivity = requireActivity();
                        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE);
                        creativeLoadingDialogBuilder.showProgress(false);
                        creativeLoadingDialogBuilder.backCanCancel(true);
                        creativeLoadingDialogBuilder.hasOverLay(false);
                        creativeLoadingDialogBuilder.clickCancelListener(new AwS588S0100000_9(this, 513));
                        CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(c19egRequireActivity, 1022, creativeLoadingDialogBuilder);
                        this.LLLL = creativeDialogWrapper2;
                        creativeDialogWrapper2.show();
                    }
                    this.LLLJIL.clear();
                    String aid = aweme.getAid();
                    if (aid == null) {
                        return;
                    }
                    this.LLLJIL.put(aid, new C628300Oke(view, aweme, str, i, System.currentTimeMillis()));
                    return;
                }
                yS(true);
                return;
            }
        }
        TemplateAnchorConfig templateAnchorConfig3 = this.LLLILZLLLI;
        if (templateAnchorConfig3 != null) {
            templateType = templateAnchorConfig3.getTemplateType();
        }
        TemplateAnchorConfig templateAnchorConfig4 = this.LLLILZLLLI;
        if (templateAnchorConfig4 != null && (templateId = templateAnchorConfig4.getTemplateId()) != null) {
            str2 = templateId;
        }
        C628290Okd.LIZ(templateType, 0L, str2);
        super.xe(view, aweme, str, i);
    }
}
