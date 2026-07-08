package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C04TD;
import X.C1483410ohn;
import X.C197039127h;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C23250099c;
import X.C297010BkZ;
import X.C332740D2q;
import X.C631370Opb;
import X.C708510Rqj;
import X.C722070SUb;
import X.C722080SUc;
import X.C722100SUe;
import X.C722110SUf;
import X.C723000SXq;
import X.C723040SXu;
import X.InterfaceC1481730of5;
import X.InterfaceC1483670oiD;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.IPlaylistBusinessService;
import com.ss.android.ugc.aweme.mix.services.PlaylistBusinessService;
import com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AbS502S0200000_11 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS502S0200000_11 abS502S0200000_11, View view) {
        C722070SUb consumer;
        C722080SUc c722080SUcLIZJ;
        if (view != null) {
            C2271391DvN.LIZ((C722110SUf) abS502S0200000_11.l0, (C1A5L) C2271381DvM.LLZ.getValue());
            IDeclarationService.LIZ.getClass();
            IDeclarationService iDeclarationServiceLIZ = C708510Rqj.LIZ();
            if (iDeclarationServiceLIZ != null && (consumer = iDeclarationServiceLIZ.getConsumer()) != null && (c722080SUcLIZJ = C722070SUb.LIZJ(((C722100SUe) abS502S0200000_11.l1).LIZIZ)) != null) {
                ((C722100SUe) abS502S0200000_11.l1).LJI("info_bar_click");
                consumer.LIZIZ(c722080SUcLIZJ);
            }
        }
    }

    public static final void LIZ$1(AbS502S0200000_11 abS502S0200000_11, View view) {
        PlayListInfo playListInfo;
        String mixId;
        IPlaylistBusinessService iPlaylistBusinessService;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        float currentPosition;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        if (view != null && (playListInfo = ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme().playlist_info) != null && (mixId = playListInfo.getMixId()) != null) {
            String mixId2 = null;
            int i = 0;
            if (!C297010BkZ.LIZ()) {
                if (((InteractPlayListBottomBarAssem) abS502S0200000_11.l0).jq().vQ2(mixId, ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme().getAid())) {
                    ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0).jq().wQ2(((C197039127h) abS502S0200000_11.l1).getContext(), ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme(), ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).mEventType, true);
                } else {
                    ((C197039127h) abS502S0200000_11.l1).setLoading(true);
                    InteractPlayListBottomBarAssem interactPlayListBottomBarAssem = (InteractPlayListBottomBarAssem) abS502S0200000_11.l0;
                    interactPlayListBottomBarAssem.LLLIL = true;
                    interactPlayListBottomBarAssem.jq().xQ2(((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme());
                }
            } else {
                ((C197039127h) abS502S0200000_11.l1).setLoading(true);
                InteractPlayListBottomBarAssem interactPlayListBottomBarAssem2 = (InteractPlayListBottomBarAssem) abS502S0200000_11.l0;
                interactPlayListBottomBarAssem2.LLLIL = true;
                ((C723000SXq) interactPlayListBottomBarAssem2.LLLII.getValue()).LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                Object objLIZ = C04TD.LIZ(IPlaylistBusinessService.class, false);
                if (objLIZ != null) {
                    iPlaylistBusinessService = (IPlaylistBusinessService) objLIZ;
                } else {
                    if (C04TD.f116p2 == null) {
                        synchronized (IPlaylistBusinessService.class) {
                            if (C04TD.f116p2 == null) {
                                C04TD.f116p2 = new PlaylistBusinessService();
                            }
                        }
                    }
                    iPlaylistBusinessService = C04TD.f116p2;
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((InteractPlayListBottomBarAssem) abS502S0200000_11.l0), null, null, new C723040SXu(iPlaylistBusinessService.LIZ(mixId, (C723000SXq) ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0).LLLII.getValue()), (InteractPlayListBottomBarAssem) abS502S0200000_11.l0, (C197039127h) abS502S0200000_11.l1, null), 3);
            }
            ContentModel contentModel = ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme().getContentModel();
            if (contentModel == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) == null || !Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE)) {
                if (AwemeExtKt.isPhotoMode(((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme()) && (photoModeImageInfo = ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme().getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty()) {
                    Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        SubscriptionInfo subscriptionInfo = it2.next().subscriptionInfo;
                        if (subscriptionInfo != null && Intrinsics.LJFF(subscriptionInfo.isPreview(), Boolean.FALSE)) {
                            i = 1;
                            break;
                        }
                    }
                }
            } else {
                i = 1;
                break;
            }
            IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
            String str = ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).mEventType;
            PlayListInfo playListInfo2 = ((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme().playlist_info;
            if (playListInfo2 != null) {
                mixId2 = playListInfo2.getMixId();
            }
            String strLIZ = C332740D2q.LIZ(((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme());
            String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme());
            InterfaceC1483670oiD interfaceC1483670oiDLJIILL = C1483410ohn.LJLJJI().LJIILL();
            if (interfaceC1483670oiDLJIILL != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiDLJIILL.LJIIIZ()) != null) {
                currentPosition = interfaceC1481730of5LJIIIZ.getCurrentPosition();
            } else {
                currentPosition = 0.0f;
            }
            iMixFeedService.LJIILIIL(str, mixId2, strLIZ, authorUid, currentPosition, "click_banner_playnext", null, Integer.valueOf(((VideoItemParams) C631370Opb.LIZ((InteractPlayListBottomBarAssem) abS502S0200000_11.l0)).getAweme().getVideo().getDuration()), Integer.valueOf(i), Integer.valueOf(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS502S0200000_11(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
