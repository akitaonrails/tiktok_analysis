package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.AbstractC21673619ry;
import X.C13LP;
import X.C1697810uHb;
import X.C16FS;
import X.C476520ImQ;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C749280TaI;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessAudienceSummaryDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElJiF9LDHELIOSctPigmLTY/Zzo6ZgE+KDgUPSA/Og4mLCwpJyw2GzAhJC4hMQElKCM8Lw==";
    public RecyclerView LL;
    public C16FS LLILLJJLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C16FS MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eoq) : null;
            this.LLILLJJLI = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5o);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 50;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final List list;
        long j;
        PictionaryInfo pictionaryInfo;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (list = (List) dataChannel.gg0(C749280TaI.class)) != null) {
            View viewFindViewById = this.LL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.wp1);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (RecyclerView) viewFindViewById;
            }
            ((RecyclerView) viewFindViewById).setLayoutManager(new LinearLayoutManager(getContext()));
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.wp1);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (RecyclerView) viewFindViewById2;
            }
            ((RecyclerView) viewFindViewById2).setAdapter(new AbstractC21673619ry<RecyclerView.ViewHolder>(list) { // from class: X.0ImM
                public final List<PictionaryFullInfo> LL;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size() + 1;
                }

                {
                    this.LL = list;
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return Math.min(i, 1);
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    int i2;
                    boolean z;
                    int i3;
                    if (viewHolder instanceof C476490ImN) {
                        PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) ListProtector.get(this.LL, i - 1);
                        C476490ImN c476490ImN = (C476490ImN) viewHolder;
                        PictionaryInfo pictionaryInfo2 = pictionaryFullInfo.pictionaryInfo;
                        String str = pictionaryInfo2.word;
                        PictionaryStatistics pictionaryStatistics = pictionaryFullInfo.pictionaryStatistics;
                        long j2 = pictionaryStatistics.guessCorrectUv;
                        boolean z2 = pictionaryFullInfo.guessCorrect;
                        ImageModel imageModel = pictionaryInfo2.drawUrl;
                        User user = pictionaryStatistics.firstUser;
                        if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ((TextView) c476490ImN.itemView.findViewById(R.id.tv_word)).setText(str);
                        TextView textView = (TextView) c476490ImN.itemView.findViewById(R.id.zoi);
                        int i4 = (int) j2;
                        C0JFN.LIZ.getClass();
                        textView.setText(C497740JfY.LJIIL(2131755509, i4, C0JFN.LIZLLL(i4)));
                        TextView textView2 = (TextView) c476490ImN.itemView.findViewById(R.id.zog);
                        if (z2) {
                            i3 = 2131841387;
                        } else {
                            i3 = 2131841407;
                        }
                        textView2.setText(i3);
                        C500260Jjc.LJLJLJ(c476490ImN.itemView.findViewById(R.id.hzx), C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS551S0100000_7(c476490ImN, 817)));
                        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_INSIDE;
                        c1324610kZfLJIIIZ.LJJI(c476490ImN.itemView.findViewById(R.id.g_m));
                        return;
                    }
                    if (!(viewHolder instanceof C476500ImO)) {
                        return;
                    }
                    List<PictionaryFullInfo> list2 = this.LL;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator<PictionaryFullInfo> it2 = list2.iterator();
                        i2 = 0;
                        while (it2.hasNext()) {
                            if (it2.next().guessCorrect && (i2 = i2 + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    if (i2 > 0) {
                        ((TextView) viewHolder.itemView.findViewById(R.id.title)).setText(C497740JfY.LJIIL(2131755516, i2, Integer.valueOf(i2)));
                        ((TextView) viewHolder.itemView.findViewById(R.id.desc)).setText(2131841426);
                        C500260Jjc.LLFFF(viewHolder.itemView.findViewById(R.id.dlb));
                        C1143680frq.LIZLLL(viewHolder.itemView.findViewById(R.id.dlb), C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_draw_guess_result.png");
                        return;
                    }
                    ((TextView) viewHolder.itemView.findViewById(R.id.title)).setText(2131841428);
                    ((TextView) viewHolder.itemView.findViewById(R.id.desc)).setText(2131841427);
                    C500260Jjc.LJIILIIL(viewHolder.itemView.findViewById(R.id.dlb));
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder viewHolder;
                    if (i == 0) {
                        final View viewLJIILL = C500260Jjc.LJIILL(R.layout.gyx, viewGroup, false);
                        viewHolder = new RecyclerView.ViewHolder(viewLJIILL) { // from class: X.0ImO
                        };
                    } else {
                        final View viewLJIILL2 = C500260Jjc.LJIILL(R.layout.gyt, viewGroup, false);
                        viewHolder = new RecyclerView.ViewHolder(viewLJIILL2) { // from class: X.0ImN
                        };
                    }
                    try {
                        View view4 = viewHolder.itemView;
                        if (view4 != null) {
                            view4.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (viewHolder.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(viewHolder.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = viewHolder.getClass().getName();
                    return viewHolder;
                }
            });
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, LiveEndDismissDialogEvent.class, new AwS586S0100000_7(this, 113));
            }
            PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) C13LP.LJJJLL(list);
            if (pictionaryFullInfo != null && (pictionaryInfo = pictionaryFullInfo.pictionaryInfo) != null) {
                j = pictionaryInfo.sessionId;
            } else {
                j = 0;
            }
            int i = 0;
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((PictionaryFullInfo) it2.next()).guessCorrect && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
                if (i != 0) {
                    MR().setText(2131841412);
                    C500260Jjc.LJLIIIL(500L, MR(), new C476520ImQ(this, j, i));
                    return;
                }
            }
            MR().setText(2131843699);
            C786410Ut5.h8(MR(), new ACListenerS142S0100000_7(this, 73));
            return;
        }
        dismiss();
    }
}
