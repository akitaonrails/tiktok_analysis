package com.bytedance.android.livesdk.hashtag;

import X.AbstractC1585810rMx;
import X.C036E;
import X.C0DXR;
import X.C0IJT;
import X.C0IO6;
import X.C0IUL;
import X.C0J1R;
import X.C0JSS;
import X.C0U56;
import X.C0UO0;
import X.C1161920gLG;
import X.C16F5;
import X.C16FS;
import X.C16GX;
import X.C19322110iZ;
import X.C19EG;
import X.C20484615Do;
import X.C2188811AlT;
import X.C469460Ib2;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C500980Jkm;
import X.C817403Hg;
import X.InterfaceC1118490fDD;
import X.InterfaceC1324370kZH;
import X.InterfaceC1813060xHU;
import X.InterfaceC472150IfN;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS111S0200000_7;
import Y.AfS176S0100000_7;
import Y.AfS3S0100100_7;
import Y.AkS156S0000000_7;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.hashtag.HashtagAudienceDialog;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS92S1000000_7;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public final class HashtagAudienceDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSICQ/ITsyL2sEKDw7PCQrCDo3ISAiKioXISQgJig=";
    public ImageView LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public ViewOnClickListenerC1836610xtT LLILZ;
    public RecyclerView LLILZIL;
    public C16GX LLILZLL;
    public ConstraintLayout LLIZ;
    public LiveIconView LLIZLLLIL;
    public C16FS LLJ;
    public C16F5 LLJI;
    public Room LLJIJIL;
    public C0IO6 LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public boolean LLJJI;
    public C0IUL LLJJIII;
    public final String LLJILJIL = FeedDrawMtSetting.INSTANCE.getValue().getUrl();
    public final float LLJJIJI = 0.5f;
    public final float LLJJIJIIJIL = 0.3f;
    public final boolean LLJJIJIL = C469460Ib2.LIZJ();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        String string;
        Hashtag hashtag;
        Long l;
        String string2;
        NR().LJI();
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = new HashMap();
                if (this.LLJJIJIL) {
                    map.put("is_non_personalized", "1");
                }
                C480460Ism.LIZ().getClass();
                FeedApi feedApi = (FeedApi) C480460Ism.LIZLLL(FeedApi.class);
                String str = this.LLJILJIL;
                Room room = this.LLJIJIL;
                String str2 = "";
                if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
                    string = "";
                }
                Room room2 = this.LLJIJIL;
                if (room2 != null && (string2 = Long.valueOf(room2.getOwnerUserId()).toString()) != null) {
                    str2 = string2;
                }
                DataChannel dataChannel = this.dataChannel;
                feedApi.feed(str, 0L, "enter_hashtag_refresh", "76", string, str2, (dataChannel == null || (hashtag = (Hashtag) dataChannel.gg0(HashtagChangedChannel.class)) == null || (l = hashtag.id) == null) ? 0L : l.longValue(), 6L, map).LJJJJZI(new AkS156S0000000_7(6)).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this)).LJJLL(new AfS3S0100100_7(jCurrentTimeMillis, this, 4), new AfS176S0100000_7(this, 68));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        NR().LJII();
    }

    public final ViewOnClickListenerC1836610xtT NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jh3) : null;
            this.LLILZ = (ViewOnClickListenerC1836610xtT) viewFindViewById;
        }
        return (ViewOnClickListenerC1836610xtT) viewFindViewById;
    }

    public final LiveIconView OR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vyu) : null;
            this.LLIZLLLIL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final void PR() {
        String string;
        Hashtag hashtag;
        Long l;
        Hashtag hashtag2;
        String str;
        String strLJJIFFI;
        Room room = this.LLJIJIL;
        String str2 = "";
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hashtag_anchor_live_take_button");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_entrance_click");
        c474500IjALIZ2.LJJII("hashtag", "enter_from");
        c474500IjALIZ2.LJJII("hashtag", "live_entrance_name");
        c474500IjALIZ2.LJJII(string, "entrance_room_id");
        c474500IjALIZ2.LIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (hashtag2 = (Hashtag) dataChannel.gg0(HashtagChangedChannel.class)) != null && (str = hashtag2.title) != null && (strLJJIFFI = u.LJJIFFI(str, "&", "%26", false)) != null) {
            str2 = strLJJIFFI;
        }
        DataChannel dataChannel2 = this.dataChannel;
        long jLongValue = (dataChannel2 == null || (hashtag = (Hashtag) dataChannel2.gg0(HashtagChangedChannel.class)) == null || (l = hashtag.id) == null) ? 0L : l.longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source_params={\"hashtag_title\":\"");
        sbLIZ.append(str2);
        sbLIZ.append("\",\"hashtag_id\":");
        sbLIZ.append(jLongValue);
        sbLIZ.append(",\"request_from\":hashtag}");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        C19EG c19egLJ = C500260Jjc.LJ(getContext());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&");
        sbLIZ2.append(strLIZIZ);
        iHostAction.handleSchema(c19egLJ, C2188811AlT.LIZIZ(sbLIZ2), new Bundle());
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(R.layout.g7d);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        if (fu() || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7d);
            c500980Jkm.LIZLLL = true;
            c500980Jkm.LJII = 80;
            c500980Jkm.LJI = 0.0f;
            c500980Jkm.LJIIJJI = 73;
            return c500980Jkm;
        }
        C500980Jkm c500980Jkm2 = new C500980Jkm(R.layout.g7e);
        c500980Jkm2.LIZLLL = false;
        c500980Jkm2.LJII = 8388613;
        c500980Jkm2.LJIIJ = -1;
        c500980Jkm2.LJIIIZ = (int) C497740JfY.LIZIZ(490.0f);
        return c500980Jkm2;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C20484615Do c20484615DoLIZJ = C19322110iZ.LIZJ(getView());
        if (c20484615DoLIZJ != null) {
            c20484615DoLIZJ.LIZ(1);
        }
    }

    public final boolean fu() {
        Resources resources;
        Configuration configuration;
        Context context = getContext();
        return ((context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? C497740JfY.LIZ : configuration.orientation) == 1;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_HASHTAG_AUDIENCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "livesdk_panel_frame_exit_click"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r3.LJIJJLI(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            if (r0 == 0) goto L4d
            boolean r1 = X.C500260Jjc.LJIIZILJ(r0)
            r0 = 1
            if (r1 != r0) goto L4d
        L16:
            java.lang.String r2 = "0"
            if (r0 == 0) goto L4b
            java.lang.String r1 = "1"
        L1c:
            java.lang.String r0 = "is_anchor"
            r3.LJJII(r1, r0)
            java.lang.String r1 = "current_panel_page"
            java.lang.String r0 = "foundation_topic_ranking"
            r3.LJJII(r0, r1)
            java.lang.String r0 = "has_slide_close"
            r3.LJJII(r2, r0)
            java.lang.String r0 = "has_return"
            r3.LJJII(r2, r0)
            boolean r0 = r4.fu()
            if (r0 == 0) goto L48
            java.lang.String r1 = "fixed_7"
        L3a:
            java.lang.String r0 = "height_ratio"
            r3.LJJII(r1, r0)
            java.lang.String r0 = "action_type"
            r3.LJJII(r5, r0)
            r3.LJJIJL()
            return
        L48:
            java.lang.String r1 = "full_screen"
            goto L3a
        L4b:
            r1 = r2
            goto L1c
        L4d:
            r0 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.HashtagAudienceDialog.RR(java.lang.String):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [X.0IUL] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        Hashtag hashtag;
        ImageModel imageModel;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        if (!fu()) {
            View viewFindViewById = view.findViewById(R.id.trr);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.dxf);
            }
            View viewFindViewById2 = view.findViewById(R.id.y08);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackgroundResource(R.drawable.dxf);
            }
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            View viewFindViewById3 = view.findViewById(R.id.trr);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setBackgroundResource(R.drawable.dxg);
            }
            View viewFindViewById4 = view.findViewById(R.id.y08);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setBackgroundResource(R.drawable.dxg);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS586S0100000_7(this, 107));
        }
        DataChannel dataChannel2 = this.dataChannel;
        C0IUL c0iul = null;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJIJIL = room;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            hashtag = (Hashtag) dataChannel3.gg0(HashtagChangedChannel.class);
        } else {
            hashtag = null;
        }
        View viewFindViewById5 = this.LL;
        if (viewFindViewById5 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById5 = view2.findViewById(R.id.jh4);
            } else {
                viewFindViewById5 = null;
            }
            this.LL = (ImageView) viewFindViewById5;
        }
        ImageView imageView = (ImageView) viewFindViewById5;
        if (hashtag != null) {
            imageModel = hashtag.image;
        } else {
            imageModel = null;
        }
        C0JSS.LJI(imageView, imageModel, R.drawable.du_, 2);
        View viewFindViewById6 = this.LLILLJJLI;
        if (viewFindViewById6 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById6 = view3.findViewById(R.id.jhd);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILLJJLI = (C16F5) viewFindViewById6;
        }
        TextView textView = (TextView) viewFindViewById6;
        if (hashtag != null) {
            str = hashtag.title;
        } else {
            str = null;
        }
        textView.setText(str);
        View viewFindViewById7 = this.LLILLL;
        if (viewFindViewById7 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById7 = view4.findViewById(R.id.jhe);
            } else {
                viewFindViewById7 = null;
            }
            this.LLILLL = (C16F5) viewFindViewById7;
        }
        TextView textView2 = (TextView) viewFindViewById7;
        if (textView2 != null) {
            if (hashtag != null) {
                str2 = hashtag.title;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
        }
        final C817403Hg c817403Hg = new C817403Hg();
        View viewFindViewById8 = this.LLILZLL;
        if (viewFindViewById8 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById8 = view5.findViewById(R.id.b6s);
            } else {
                viewFindViewById8 = null;
            }
            this.LLILZLL = (C16GX) viewFindViewById8;
        }
        ((C16GX) viewFindViewById8).LIZ(new InterfaceC1324370kZH() { // from class: X.0IUK
            @Override // X.InterfaceC1324380kZI
            public final void LLZZJLIL(C16GX c16gx, int i) {
                C817403Hg c817403Hg2 = c817403Hg;
                float f = i;
                HashtagAudienceDialog hashtagAudienceDialog = this;
                View viewFindViewById9 = hashtagAudienceDialog.LLILZLL;
                View viewFindViewById10 = null;
                if (viewFindViewById9 == null) {
                    View view6 = hashtagAudienceDialog.getView();
                    if (view6 != null) {
                        viewFindViewById9 = view6.findViewById(R.id.b6s);
                    } else {
                        viewFindViewById9 = null;
                    }
                    hashtagAudienceDialog.LLILZLL = (C16GX) viewFindViewById9;
                }
                c817403Hg2.element = Math.abs(f / ((C16GX) viewFindViewById9).getTotalScrollRange());
                float f2 = c817403Hg.element;
                HashtagAudienceDialog hashtagAudienceDialog2 = this;
                if (f2 > hashtagAudienceDialog2.LLJJIJIIJIL) {
                    View view7 = hashtagAudienceDialog2.LLIZ;
                    if (view7 == null) {
                        View view8 = hashtagAudienceDialog2.getView();
                        if (view8 != null) {
                            viewFindViewById10 = view8.findViewById(R.id.y08);
                        }
                        hashtagAudienceDialog2.LLIZ = (ConstraintLayout) viewFindViewById10;
                        view7 = viewFindViewById10;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) view7;
                    if (constraintLayout != null) {
                        float f3 = 1.0f - c817403Hg.element;
                        float f4 = 1.0f - ((f3 * f3) * f3);
                        float f5 = this.LLJJIJIIJIL;
                        C786410Ut5.c5(constraintLayout, Math.min((f4 - f5) / (1 - f5), 1.0f));
                    }
                } else {
                    View view9 = hashtagAudienceDialog2.LLIZ;
                    if (view9 == null) {
                        View view10 = hashtagAudienceDialog2.getView();
                        if (view10 != null) {
                            viewFindViewById10 = view10.findViewById(R.id.y08);
                        }
                        hashtagAudienceDialog2.LLIZ = (ConstraintLayout) viewFindViewById10;
                        view9 = viewFindViewById10;
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view9;
                    if (constraintLayout2 != null) {
                        C786410Ut5.c5(constraintLayout2, 0.0f);
                    }
                }
                float f6 = c817403Hg.element;
                HashtagAudienceDialog hashtagAudienceDialog3 = this;
                if (f6 > hashtagAudienceDialog3.LLJJIJI) {
                    LiveIconView liveIconViewOR = hashtagAudienceDialog3.OR();
                    float f7 = c817403Hg.element;
                    float f8 = this.LLJJIJI;
                    C786410Ut5.i5(liveIconViewOR, Math.min((f7 - f8) / (1 - f8), 1.0f));
                    return;
                }
                C786410Ut5.i5(hashtagAudienceDialog3.OR(), 0.0f);
            }
        });
        this.LLJILJILJ = new C0IO6(new AwS586S0100000_7(this, 108));
        final AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 65);
        this.LLJJIII = new AbstractC1585810rMx(awS551S0100000_7) { // from class: X.0IUL
            public final Function0<Unit> LL;
            public boolean LLILLJJLI;

            {
                this.LL = awS551S0100000_7;
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (i == 0 && this.LLILLJJLI && linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
                    this.LL.invoke();
                }
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLILLJJLI = z;
            }
        };
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTNR = NR();
        viewOnClickListenerC1836610xtTNR.LIZIZ(R.layout.g7g, "WithoutGoLivePerm");
        viewOnClickListenerC1836610xtTNR.LIZIZ(R.layout.g7f, "WithGoLivePerm");
        viewOnClickListenerC1836610xtTNR.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0IUM
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                this.LIZ.MR();
            }
        });
        viewOnClickListenerC1836610xtTNR.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0IUN
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                this.LIZ.MR();
            }
        });
        View viewFindViewById9 = this.LLILZIL;
        if (viewFindViewById9 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById9 = view6.findViewById(R.id.hto);
            } else {
                viewFindViewById9 = null;
            }
            this.LLILZIL = (RecyclerView) viewFindViewById9;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById9;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        C0IO6 c0io6 = this.LLJILJILJ;
        if (c0io6 == null) {
            c0io6 = null;
        }
        recyclerView.setAdapter(c0io6);
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.0DSR
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view7, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view7, recyclerView2, c21673919s1);
                rect.set((int) C497740JfY.LIZIZ(2.0f), 0, (int) C497740JfY.LIZIZ(2.0f), (int) C497740JfY.LIZIZ(3.0f));
            }
        });
        C0IUL c0iul2 = this.LLJJIII;
        if (c0iul2 != null) {
            c0iul = c0iul2;
        }
        recyclerView.addOnScrollListener(c0iul);
        MR();
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).requestLivePermission(new InterfaceC472150IfN() { // from class: X.0IUP
            @Override // X.InterfaceC472150IfN
            public final void onFailed(Throwable th) {
                C20441214yg.LJ("HashtagAudienceDialog", "query Live permission failed");
            }

            @Override // X.InterfaceC472150IfN
            public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map map) {
                String string;
                bool2.booleanValue();
                this.LIZ.LLJJI = C500260Jjc.LJJJI(bool);
                HashtagAudienceDialog hashtagAudienceDialog = this.LIZ;
                if (hashtagAudienceDialog.LLJJI) {
                    View viewFindViewById10 = hashtagAudienceDialog.LLJ;
                    if (viewFindViewById10 == null) {
                        View view7 = hashtagAudienceDialog.getView();
                        if (view7 != null) {
                            viewFindViewById10 = view7.findViewById(R.id.vyt);
                        } else {
                            viewFindViewById10 = null;
                        }
                        hashtagAudienceDialog.LLJ = (C16FS) viewFindViewById10;
                    }
                    View view8 = viewFindViewById10;
                    if (view8 != null) {
                        C786410Ut5.LJLLLLLL(0, view8);
                        C786410Ut5.I7(new ACListenerS111S0200000_7(hashtagAudienceDialog, view8, 64), view8);
                    }
                    HashtagAudienceDialog hashtagAudienceDialog2 = this.LIZ;
                    LiveIconView liveIconViewOR = hashtagAudienceDialog2.OR();
                    if (liveIconViewOR != null) {
                        C786410Ut5.LJLLLLLL(0, liveIconViewOR);
                        C786410Ut5.I7(new ACListenerS111S0200000_7(hashtagAudienceDialog2, liveIconViewOR, 64), liveIconViewOR);
                    }
                    Room room2 = this.LIZ.LLJIJIL;
                    if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
                        string = "";
                    }
                    C0IUQ.LIZ(new AwS92S1000000_7(string, 1));
                }
            }
        }, "hash_tag");
    }
}
