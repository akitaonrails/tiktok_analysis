package com.ss.android.ugc.aweme.api;

import X.EnumC1430380nKG;
import android.content.Context;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import j27.s;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public interface IAnchorBusinessApi {
    UISimpleView<ViewGroup> LJIIIIZZ(s sVar, boolean z);

    void LJIIIZ(int i, List<AnchorCommonStruct> list);

    boolean LJIIJ(Aweme aweme, EnumC1430380nKG enumC1430380nKG);

    void LJIIJJI(JSONObject jSONObject);

    boolean LJIIL(Aweme aweme);

    boolean LJIILIIL();

    int LJIILJJIL();

    boolean LJIILL();

    boolean LJIILLIIL();

    boolean LJIIZILJ();

    String LJIJ();

    void LJIJI(Context context, String str);

    boolean LJIJJ();

    boolean LJIJJLI();
}
