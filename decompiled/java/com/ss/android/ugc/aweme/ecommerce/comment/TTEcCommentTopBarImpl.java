package com.ss.android.ugc.aweme.ecommerce.comment;

import X.AbstractC1351650lHH;
import X.C0PEM;
import X.C1351640lHG;
import X.C1351660lHI;
import X.C13LP;
import X.C1697810uHb;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2189821An6;
import X.C419910GdJ;
import X.C948503nH;
import X.EnumC1350510lFR;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSvCommentTopBarService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIconStyle;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarMargin;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class TTEcCommentTopBarImpl implements ICommentTopBarImplementService {
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final View createCustomizeTopBarView(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final List<Integer> getBizTypes() {
        return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.TT_SHOP.getValue()), Integer.valueOf(EnumC1350510lFR.TT_SHOWCASE.getValue()));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Integer getCustomizeTopBarViewLayout(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Drawable mapLocalIconDrawable(Context context, Integer num, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean needSetTextOnClickPressState(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentLongClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentTouchEvent(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, MotionEvent motionEvent) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onPause(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onResumeShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean canShow(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, String str, C2189821An6 c2189821An6) {
        IEcSvCommentTopBarService iEcSvCommentTopBarService = (IEcSvCommentTopBarService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcSvCommentTopBarService.class));
        if (iEcSvCommentTopBarService == null || !iEcSvCommentTopBarService.LIZJ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        AbstractC1351650lHH abstractC1351650lHHLIZ;
        C1351660lHI c1351660lHILIZ;
        Integer num = commentTopBarComponent.bizType;
        String str = commentTopBarComponent.bizId;
        if (c19eg != null && num != null && str != null && fragment != null) {
            IEcSvCommentTopBarService iEcSvCommentTopBarService = (IEcSvCommentTopBarService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcSvCommentTopBarService.class));
            if (iEcSvCommentTopBarService != null) {
                abstractC1351650lHHLIZ = iEcSvCommentTopBarService.LIZ(fragment, aweme, num, CommentContextSourceKt.enterFrom(commentContextSource));
            } else {
                abstractC1351650lHHLIZ = null;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C948503nH.LJ(C948503nH.LIZIZ(fragment), C2107308Nj.LIZ, new C1351640lHG(abstractC1351650lHHLIZ, fragment, num, str, aweme, null));
            CommentTopBarIcon commentTopBarIcon = commentTopBarComponent.icon;
            if ((commentTopBarIcon == null || commentTopBarIcon.iconUrl == null) && abstractC1351650lHHLIZ != null && (c1351660lHILIZ = abstractC1351650lHHLIZ.LIZ()) != null) {
                if (c1351660lHILIZ.LIZ == null) {
                    Integer num2 = c1351660lHILIZ.LIZIZ;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = iIntValue;
                        commentTopBarComponent.setIcon(new CommentTopBarIcon(null, new CommentTopBarIconStyle(24, null), new CommentTopBarMargin(null, null, 8, null), null, Boolean.TRUE, 1, c419910GdJ.LIZ(c19eg)));
                        return;
                    }
                    return;
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(Collections.singletonList(c1351660lHILIZ.LIZ));
                commentTopBarComponent.setIcon(new CommentTopBarIcon(urlModel, new CommentTopBarIconStyle(40, 4), new CommentTopBarMargin(null, null, 8, null), null, Boolean.FALSE, null, null));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        AbstractC1351650lHH abstractC1351650lHHLIZ;
        if (c19eg != null && fragment != null) {
            Integer num = commentTopBarComponent.bizType;
            IEcSvCommentTopBarService iEcSvCommentTopBarService = (IEcSvCommentTopBarService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcSvCommentTopBarService.class));
            if (iEcSvCommentTopBarService != null && (abstractC1351650lHHLIZ = iEcSvCommentTopBarService.LIZ(fragment, aweme, num, CommentContextSourceKt.enterFrom(commentContextSource))) != null) {
                abstractC1351650lHHLIZ.LIZLLL(fragment, c19eg);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        AbstractC1351650lHH abstractC1351650lHHLIZ;
        Integer num = commentTopBarComponent.bizType;
        IEcSvCommentTopBarService iEcSvCommentTopBarService = (IEcSvCommentTopBarService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcSvCommentTopBarService.class));
        if (iEcSvCommentTopBarService != null && (abstractC1351650lHHLIZ = iEcSvCommentTopBarService.LIZ(fragment, aweme, num, CommentContextSourceKt.enterFrom(commentContextSource))) != null) {
            abstractC1351650lHHLIZ.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        AbstractC1351650lHH abstractC1351650lHHLIZ;
        if (fragment == null) {
            return;
        }
        Integer num = commentTopBarComponent.bizType;
        IEcSvCommentTopBarService iEcSvCommentTopBarService = (IEcSvCommentTopBarService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcSvCommentTopBarService.class));
        if (iEcSvCommentTopBarService != null && (abstractC1351650lHHLIZ = iEcSvCommentTopBarService.LIZ(fragment, aweme, num, CommentContextSourceKt.enterFrom(commentContextSource))) != null) {
            abstractC1351650lHHLIZ.LJFF(fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onUnBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        IEcSvCommentTopBarService iEcSvCommentTopBarService = (IEcSvCommentTopBarService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcSvCommentTopBarService.class));
        if (iEcSvCommentTopBarService != null) {
            iEcSvCommentTopBarService.LIZIZ(fragment);
        }
    }
}
