package com.ss.android.ugc.aweme.feed.multiapp;

import X.AbstractC19511111Vd;
import X.C0CCZ;
import X.C0OB8;
import X.C0RPZ;
import X.C1386470mBR;
import X.C13IQ;
import X.C1590400rUM;
import X.C1601460rmC;
import X.C19EG;
import X.C2189821An6;
import X.C2189871AnB;
import X.C737030Svd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public interface IFeedExService {
    boolean LIZ();

    boolean LIZIZ(C0OB8 c0ob8);

    boolean LIZJ(String str);

    boolean LIZLLL(String str);

    boolean LJ(Aweme aweme);

    boolean LJFF();

    boolean LJI(Aweme aweme);

    List<String> LJII();

    boolean LJIIIIZZ();

    boolean LJIIIZ();

    boolean LJIIJ();

    boolean LJIIJJI();

    boolean LJIIL(String str);

    boolean LJIILIIL();

    boolean LJIILJJIL(Aweme aweme);

    boolean LJIILL();

    boolean LJIILLIIL(C2189821An6 c2189821An6);

    void LJIIZILJ(Context context, C0RPZ c0rpz);

    void LJIJ(String str, String str2);

    Object LJIJI();

    boolean LJIJJ(Aweme aweme);

    float LJIJJLI();

    Drawable LJIL(int i, int i2, Context context);

    String LJJ(Integer num, String str);

    List<VideoTagCategoryProtocol> LJJI();

    boolean LJJIFFI();

    Object LJJII();

    boolean LJJIII(String str);

    <T> T LJJIIJ(T t);

    void LJJIIJZLJL(C2189821An6 c2189821An6, C2189871AnB c2189871AnB, String str);

    void LJJIIZ(C19EG c19eg, Aweme aweme, DetailFragmentPanel detailFragmentPanel);

    List<VideoTagCategoryProtocol> LJJIIZI();

    Function0<C13IQ<? extends ReusedUISlotAssem<?>>> LJJIJ();

    C13IQ<? extends UIContentAssem> LJJIJIIJI(String str);

    Set<String> LJJIJIIJIL();

    boolean LJJIJIL();

    boolean LJJIJL(String str);

    void LJJIJLIJ(Aweme aweme, C1590400rUM c1590400rUM);

    boolean LJJIL(C0OB8 c0ob8);

    <T> T LJJIZ(T t, C2189821An6 c2189821An6);

    String LJJJ(C737030Svd c737030Svd);

    void LJJJI(View view, C0OB8 c0ob8);

    String LJJJIL();

    boolean LJJJJ(boolean z);

    void LJJJJI(C2189821An6 c2189821An6, boolean z);

    void LJJJJIZL(View view);

    boolean LJJJJJ();

    void LJJJJJL(C1386470mBR c1386470mBR, C2189821An6 c2189821An6);

    boolean LJJJJL(C737030Svd c737030Svd);

    String LJJJJLI(Aweme aweme);

    boolean LJJJJLL(Music music);

    C13IQ<? extends UIContentAssem> LJJJJZ(String str);

    void LJJJJZI();

    boolean LJJJLIIL(boolean z);

    boolean LJJJLL(Aweme aweme);

    void LJJJLZIJ(AbstractC19511111Vd abstractC19511111Vd, ExtensionMisc extensionMisc);

    boolean LJJJZ();

    Object fetchFeedList(C1601460rmC c1601460rmC);

    C0CCZ getInitTask();
}
