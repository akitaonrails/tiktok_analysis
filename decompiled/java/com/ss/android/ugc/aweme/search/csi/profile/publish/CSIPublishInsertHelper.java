package com.ss.android.ugc.aweme.search.csi.profile.publish;

import X.C0PIW;
import X.C356901a3;
import X.C565120MEk;
import X.C645130PSd;
import Y.ARunnableS79S0200000_10;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$RecyclerViewAbility;
import com.ss.android.ugc.aweme.search.csi.profile.publish.CSIPublishInsertHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class CSIPublishInsertHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final Fragment LL;
    public C0PIW LLILLJJLI;
    public ISocialPublishBridgeService LLILLL;
    public C645130PSd LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public CSIPublishInsertHelper(Fragment fragment) {
        this.LL = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0PIW, com.ss.android.ugc.aweme.story.publish.SocialPublishCallback] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        this.LLILLL = iSocialPublishBridgeService;
        ?? r1 = new SocialPublishCallback() { // from class: X.0PIW
            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishStart(PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onReadyToCreateAweme(PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onReportPublish() {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onSynthesisSuccess(PublishModel publishModel, String str) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
                String str;
                Aweme aweme;
                SearchServiceCenter$RecyclerViewAbility searchServiceCenter$RecyclerViewAbility;
                RecyclerView recyclerViewLLII;
                if (publishModel != null) {
                    str = publishModel.shootWay;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "educate_phase_iii") || (aweme = createAwemeResponse.aweme) == null) {
                    return;
                }
                CSIPublishInsertHelper cSIPublishInsertHelper = this.LL;
                if (cSIPublishInsertHelper.LL.isAdded()) {
                    InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(cSIPublishInsertHelper.LL, null);
                    SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, SearchServiceCenter$AdapterControlAbility.class, null);
                    if (searchServiceCenter$AdapterControlAbility != null) {
                        SearchMixFeed searchMixFeed = new SearchMixFeed();
                        searchMixFeed.setAweme(aweme);
                        searchMixFeed.setProviderDocIdStr(aweme.getAid());
                        searchMixFeed.setFeedType(1);
                        C645130PSd c645130PSd = cSIPublishInsertHelper.LLILZ;
                        int i = 0;
                        if (c645130PSd != null) {
                            int iLLLLILI = c645130PSd.LLLLILI();
                            int itemCount = c645130PSd.getItemCount();
                            int i2 = 0;
                            while (true) {
                                if (i2 < itemCount) {
                                    SearchMixFeed searchMixFeedLLLLJI = c645130PSd.LLLLJI(i2 + iLLLLILI);
                                    if (searchMixFeedLLLLJI != null && searchMixFeedLLLLJI.getAweme() != null) {
                                        i = i2;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                        if (searchServiceCenter$AdapterControlAbility.ZG2(searchMixFeed, i, C0PL2.OUT_SOURCE_REPLACE) && (searchServiceCenter$RecyclerViewAbility = (SearchServiceCenter$RecyclerViewAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, SearchServiceCenter$RecyclerViewAbility.class, null)) != null && (recyclerViewLLII = searchServiceCenter$RecyclerViewAbility.LLII()) != null) {
                            HandlerHook.viewPost(recyclerViewLLII, new ARunnableS79S0200000_10(cSIPublishInsertHelper, recyclerViewLLII, 63));
                        }
                    }
                }
            }
        };
        this.LLILLJJLI = r1;
        if (iSocialPublishBridgeService != 0) {
            iSocialPublishBridgeService.Kg(r1, new C565120MEk());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        ISocialPublishBridgeService iSocialPublishBridgeService;
        C0PIW c0piw = this.LLILLJJLI;
        if (c0piw != null && (iSocialPublishBridgeService = this.LLILLL) != null) {
            iSocialPublishBridgeService.f8(c0piw);
        }
        this.LLILLJJLI = null;
    }
}
