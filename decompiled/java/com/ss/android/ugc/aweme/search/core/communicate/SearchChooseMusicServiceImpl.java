package com.ss.android.ugc.aweme.search.core.communicate;

import X.AbstractC1549150qPp;
import X.C07J9;
import X.C0BQO;
import X.C0PEM;
import X.C1388190mED;
import X.C1543490qGh;
import X.C1697810uHb;
import X.C1828607Ee;
import X.C1DFH;
import X.C1ER1;
import X.C2107308Nj;
import X.C23250099c;
import X.C271170Ajz;
import X.C604370Nn9;
import X.C615250OBf;
import X.C681440QoA;
import X.C681500QoG;
import X.C681510QoH;
import X.C681550QoL;
import X.C681730Qod;
import X.C681740Qoe;
import X.C682130QpH;
import X.C786410Ut5;
import X.InterfaceC682120QpG;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import java.util.Iterator;
import java.util.List;
import jv6.a;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchChooseMusicServiceImpl implements ISearchChooseMusicService {
    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final boolean LIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return C1697810uHb.LJIIJJI(C681510QoH.class, C682130QpH.class, C604370Nn9.class, C681440QoA.class, C681740Qoe.class, C615250OBf.class);
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final boolean LJFF() {
        return ((Number) C07J9.LIZ.getValue()).intValue() == 1 && C1828607Ee.LIZ() && C1ER1.LIZIZ.LJZI();
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final void LIZIZ() {
        Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it2 = provideXBridgetIDLMethodList().iterator();
        while (it2.hasNext()) {
            C1543490qGh.LIZIZ(it2.next(), null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final void LJI(MusicSearchHistory musicSearchHistory) {
        C681730Qod.LJIILIIL().LJIIIIZZ(musicSearchHistory);
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final void LIZLLL(Context context, Lifecycle lifecycle) {
        Context contextLIZ;
        C681550QoL c681550QoL = C681550QoL.LIZLLL;
        if (C0BQO.LIZ() && lifecycle != null && context != null && C681550QoL.LIZLLL == null) {
            if (((Boolean) C271170Ajz.LIZ.getValue()).booleanValue()) {
                contextLIZ = C1388190mED.LIZ(context);
                if (contextLIZ == null) {
                    return;
                }
            } else {
                contextLIZ = context;
            }
            a.install(contextLIZ);
            a.LIZLLL(contextLIZ);
            LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope, C2107308Nj.LIZ, null, new C681500QoG(context, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService
    public final InterfaceC682120QpG LJ(Context context, Bundle bundle) {
        if (context == null) {
            return null;
        }
        if (((Boolean) C271170Ajz.LIZ.getValue()).booleanValue() && (context = C1388190mED.LIZ(context)) == null) {
            return null;
        }
        a.install(context);
        a.LIZLLL(context);
        ChooseSearchMusicFragment.LLLIIII.getClass();
        ChooseSearchMusicFragment chooseSearchMusicFragment = new ChooseSearchMusicFragment();
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        chooseSearchMusicFragment.setArguments(bundle);
        return chooseSearchMusicFragment;
    }
}
