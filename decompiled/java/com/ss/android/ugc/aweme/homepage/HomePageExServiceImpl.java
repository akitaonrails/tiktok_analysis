package com.ss.android.ugc.aweme.homepage;

import X.AbstractC1591090rVT;
import X.AbstractC1591940rWq;
import X.C0CCZ;
import X.C1591020rVM;
import X.C1592950rYT;
import X.C686150Qvl;
import X.EnumC1570580qyO;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class HomePageExServiceImpl implements IHomePageExService {
    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final void LIZ(C686150Qvl c686150Qvl, String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final Object LIZIZ(C1592950rYT c1592950rYT, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LIZJ(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final String LJ() {
        return "For You";
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final String LJFF() {
        return "HOME";
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final void LJI(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJII() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIIJ(Fragment fragment, ScrollSwitchStateManager scrollSwitchStateManager, C1591020rVM c1591020rVM, C1591020rVM c1591020rVM2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final AbstractC1591090rVT LJIIJJI(AbstractC1591940rWq abstractC1591940rWq) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIIL(Intent intent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIILIIL(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final void LJIILJJIL(Uri uri, Object obj, String str) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIILL(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIJ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final ITabAnimationAbility LJIJJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJIJJLI(MainActivity mainActivity, Fragment fragment, ScrollSwitchStateManager scrollSwitchStateManager, C1591020rVM c1591020rVM, C1591020rVM c1591020rVM2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final int LJIL() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final void LJJ(Object obj, String str) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJJI(Context context) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJJIFFI() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LJJII() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final Integer LJJIII() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final List<C0CCZ> getInitTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final EnumC1570580qyO LJIILLIIL() {
        return EnumC1570580qyO.FOR_YOU;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageExService
    public final boolean LIZLLL(String str) {
        return Intrinsics.LJFF(str, "HOME");
    }
}
