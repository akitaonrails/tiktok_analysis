package com.ss.android.ugc.aweme.commerce.tools.music.context;

import X.C040H;
import X.C15M9;
import X.C15MA;
import X.C15MF;
import X.EnumC681490QoF;
import X.InterfaceC2217461Bqa;
import X.InterfaceC681980Qp2;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;
import com.ss.android.ugc.aweme.commerce.tools.music.context.CommerceToolsMusicContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceToolsMusicContext implements Serializable, Parcelable, InterfaceC681980Qp2 {
    public static final Parcelable.Creator<CommerceToolsMusicContext> CREATOR = new Parcelable.Creator<CommerceToolsMusicContext>() { // from class: X.15MC
        @Override // android.os.Parcelable.Creator
        public final CommerceToolsMusicContext createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CommerceToolsMusicContext();
        }

        @Override // android.os.Parcelable.Creator
        public final CommerceToolsMusicContext[] newArray(int i) {
            return new CommerceToolsMusicContext[i];
        }
    };

    @C040H
    public String bannerId;

    @C040H
    public String bannerType;

    @C040H
    public String categoryId;

    @C040H
    public boolean inCommercialSoundPage;

    @C040H
    public boolean inPromoteRecommendCMLScene;

    @C040H
    public boolean inPromoteReplaceMusicScene;

    @C040H
    public Integer musicOrder;

    @C040H
    public Integer playlistOrderInCsp;

    @C040H
    public String playlistSuggestionId;
    public String shootWay;

    @C040H
    public EnumC681490QoF lastSearchSoundPage = EnumC681490QoF.NONE;

    @C040H
    public ShootActionOrigin actionOriginatedFrom = ShootActionOrigin.OTHERS;

    @C040H
    public List<C15MF> currentPageStack = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public ShootActionOrigin getActionOriginatedFrom() {
        C15MA c15ma = C15MA.LL;
        return C15MA.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getBannerId() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return (String) c15m9.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getBannerType() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return (String) c15m9.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getCategoryId() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return (String) c15m9.LIZ;
    }

    public List<C15MF> getCurrentPageStack() {
        C15MA.LL.getClass();
        return C15MA.LLJILJIL;
    }

    @Override // X.InterfaceC681980Qp2
    public boolean getInCommercialSoundPage() {
        return C15MA.LL.getInCommercialSoundPage();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean getInPromoteRecommendCMLScene() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return ((Boolean) c15m9.LIZ).booleanValue();
    }

    public boolean getInPromoteReplaceMusicScene() {
        C15MA c15ma = C15MA.LL;
        return C15MA.LIZLLL();
    }

    @Override // X.InterfaceC681980Qp2
    public EnumC681490QoF getLastSearchSoundPage() {
        return C15MA.LL.getLastSearchSoundPage();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Integer getMusicOrder() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return (Integer) c15m9.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Integer getPlaylistOrderInCsp() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return (Integer) c15m9.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getPlaylistSuggestionId() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return (String) c15m9.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getShootWay() {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        return (String) c15m9.LIZ;
    }

    public void setActionOriginatedFrom(ShootActionOrigin shootActionOrigin) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(shootActionOrigin);
        this.actionOriginatedFrom = shootActionOrigin;
    }

    public void setBannerId(String str) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(str);
        this.bannerId = str;
    }

    public void setBannerType(String str) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(str);
        this.bannerType = str;
    }

    public void setCategoryId(String str) {
        C15MA c15ma = C15MA.LL;
        C15MA.LJ(getCategoryId());
        this.categoryId = str;
    }

    public void setCurrentPageStack(List<C15MF> list) {
        C15MA.LL.getClass();
        this.currentPageStack = list;
    }

    @Override // X.InterfaceC681980Qp2
    public void setInCommercialSoundPage(boolean z) {
        C15MA.LL.setInCommercialSoundPage(z);
        this.inCommercialSoundPage = z;
    }

    public void setInPromoteRecommendCMLScene(boolean z) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(Boolean.valueOf(z));
        this.inPromoteRecommendCMLScene = z;
    }

    public void setInPromoteReplaceMusicScene(boolean z) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(Boolean.valueOf(z));
        this.inPromoteReplaceMusicScene = z;
    }

    @Override // X.InterfaceC681980Qp2
    public void setLastSearchSoundPage(EnumC681490QoF enumC681490QoF) {
        C15MA.LL.setLastSearchSoundPage(enumC681490QoF);
        this.lastSearchSoundPage = enumC681490QoF;
    }

    public void setMusicOrder(Integer num) {
        C15MA c15ma = C15MA.LL;
        C15MA.LJFF(num);
        this.musicOrder = num;
    }

    public void setPlaylistOrderInCsp(Integer num) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        this.playlistOrderInCsp = num;
    }

    public void setPlaylistSuggestionId(String str) {
        C15MA c15ma = C15MA.LL;
        C15MA.LJI(str);
        this.playlistSuggestionId = str;
    }

    public void setShootWay(String str) {
        C15MA.LL.getClass();
        C15M9 c15m9 = C15MA.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(str);
        this.shootWay = str;
    }
}
