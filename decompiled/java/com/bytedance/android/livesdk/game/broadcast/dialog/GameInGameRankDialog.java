package com.bytedance.android.livesdk.game.broadcast.dialog;

import X.AbstractC21673619ry;
import X.AnonymousClass0206;
import X.C01GW;
import X.C09JN;
import X.C0IJT;
import X.C0INZ;
import X.C0J1N;
import X.C0TFR;
import X.C1143680frq;
import X.C11JF;
import X.C11RD;
import X.C1701940uOG;
import X.C20743716Ff;
import X.C452501pT;
import X.C465440INa;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C511901z3;
import X.C5182020e;
import X.C786410Ut5;
import X.InterfaceC1813060xHU;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC1836610xtT;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import webcast.api.game.AuthorizedGame;
import webcast.api.game.InGameRankSettingResponse;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameInGameRankDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExHELIOSOiotLSwyOzFiLSYyJCorZwgyJSAFJwgyJSAeKCE4DCwtJSA0";
    public final C01GW LL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(69));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(68));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C5182020e(this, 85));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C5182020e(this, 84));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 239));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 240));
    public final List<C465440INa> LLIZ = new ArrayList();
    public final C511901z3 LLIZLLLIL = new C511901z3(this, 2);
    public C11JF LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    public final void MR() {
        ((C0J1N) C0TFR.LIZ(this, false, new AfS181S0100000_12(this, 74), 2).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 75), new C09JN() { // from class: X.0U3T
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GameInGameRankDialog@63ff.fetchInGameRankList$3");
                C1C7U.LIZIZ("GameInGameRankDialog@63ff.fetchInGameRankList$3");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7l);
        c500980Jkm.LIZIZ = 2;
        c500980Jkm.LIZJ = R.style.ai0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 73;
        return c500980Jkm;
    }

    public final long getRoomId() {
        return ((Number) this.LLILLJJLI.getValue()).longValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InGameRankSettingResponse.ResponseData responseDataLJLZ = C0TFR.LIZ.LJLZ();
        if (responseDataLJLZ != null) {
            CompoundButton compoundButton = (CompoundButton) this.LLILLL.getValue();
            responseDataLJLZ.inGameRankSettingStatus = C500260Jjc.LJJJI(compoundButton != null ? Boolean.valueOf(compoundButton.isChecked()) : null) ? 1L : 0L;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = (View) this.LLILZ.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AbS694S0100000_12(this, 20), view2);
        }
        View viewFindViewById = view.findViewById(R.id.zqi);
        if (viewFindViewById != null) {
            C1143680frq.LJ(viewFindViewById, "tiktok_live_game_demand_2", "ttlive_in_game_rank_dialog_tips.png", ImageView.ScaleType.FIT_XY);
            if (C497740JfY.LJJ()) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
                viewFindViewById.setRotationY(180.0f);
            }
        }
        RecyclerView recyclerView = (RecyclerView) this.LLILZIL.getValue();
        if (recyclerView != null) {
            final List<C465440INa> list = this.LLIZ;
            recyclerView.setAdapter(new AbstractC21673619ry<C0INZ>(list) { // from class: X.0INY
                public final List<C465440INa> LL;
                public final float LLILLJJLI = C497740JfY.LIZIZ(8);

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                {
                    this.LL = list;
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    AuthorizedGame authorizedGame;
                    C0INZ c0inz = (C0INZ) viewHolder;
                    C465440INa c465440INa = (C465440INa) C13LP.LJJJLZIJ(i, this.LL);
                    if (c465440INa != null && (authorizedGame = c465440INa.LIZ) != null) {
                        C16F5 c16f5 = c0inz.LL;
                        if (c16f5 != null) {
                            c16f5.setText(authorizedGame.inGameRank);
                        }
                        C16F5 c16f52 = c0inz.LLILLJJLI;
                        if (c16f52 != null) {
                            c16f52.setText(authorizedGame.gameName);
                        }
                        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(authorizedGame.gameIcon);
                        c1324610kZfLJIIIZ.LJIJI(Float.valueOf(this.LLILLJJLI));
                        c1324610kZfLJIIIZ.LJJI(c0inz.LLILLL);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    C0INZ c0inz = new C0INZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g7o, viewGroup, false));
                    try {
                        View view3 = c0inz.itemView;
                        if (view3 != null) {
                            view3.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c0inz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c0inz.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(C0INZ.class.getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c0inz.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c0inz.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = C0INZ.class.getName();
                    return c0inz;
                }
            });
        }
        RecyclerView recyclerView2 = (RecyclerView) this.LLILZIL.getValue();
        int i = 0;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) this.LLILZLL.getValue();
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0U3U
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    this.LIZ.MR();
                }
            });
        }
        MR();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ingame_rank_setting_show");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LL.getValue()).longValue()), "anchor_id");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        if (getRoomId() != 0) {
            c474500IjALIZ.LJJII(Long.valueOf(getRoomId()), "room_id");
        }
        if (getRoomId() != 0) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_streaming");
        c474500IjALIZ.LIZ();
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = (ViewOnClickListenerC1836610xtT) this.LLILZLL.getValue();
        if (viewOnClickListenerC1836610xtT2 != null) {
            viewOnClickListenerC1836610xtT2.LJI();
        }
        C20743716Ff c20743716Ff = (C20743716Ff) this.LLILLL.getValue();
        if (c20743716Ff != null) {
            C786410Ut5.A7(c20743716Ff, this.LLIZLLLIL);
        }
    }
}
