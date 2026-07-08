package com.ss.android.ugc.feed.platform.fragment;

import X.C01GW;
import X.C0SZ8;
import X.C1255920ims;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561620qjw;
import X.C1561790qkD;
import X.C1566080qr8;
import X.C1566090qr9;
import X.C1566110qrB;
import X.C1566140qrE;
import X.C1568160quU;
import X.C1578630rBN;
import X.C1591220rVg;
import X.C1603210rp1;
import X.C2188811AlT;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C798410VTr;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC665370Q7z;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class HomeFeedComponent extends FragmentComponent implements IHomeFeedFragmentAbility, IFeedFetchDataAbility {
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1561790qkD(this));
    public final C01GW LLJILJILJ;
    public IPageStateAbility LLJILLL;
    public LoadMorePanelComponentTempHelper LLJJ;
    public IRefreshAbility LLJJI;

    public /* synthetic */ int Um(List list) {
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final Fragment Go() {
        return (Fragment) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IViewPagerComponentAbility Mb() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJILJILJ.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }

    public HomeFeedComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1509), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1561620qjw(false, this));
        }
        this.LLJILJILJ = c01gwLIZIZ;
    }

    public boolean LJJJJI() {
        return !(KB1() != null ? r0.LJIIL() : false);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean isLoading() {
        C1255920ims<?> c1255920imsKB1 = KB1();
        if (c1255920imsKB1 != null) {
            return c1255920imsKB1.LJIIL();
        }
        return false;
    }

    public C0SZ8 k4() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            return iViewPagerComponentAbilityMb.LJLIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy():");
        sbLIZ.append(this);
        C1566080qr8.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentGo = Go();
        if (fragmentGo != null) {
            C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAttach():");
            sbLIZ.append(this);
            C1566080qr8.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null);
            if (C1591220rVg.LIZIZ()) {
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentGo, null), this, IFeedFetchDataAbility.class, null, fragmentGo);
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentGo, null), this, IFeedFragmentAbility.class, null, fragmentGo);
            } else {
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentGo, null), this, IFeedFetchDataAbility.class, null, null);
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentGo, null), this, IFeedFragmentAbility.class, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IRefreshAbility E80() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final ILoadMoreAbility Ew0() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IPageStateAbility sl0() {
        return this.LLJILLL;
    }

    public boolean EQ(String str) {
        return LLLLL();
    }

    public boolean Ed(String str) {
        return q9();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.FragmentComponent, X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        boolean z;
        String str;
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated():");
        sbLIZ.append(this);
        IPageStateAbility iPageStateAbility = null;
        C1566080qr8.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null);
        if (view != null) {
            Fragment fragmentGo = Go();
            if (fragmentGo != null) {
                this.LLJJI = (IRefreshAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IRefreshAbility.class, null);
                LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper = new LoadMorePanelComponentTempHelper(fragmentGo);
                this.LLJJ = loadMorePanelComponentTempHelper;
                if (!LoadMorePanelComponentTempHelper.LLILZLL) {
                    loadMorePanelComponentTempHelper.LLILLL = (C1603210rp1) view.findViewById(R.id.nns);
                    loadMorePanelComponentTempHelper.Sp0(new C1568160quU(loadMorePanelComponentTempHelper));
                }
                int i = PageStateCommonComponent.LLJJ;
                InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentGo);
                if (interfaceC665370Q7zLJ != null) {
                    iPageStateAbility = (IPageStateAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IPageStateAbility.class, null);
                }
                this.LLJILLL = iPageStateAbility;
            }
            if (C798410VTr.LIZ()) {
                HashMap map = new HashMap();
                Integer num = 1;
                if (num != null && num.equals(C798410VTr.LJ.LIZ.get("is_preload_main"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    map.put("monitor_scene", "scene_nuj");
                    map.put("vv_code", 2140);
                } else {
                    map.put("monitor_scene", "scene_feed_ui");
                    map.put("vv_code", 3300);
                }
                int i2 = getPanelContext().LIZLLL;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (i2 != 9) {
                                    if (i2 != 31) {
                                        if (i2 != 32) {
                                            str = "other";
                                        } else {
                                            str = "music_video_feeds";
                                        }
                                    } else {
                                        str = "friends";
                                    }
                                } else {
                                    str = "search";
                                }
                            } else {
                                str = "music";
                            }
                        } else {
                            str = "challenge";
                        }
                    } else {
                        str = "follow";
                    }
                } else {
                    str = "fyp";
                }
                map.put("ui_page", str);
                C798410VTr.LJFF(map);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
