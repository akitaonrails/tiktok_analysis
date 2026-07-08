package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.AbstractC21673619ry;
import X.C0JFO;
import X.C1161920gLG;
import X.C16FS;
import X.C500980Jkm;
import X.C749050TZv;
import X.C749280TaI;
import X.C786410Ut5;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import Y.ACListenerS111S0200000_7;
import Y.AsS29S0200000_7;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.OnlySetDrawGuessStartGameEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
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
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessAnchorSummaryDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElJiF9HELIOSLDctPigmLTY/Zzo6ZgE+KDgUPSA/Og49Ky0jOxwmJSgtOzYXISQgJig=";
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
            viewFindViewById = view != null ? view.findViewById(R.id.vyf) : null;
            this.LLILLJJLI = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final RecyclerView NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wp1) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5n);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 50;
        return c500980Jkm;
    }

    public final void OR() {
        dismiss();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C749050TZv.class, Boolean.TRUE);
        }
        C0JFO.LJI(this.dataChannel, "play_again", "draw_and_guess", false);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(OnlySetDrawGuessStartGameEvent.class);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zW(DrawGuessIsCountingDownRoundStart.class, Boolean.TRUE);
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.DRAW_GUESS, EnumC771230UNd.APPLYING, null);
        }
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
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (list = (List) dataChannel.gg0(C749280TaI.class)) != null) {
            NR().setLayoutManager(new LinearLayoutManager(getContext()));
            NR().setAdapter(new AbstractC21673619ry<RecyclerView.ViewHolder>(list) { // from class: X.0ImI
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
                    if (i == 0) {
                        return 0;
                    }
                    if (((PictionaryFullInfo) ListProtector.get(this.LL, i - 1)).pictionaryStatistics.firstUser != null) {
                        return 1;
                    }
                    return 2;
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    int i2;
                    String strLJIJI;
                    ImageModel avatarThumb = null;
                    if (viewHolder instanceof C476450ImJ) {
                        PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) ListProtector.get(this.LL, i - 1);
                        PictionaryInfo pictionaryInfo = pictionaryFullInfo.pictionaryInfo;
                        String str = pictionaryInfo.word;
                        PictionaryStatistics pictionaryStatistics = pictionaryFullInfo.pictionaryStatistics;
                        long j = pictionaryStatistics.guessCorrectUv;
                        User user = pictionaryStatistics.firstUser;
                        ImageModel imageModel = pictionaryInfo.drawUrl;
                        ((TextView) viewHolder.itemView.findViewById(R.id.tv_word)).setText(str);
                        TextView textView = (TextView) viewHolder.itemView.findViewById(R.id.zof);
                        if (j > 0) {
                            int i3 = (int) j;
                            C0JFN.LIZ.getClass();
                            strLJIJI = C497740JfY.LJIIL(2131755510, i3, C0JFN.LIZLLL(i3));
                        } else {
                            strLJIJI = C497740JfY.LJIJI(2131841352);
                        }
                        textView.setText(strLJIJI);
                        if (user != null) {
                            ((TextView) viewHolder.itemView.findViewById(R.id.i0w)).setText(C0KVU.LIZ(user));
                            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                            if (user != null) {
                                avatarThumb = user.getAvatarThumb();
                            }
                            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarThumb);
                            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.ela;
                            c1324610kZfLJIIIZ.LJJI(viewHolder.itemView.findViewById(R.id.i0t));
                        }
                        C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ(imageModel);
                        c1324610kZfLJIIIZ2.LJIJJ = ImageView.ScaleType.CENTER_INSIDE;
                        c1324610kZfLJIIIZ2.LJJI(viewHolder.itemView.findViewById(R.id.g_m));
                        return;
                    }
                    if (!(viewHolder instanceof C476460ImK)) {
                        return;
                    }
                    Iterator<PictionaryFullInfo> it2 = this.LL.iterator();
                    long j2 = 0;
                    while (it2.hasNext()) {
                        j2 += it2.next().pictionaryStatistics.guessTotalPv;
                    }
                    List<PictionaryFullInfo> list2 = this.LL;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator<PictionaryFullInfo> it3 = list2.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            if (it3.next().pictionaryStatistics.guessCorrectUv > 0 && (i2 = i2 + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    int size = this.LL.size();
                    if (i2 > 0) {
                        viewHolder.getClass();
                        String strLJIIL = C497740JfY.LJIIL(2131755511, i2, Integer.valueOf(i2));
                        int iLJJJ = a0.LJJJ(strLJIIL, String.valueOf(i2), 0, false, 6);
                        if (iLJJJ >= 0) {
                            int length = String.valueOf(i2).length() + iLJJJ;
                            TextView textView2 = (TextView) viewHolder.itemView.findViewById(R.id.title);
                            SpannableString spannableString = new SpannableString(strLJIIL);
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C497740JfY.LJFF(R.color.ct)), iLJJJ, length, 18);
                            textView2.setText(spannableString);
                        } else {
                            ((TextView) viewHolder.itemView.findViewById(R.id.title)).setText(strLJIIL);
                        }
                        C500260Jjc.LLFFF(viewHolder.itemView.findViewById(R.id.dlb));
                        C1143680frq.LIZLLL(viewHolder.itemView.findViewById(R.id.dlb), C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_draw_guess_result.png");
                    } else {
                        ((TextView) viewHolder.itemView.findViewById(R.id.title)).setText(C497740JfY.LJIIJJI(2131755512, size));
                        C500260Jjc.LJIILIIL(viewHolder.itemView.findViewById(R.id.dlb));
                    }
                    TextView textView3 = (TextView) viewHolder.itemView.findViewById(R.id.desc);
                    C0JFN.LIZ.getClass();
                    textView3.setText(C497740JfY.LJIJJ(2131841380, C0JFN.LIZLLL((int) j2)));
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder viewHolder;
                    if (i != 0) {
                        if (i != 1) {
                            final View viewLJIILL = C500260Jjc.LJIILL(R.layout.gys, viewGroup, false);
                            viewHolder = new RecyclerView.ViewHolder(viewLJIILL) { // from class: X.0ImJ
                            };
                        } else {
                            final View viewLJIILL2 = C500260Jjc.LJIILL(R.layout.gyr, viewGroup, false);
                            viewHolder = new RecyclerView.ViewHolder(viewLJIILL2) { // from class: X.0ImJ
                            };
                        }
                    } else {
                        final View viewLJIILL3 = C500260Jjc.LJIILL(R.layout.gyx, viewGroup, false);
                        viewHolder = new RecyclerView.ViewHolder(viewLJIILL3) { // from class: X.0ImK
                        };
                    }
                    try {
                        View view2 = viewHolder.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
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
            NR().addOnScrollListener(new AsS29S0200000_7(this, list, 0));
            C786410Ut5.h8(MR(), new ACListenerS111S0200000_7(this, new AwS586S0100000_7(this, 112), 15));
            return;
        }
        dismiss();
    }
}
