package com.ss.android.ugc.aweme.music.adapter;

import X.AbstractC1255880imo;
import X.AbstractC1261240ivS;
import X.AbstractC636100OxE;
import X.C0BM3;
import X.C1255920ims;
import X.C1388190mED;
import X.C1398410mUh;
import X.C1398640mV4;
import X.C1400670mYL;
import X.C1400750mYT;
import X.C1400760mYU;
import X.C1400770mYV;
import X.C1400780mYW;
import X.C1400820mYa;
import X.C1401090mZ1;
import X.C1401320mZO;
import X.C1401450mZb;
import X.C1401470mZd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1618440sDa;
import X.C19EG;
import X.C20684815ws;
import X.C21263918Jh;
import X.C2255108sX;
import X.C2344009Gk;
import X.C294100Bfs;
import X.C635990Ox3;
import X.C729510SjV;
import X.C786410Ut5;
import X.InterfaceC1260110itd;
import X.InterfaceC214902198i;
import X.InterfaceC494301wD;
import X.InterfaceC629450OmV;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BehindTheSongMetaData;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility;
import com.ss.android.ugc.aweme.music.ability.MDPMusicAwemeModelProvider;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import com.ss.android.ugc.aweme.music.ui.MusicDetailRootFragment;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicMultiTypeProvider extends AbstractC636100OxE {
    public static final C1400750mYT Companion = new Object() { // from class: X.0mYT
    };
    public transient DetailAwemeListFragment awemeListFragment;
    public final String fromGroupId;
    public final MusicAwemeListRequestModel musicAwemeListRequestModel;
    public final String musicId;
    public final InterfaceC629450OmV providerFactory;
    public boolean uploadCacheSize = true;

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C635990Ox3.LJFF(this, str);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
        return false;
    }

    public final DetailAwemeListFragment getAwemeListFragment() {
        return this.awemeListFragment;
    }

    private final void mobCacheViewCount(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "tool_performance_music_detail_pre_load_item_view_count");
        c2344009Gk.LIZJ(0, "totaltime");
        c2344009Gk.LIZJ(i, "totalstep");
        C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c2344009Gk.LIZ);
    }

    private final boolean needShowBehindTheSongView(Aweme aweme) {
        List<String> behindTheSongMusicIds;
        if (aweme != null) {
            if (aweme.getBehindTheSongMetaData() == null) {
                if (aweme != null && aweme.getBehindTheSongMusicIds() != null && (behindTheSongMusicIds = aweme.getBehindTheSongMusicIds()) != null) {
                    String str = this.musicId;
                    if (str == null) {
                        str = "";
                    }
                    if (!behindTheSongMusicIds.contains(str)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null) {
            return this.providerFactory.provider(viewHolder.getItemViewType()).needCallHolderAttached(viewHolder);
        }
        return false;
    }

    public final void setAwemeListFragment(DetailAwemeListFragment detailAwemeListFragment) {
        this.awemeListFragment = detailAwemeListFragment;
    }

    @Override // X.AbstractC636100OxE
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        int i2;
        if (C729510SjV.LJJIJIL(aweme)) {
            return 140042;
        }
        if (aweme instanceof C1401090mZ1) {
            return 110001;
        }
        if (aweme instanceof C1401450mZb) {
            return 120000;
        }
        if (needShowBehindTheSongView(aweme)) {
            if (aweme != null) {
                BehindTheSongMetaData behindTheSongMetaData = aweme.getBehindTheSongMetaData();
                if (behindTheSongMetaData != null) {
                    i2 = behindTheSongMetaData.behindTheSongType;
                } else {
                    i2 = 1;
                }
                AwemeBizExtKt.setBehindTheSongVideoType(aweme, i2);
                return 110003;
            }
            return 110003;
        }
        if (aweme instanceof C1400760mYU) {
            return 110005;
        }
        if (aweme instanceof C1400670mYL) {
            return 110009;
        }
        if (aweme instanceof C1400820mYa) {
            return 110010;
        }
        if (aweme instanceof C1400780mYW) {
            return 110011;
        }
        if (aweme != null && AwemeExtKt.isMDPSquareType(aweme)) {
            if (aweme.getDetailPageItemType() == VideoTag.MDP_SQUARE_MUSIC.getVideoTag()) {
                return 110006;
            }
            if (aweme.getDetailPageItemType() == VideoTag.MDP_SQUARE_EFFECT.getVideoTag()) {
                return 110007;
            }
            if (aweme.getDetailPageItemType() == VideoTag.MDP_SQUARE_TEMPLATE.getVideoTag()) {
                return 110008;
            }
            return super.getDetailAwemeViewType(i, aweme);
        }
        return super.getDetailAwemeViewType(i, aweme);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
        return getJumpToVideoParam(c1398410mUh, aweme, 0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
        C1401320mZO c1401320mZO;
        MusicDetailActivity musicDetailActivity;
        boolean z;
        MusicDetailActivity musicDetailActivity2;
        C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims = new C1255920ims<>();
        if (!C0BM3.LIZ() || !(c19eg instanceof MusicDetailActivity) || (musicDetailActivity2 = (MusicDetailActivity) c19eg) == null || (c1401320mZO = musicDetailActivity2.LLLLZI()) == null) {
            c1401320mZO = new C1401320mZO();
        }
        if (c19eg instanceof MusicDetailActivity) {
            musicDetailActivity = (MusicDetailActivity) c19eg;
        } else {
            musicDetailActivity = null;
        }
        if (musicDetailActivity != null) {
            z = musicDetailActivity.LLJJIII;
        } else {
            z = false;
        }
        c1401320mZO.LLJJIJIIJIL = z;
        String str = this.fromGroupId;
        if (str != null) {
            c1401320mZO.LLJI = str;
        }
        MusicAwemeListRequestModel musicAwemeListRequestModel = this.musicAwemeListRequestModel;
        if (musicAwemeListRequestModel != null) {
            c1401320mZO.LLJIJIL = musicAwemeListRequestModel;
        }
        c1401320mZO.LLILLL = true;
        c1255920ims.LJIIJ(c1401320mZO);
        if (c19eg != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19eg, null);
            MDPMusicAwemeModelProvider mDPMusicAwemeModelProvider = new MDPMusicAwemeModelProvider(c1401320mZO);
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJI, IMDPMusicAwemeModelAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJI, mDPMusicAwemeModelProvider, IMDPMusicAwemeModelAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(mDPMusicAwemeModelProvider);
                        return c1255920ims;
                    }
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(mDPMusicAwemeModelProvider);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IMDPMusicAwemeModelAbility.class.getClassLoader(), new Class[]{IMDPMusicAwemeModelAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJI, (InterfaceC494301wD) objNewProxyInstance, IMDPMusicAwemeModelAbility.class, null, null);
                        return c1255920ims;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility");
                }
            }
        }
        return c1255920ims;
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
        return this.providerFactory.provider(i).getJumpToVideoParam(c1398410mUh, aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1255920ims<?> getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        MusicDetailRootFragment musicDetailRootFragment;
        C1401320mZO c1401320mZO;
        if ((interfaceC214902198i instanceof MusicDetailRootFragment) && (musicDetailRootFragment = (MusicDetailRootFragment) interfaceC214902198i) != null) {
            C1255920ims<?> c1255920ims = new C1255920ims<>();
            if (!C0BM3.LIZ() || (c1401320mZO = musicDetailRootFragment.hS()) == null) {
                c1401320mZO = new C1401320mZO();
            }
            c1401320mZO.LLJJIJIIJIL = musicDetailRootFragment.LLJJIJIIJIL;
            String str = this.fromGroupId;
            if (str != null) {
                c1401320mZO.LLJI = str;
            }
            MusicAwemeListRequestModel musicAwemeListRequestModel = this.musicAwemeListRequestModel;
            if (musicAwemeListRequestModel != null) {
                c1401320mZO.LLJIJIL = musicAwemeListRequestModel;
            }
            c1401320mZO.LLILLL = true;
            c1255920ims.LJIIJ(c1401320mZO);
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF((Fragment) interfaceC214902198i, null);
            MDPMusicAwemeModelProvider mDPMusicAwemeModelProvider = new MDPMusicAwemeModelProvider(c1401320mZO);
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IMDPMusicAwemeModelAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, mDPMusicAwemeModelProvider, IMDPMusicAwemeModelAbility.class, null, null);
                return c1255920ims;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(mDPMusicAwemeModelProvider);
                    return c1255920ims;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(mDPMusicAwemeModelProvider);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IMDPMusicAwemeModelAbility.class.getClassLoader(), new Class[]{IMDPMusicAwemeModelAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IMDPMusicAwemeModelAbility.class, null, null);
                    return c1255920ims;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.ability.IMDPMusicAwemeModelAbility");
            }
        }
        return super.getPresenter(i, c19eg, interfaceC214902198i);
    }

    public MusicMultiTypeProvider(InterfaceC629450OmV interfaceC629450OmV, String str, String str2, MusicAwemeListRequestModel musicAwemeListRequestModel) {
        this.providerFactory = interfaceC629450OmV;
        this.musicId = str;
        this.fromGroupId = str2;
        this.musicAwemeListRequestModel = musicAwemeListRequestModel;
    }

    @Override // X.AbstractC636100OxE
    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, InterfaceC1260110itd interfaceC1260110itd) {
        AbstractC1261240ivS abstractC1261240ivSOnCreateDetailAwemeViewHolder;
        View viewTd;
        boolean zLJI = MethodIDManager.LJI(202203);
        switch (i) {
            case 110001:
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = new C1400770mYV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dqa, viewGroup, false), str, interfaceC1260110itd);
                break;
            case 110003:
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = new C1398640mV4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dqb, viewGroup, false), str, interfaceC1260110itd);
                break;
            case 110005:
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = this.providerFactory.provider(i).onCreateDetailAwemeViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dqj, viewGroup, false), str, interfaceC1260110itd);
                break;
            case 110009:
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = this.providerFactory.provider(i).onCreateDetailAwemeViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dql, viewGroup, false), str, interfaceC1260110itd);
                break;
            case 110010:
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = this.providerFactory.provider(i).onCreateDetailAwemeViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dqk, viewGroup, false), str, interfaceC1260110itd);
                break;
            case 110011:
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = this.providerFactory.provider(i).onCreateDetailAwemeViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dqe, viewGroup, false), str, interfaceC1260110itd);
                break;
            case 120000:
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = new C1401470mZd(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dqd, viewGroup, false), str, interfaceC1260110itd);
                break;
            case 140042:
                IStoryFollowUpPublishService iStoryFollowUpPublishServiceLJIILLIIL = C1618440sDa.LIZIZ.LJIILLIIL();
                if (iStoryFollowUpPublishServiceLJIILLIIL == null || (abstractC1261240ivSOnCreateDetailAwemeViewHolder = iStoryFollowUpPublishServiceLJIILLIIL.LIZIZ(viewGroup, str, interfaceC1260110itd, this.awemeListFragment)) == null) {
                    abstractC1261240ivSOnCreateDetailAwemeViewHolder = this.providerFactory.provider(i).onCreateDetailAwemeViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bk3, viewGroup, false), str, interfaceC1260110itd);
                }
                break;
            default:
                Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
                if (this.uploadCacheSize) {
                    mobCacheViewCount(C21263918Jh.LIZIZ(activityLIZ, "Music_detail_base_item_detail_aweme"));
                    this.uploadCacheSize = false;
                }
                if (C294100Bfs.LIZJ && activityLIZ != null) {
                    viewTd = C21263918Jh.LIZJ(activityLIZ, "Music_detail_base_item_detail_aweme", new AwS553S0100000_9(viewGroup, 912));
                } else {
                    viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bk3, viewGroup, false);
                }
                abstractC1261240ivSOnCreateDetailAwemeViewHolder = this.providerFactory.provider(i).onCreateDetailAwemeViewHolder(viewTd, str, interfaceC1260110itd);
                break;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return abstractC1261240ivSOnCreateDetailAwemeViewHolder;
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
        this.providerFactory.provider(i).interceptSmartRoute(view, i, smartRoute, aweme, c1398410mUh);
    }
}
