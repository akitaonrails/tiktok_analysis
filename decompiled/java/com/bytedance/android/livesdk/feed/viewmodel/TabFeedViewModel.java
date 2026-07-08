package com.bytedance.android.livesdk.feed.viewmodel;

import X.C1161920gLG;
import X.C1701940uOG;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C466640IRq;
import X.C467800IWc;
import X.C467830IWf;
import X.C470820IdE;
import X.C470860IdI;
import X.C471000IdW;
import X.EnumC470670Icz;
import X.InterfaceC467840IWg;
import X.InterfaceC470840IdG;
import X.InterfaceC470890IdL;
import X.InterfaceC470900IdM;
import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.other.LiveSquareInboxRefreshIntervalSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public class TabFeedViewModel extends PagingViewModel<FeedItem> {
    public final InterfaceC470890IdL LLJILLL;
    public String LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public C467830IWf LLJJJJJIL;
    public C470860IdI LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<Integer> LLJJ = new MutableLiveData<>();
    public final MutableLiveData<List<ImageModel>> LLJJI = new MutableLiveData<>();
    public final MutableLiveData<EnumC470670Icz> LLJJIII = new MutableLiveData<>();
    public final MutableLiveData<EnumC470670Icz> LLJJIJI = new MutableLiveData<>();
    public long LLJL = -1;
    public long LLJLIL = -1;

    public final void BQ2() {
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        try {
            xQ2(this.LLJILLL.NK2(zQ2()));
            register(this.LLJILLL.gO1().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 297), new AfS132S0000000_7(50)));
            InterfaceC470890IdL interfaceC470890IdL = this.LLJILLL;
            if (interfaceC470890IdL instanceof FeedRepository) {
                register(((FeedRepository) interfaceC470890IdL).LLJJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 298), new AfS132S0000000_7(50)));
                register(((FeedRepository) this.LLJILLL).LLJJIII.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 299), new AfS132S0000000_7(50)));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    public final void EQ2() {
        if (this.LLJL == -1) {
            this.LLJL = SystemClock.elapsedRealtime();
            return;
        }
        if (this.LLJLIL == -1) {
            this.LLJLIL = ((long) LiveSquareInboxRefreshIntervalSetting.INSTANCE.getValue()) * 1000;
        }
        if (SystemClock.elapsedRealtime() - this.LLJL > this.LLJLIL) {
            this.LLJILLL.Q62();
            this.LLJL = SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0IWf] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0IdI] */
    public final void FQ2() {
        if (this.LLJJJJJIL != null) {
            return;
        }
        this.LLJJJJJIL = new InterfaceC467840IWg() { // from class: X.0IWf
            @Override // X.InterfaceC467840IWg
            public final void LIZ(String str, List list, FeedExtra feedExtra, boolean z) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                this.LIZ.getClass();
                if (!C0IKQ.LIZ(list) && feedExtra != null) {
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "style");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                        }
                    } else {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                    }
                    if (!C086I.LIZIZ(list)) {
                        C0IU0.LJI(5);
                        int size = ((ArrayList) list).size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            if (ListProtector.get(list, size) != null && ((FeedItem) ListProtector.get(list, size)).getRoom() != null) {
                                Room room = ((FeedItem) ListProtector.get(list, size)).getRoom();
                                if (!C467820IWe.LJ && C467820IWe.LIZIZ > 0) {
                                    ((List) C467820IWe.LJIILL.getValue()).add(String.valueOf(room.getId()));
                                    ((List) C467820IWe.LJIILLIIL.getValue()).add(String.valueOf(room.getOwner().getId()));
                                }
                                if (C0IU0.LIZIZ(2, ((FeedItem) ListProtector.get(list, size)).getRoom())) {
                                    C0IU0.LJ(((FeedItem) ListProtector.get(list, size)).getRoom());
                                    ListProtector.remove(list, size);
                                }
                            }
                        }
                    }
                    if (z) {
                        ListIterator listIterator = ((ArrayList) list).listIterator();
                        while (listIterator.hasNext()) {
                            int i = ((FeedItem) listIterator.next()).type;
                            if (i == 1001 || i == 1006) {
                                listIterator.remove();
                            }
                        }
                        FeedBannerContainer feedBannerContainer = feedExtra.bannerContainer;
                        int i2 = 0;
                        if (feedBannerContainer != null && C0IKQ.LIZIZ(feedBannerContainer.bannerList) && !"5".equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                            FeedItem feedItem = new FeedItem();
                            feedItem.type = 1001;
                            feedItem.banners = feedExtra.bannerContainer.bannerList;
                            ListProtector.add(list, 0, feedItem);
                            i2 = 1;
                        }
                        C467800IWc.LJIJ.getClass();
                        if (LiveDrawerFollowSetting.INSTANCE.isFollowWindow()) {
                            FeedItem feedItem2 = new FeedItem();
                            feedItem2.type = 1006;
                            ListProtector.add(list, i2, feedItem2);
                        }
                    }
                }
            }
        };
        this.LLJJJJLIIL = new InterfaceC470840IdG() { // from class: X.0IdI
        };
        this.LLJILLL.vM().LJII(this.LLJJJJJIL);
        this.LLJILLL.vM().LIZLLL(this.LLJJJJLIIL);
    }

    public final void Q62() {
        InterfaceC470890IdL interfaceC470890IdL = this.LLJILLL;
        if (interfaceC470890IdL != null) {
            interfaceC470890IdL.Q62();
            this.LLJL = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.RxViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLJILLL.vM().LJ(this.LLJJJJJIL);
        this.LLJILLL.vM().LJI(this.LLJJJJLIIL);
        this.LLJJJJJIL = null;
        super.onCleared();
    }

    public final String zQ2() {
        if (!C2093608Ic.LJ(this.LLJJIJIIJIL) || C471000IdW.LJ().LIZJ() == null || ((ArrayList) C471000IdW.LJ().LIZJ()).size() <= 0) {
            String strYQ2 = yQ2(this.LLJJIJIIJIL);
            this.LLJJIJIIJIL = strYQ2;
            return strYQ2;
        }
        String url = ((ItemTab) ListProtector.get(C471000IdW.LJ().LIZJ(), 0)).getUrl();
        if (C466640IRq.LIZJ() != null) {
            if (C2093608Ic.LIZJ("referral_task", C466640IRq.LIZJ().LIZ())) {
                url = DQ2(url, LiveFeedDraw.getChannelId("referral_task", "H5"));
            }
            url = DQ2(url, "96");
        }
        return yQ2(url);
    }

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    public final boolean wQ2() {
        boolean zWQ2 = super.wQ2();
        if (zWQ2) {
            this.LLJJ.setValue(0);
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            C467800IWc.LJIJ.LJIIIIZZ();
        }
        return zWQ2;
    }

    public final void AQ2(boolean z) {
        InterfaceC470890IdL interfaceC470890IdL;
        this.LLJJL = z;
        if (!z) {
            if (this.LLJJLIIIJLLLLLLLZ && (interfaceC470890IdL = this.LLJILLL) != null) {
                interfaceC470890IdL.Is();
            }
        } else {
            EQ2();
        }
        if (this.LLJJL) {
            BQ2();
        }
    }

    public final void CQ2(String str) {
        this.LLJILLL.Cw1(str, null);
        wQ2();
    }

    public final String yQ2(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("/webcast/feed/")) {
            if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) && !str.contains("&debug=true")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&debug=true");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return str;
    }

    public TabFeedViewModel(InterfaceC470890IdL interfaceC470890IdL, InterfaceC470900IdM interfaceC470900IdM) {
        this.LLJILLL = interfaceC470890IdL;
        if (interfaceC470900IdM != null) {
            this.LLJJIJIIJIL = interfaceC470900IdM.url();
            interfaceC470900IdM.qD();
            this.LLJJIJIL = 10;
            this.LLJJJ = interfaceC470900IdM.uL();
            interfaceC470890IdL.PB0(new C470820IdE(this));
        }
    }

    public static String DQ2(String str, String str2) {
        if (!C2093608Ic.LJ(str) && !C2093608Ic.LJ(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("&");
            sbLIZ.append("channel_id");
            sbLIZ.append("=[^&]*");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("&");
            sbLIZ2.append("channel_id");
            sbLIZ2.append("=");
            sbLIZ2.append(str2);
            return str.replaceAll(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
        return str;
    }
}
