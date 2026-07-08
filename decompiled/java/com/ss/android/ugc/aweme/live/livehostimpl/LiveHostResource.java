package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC1387200mCc;
import X.AbstractC1552040qUU;
import X.C0VSJ;
import X.C0X9F;
import X.C1115500f8O;
import X.C128Y;
import X.C1388190mED;
import X.C13BV;
import X.C1537050q6J;
import X.C1550600qSA;
import X.C1550610qSB;
import X.C1551680qTu;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C1858207Po;
import X.C19252910Tv;
import X.C19866712oD;
import X.C19EG;
import X.C20441214yg;
import X.C20573515ev;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C343710Ddh;
import X.C439870HMr;
import X.C451440Hn4;
import X.C451450Hn5;
import X.C520150Kab;
import X.InterfaceC1119900fFU;
import X.InterfaceC1603190roz;
import X.InterfaceC20485015Ds;
import X.InterfaceC20573715ex;
import X.InterfaceC783390UoD;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.gecko.GeckoStorageOptSetting;
import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoBaseUrlSetting;
import com.bytedance.android.livesdk.livesetting.gecko.TtLiveGeckoCdnBasePathOptSetting;
import com.bytedance.android.livesdk.livesetting.model.GeckoLiveGroupOpt;
import com.bytedance.android.livesdk.settings.Game2kSdkKeySetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.services.LiveMonitorService;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostResource;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveHostResource implements IHostResource {
    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final int EB1() {
        return R.style.jl;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final int Xa1() {
        return R.style.jq;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final int bp0() {
        return R.style.jm;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void Ck2() {
        C1551680qTu c1551680qTu;
        C20573515ev.LIZ.getClass();
        if (!C20573515ev.LJ) {
            if (C20573515ev.LJI != null) {
                ArrayList<String> arrayList = C20573515ev.LJII;
                if (arrayList != null && !arrayList.isEmpty() && (c1551680qTu = C20573515ev.LJI) != null && c1551680qTu.LIZIZ()) {
                    c1551680qTu.LIZ();
                    C20573515ev.LIZIZ("continue");
                }
            } else if (C20573515ev.LIZJ > 0 && !C20573515ev.LJFF) {
                C20573515ev.LJII();
                C20573515ev.LIZJ--;
            }
        }
        if (C20573515ev.LJIIJ) {
            return;
        }
        C1551680qTu c1551680qTu2 = C20573515ev.LJIIL;
        if (c1551680qTu2 != null) {
            if (c1551680qTu2.LIZIZ()) {
                c1551680qTu2.LIZ();
                C20573515ev.LIZIZ("continue");
                return;
            }
            return;
        }
        if (C20573515ev.LJIIIIZZ <= 0 || C20573515ev.LJIIJJI) {
            return;
        }
        C20573515ev.LJI();
        C20573515ev.LJIIIIZZ--;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final InterfaceC1119900fFU Qm2() {
        return new InterfaceC1119900fFU() { // from class: X.15ew
            @Override // X.InterfaceC1119870fFR
            public final boolean LIZ(Context context) {
                boolean z = false;
                if (!LIZIZ(context)) {
                    return false;
                }
                this.LL.getClass();
                InterfaceC20573715ex interfaceC20573715exLIZIZ = LiveHostResource.LIZIZ(context);
                if (interfaceC20573715exLIZIZ != null && !interfaceC20573715exLIZIZ.wy()) {
                    z = true;
                }
                return !z;
            }

            @Override // X.InterfaceC1119870fFR
            public final boolean LIZIZ(Context context) {
                if (context != null) {
                    return C960203pA.LIZIZ(context);
                }
                return false;
            }

            @Override // X.InterfaceC1119870fFR
            public final boolean LIZJ(Context context) {
                boolean z;
                this.LL.getClass();
                InterfaceC20573715ex interfaceC20573715exLIZIZ = LiveHostResource.LIZIZ(context);
                if (interfaceC20573715exLIZIZ != null && !interfaceC20573715exLIZIZ.K6()) {
                    z = true;
                } else {
                    z = false;
                }
                return !z;
            }

            @Override // X.InterfaceC20485015Ds
            public final int Rf(Context context) {
                FragmentManager supportFragmentManager;
                C19EG c19egLIZIZ;
                this.LL.getClass();
                InterfaceC20573715ex interfaceC20573715exLIZIZ = LiveHostResource.LIZIZ(context);
                if (interfaceC20573715exLIZIZ == null) {
                    LiveHostResource liveHostResource = this.LL;
                    if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                        supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                    } else {
                        supportFragmentManager = null;
                    }
                    liveHostResource.getClass();
                    InterfaceC20485015Ds interfaceC20485015DsLIZ = LiveHostResource.LIZ(supportFragmentManager);
                    if (interfaceC20485015DsLIZ != null) {
                        return interfaceC20485015DsLIZ.Rf(context);
                    }
                    return 1;
                }
                interfaceC20573715exLIZIZ.E4();
                return 0;
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean SF() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLI();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final GeckoLiveGroupOpt Z80() {
        ArrayList<String> arrayList = (ArrayList) C1858207Po.LIZIZ.getValue();
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        GeckoLiveGroupOpt geckoLiveGroupOpt = new GeckoLiveGroupOpt();
        geckoLiveGroupOpt.channelList = arrayList;
        return geckoLiveGroupOpt;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String getAccessKey() {
        C20573515ev.LIZ.getClass();
        C19866712oD c19866712oD = C20573515ev.LIZIZ;
        if (c19866712oD != null) {
            return c19866712oD.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String getGeckoHost() {
        C1553670qX7.LIZ.getClass();
        return C1553670qX7.LIZIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String hl() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJJLZIJ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void kI2() {
        C20573515ev.LIZ.getClass();
        C20573515ev.LJII();
        C20573515ev.LJI();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final InterfaceC783390UoD x81() {
        return new InterfaceC783390UoD(this) { // from class: X.0UoI
            @Override // X.InterfaceC783390UoD
            public final int LIZ() {
                return R.style.jo;
            }

            {
                this.getClass();
                C1119850fFP c1119850fFP = C011Z.LIZ;
                C783400UoE c783400UoE = C783400UoE.LIZIZ;
                c1119850fFP.getClass();
                C1119850fFP.LJJIFFI(R.raw.icon_2pt_horn_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_2pt_qa_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_2pt_question_mark_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_2pt_rectangle_rectangle_1_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_2pt_rectangle_rectangle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_3pt_arrow_triangle_circle_clockwise_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_3pt_arrow_triangle_circle_counterclockwise_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_3pt_backspace_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_3pt_horn_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_add_shopping_cart_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_down_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_left_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_left_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_left_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_right_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_right_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_right_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_text_long_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_text_short_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_topleft_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_topright_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_triangle_right_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_triangle_up_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_turn_left_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_turn_right_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_up_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_up_left_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_up_left_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_up_right_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_up_right_in_rec_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_up_right_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_arrow_up_right_square_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_asterisk_on_doc_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_backspace_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_backspace_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_billboard_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_bitmap_chevron_down_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_bitmap_clipboard_gradient_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_bubble_ai_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_bubble_left_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chat_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_down_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_obtuse_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_offset_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_offset_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_offset_small_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_slim_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_slim_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_slim_thin_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_small_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_left_thin_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_obtuse_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_offset_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_offset_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_offset_small_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_slim_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_slim_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_slim_thin_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_small_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_right_thin_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_chevron_up_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_clipboard_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_clipboard_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_clipboard_two_bars_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_color_arrow_broken_line_up_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_color_clipboard_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_color_double_qa_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_color_eoy2021_reply_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_color_horizontal_rectangles_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_color_qa_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_doc_text_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_doc_text_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_dots_lines_horizontal_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_double_devices_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_double_devices_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_double_qa_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_empty_battery_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_exp_exp_01_icon_chevron_left_offset_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_exp_exp_01_shopping_cart_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_exp_exp_02_icon_chevron_left_offset_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_exp_exp_02_shopping_cart_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_exp_exp_03_icon_chevron_left_offset_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_forward_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_hand_nudge_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_hand_nudge_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_horizontal_rectangles_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_horn_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_image_above_text_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_image_above_text_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_info_card_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_large_bills_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_large_error_qa_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_large_tasks_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_laurel_leading_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_laurel_trailing_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_leads_gen_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_lines_horizontal_decrease_rectangle_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_lines_horizontal_decrease_rectangle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_live_shopping_cart_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_low_battery_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_person_question_mark_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_poll_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_poll_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_qa_fill_fallback_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_qa_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_qa_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_question_mark_circle_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_question_mark_circle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_questionmark_square_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_quotation_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_quotation_slash_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_quotation_source_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_rectangle_rectangle_1_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_rectangle_rectangle_fill_1_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_rectangle_rectangle_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_rectangle_rectangle_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_rewind_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_shopping_cart_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_shopping_cart_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_speaker_1_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_speaker_2_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_speaker_2_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_speaker_2_slash_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_speaker_x_mark_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_speaker_x_mark_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_square_square_arrow_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_truck_moving_fill_ltr, c783400UoE);
                C1119850fFP.LJJIFFI(R.raw.icon_truck_moving_ltr, c783400UoE);
                C783420UoG c783420UoG = C783420UoG.LIZJ;
                C1119850fFP.LJJIFFI(R.raw.icon_2pt_question_mark_circle_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_person_question_mark_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_question_mark_circle_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_large_error_qa_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_2pt_qa_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_qa_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_qa_fill_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_color_qa_fill_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_double_qa_ltr, c783420UoG);
                C1119850fFP.LJJIFFI(R.raw.icon_color_double_qa_ltr, c783420UoG);
            }

            @Override // X.InterfaceC783390UoD
            public final Drawable LIZIZ(int i, Context context) {
                C1770506wZ c1770506wZLJI;
                Drawable drawable;
                if (context == null || (c1770506wZLJI = C1770406wY.LJI(i)) == null || (drawable = c1770506wZLJI.LIZ) == null) {
                    return null;
                }
                return drawable;
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final Map<String, Integer> xE2() {
        HashMap map = new HashMap();
        map.put("liveIconVideQuality360Stroke", Integer.valueOf(R.raw.icon_video_quality_360_fill));
        map.put("liveIconVideQuality540Stroke", Integer.valueOf(R.raw.icon_video_quality_540_fill));
        map.put("liveIconVideQuality720Stroke", Integer.valueOf(R.raw.icon_video_quality_720_fill));
        map.put("liveIconVideQuality1080Stroke", Integer.valueOf(R.raw.icon_video_quality_1080_fill));
        map.put("liveIconVideQualityAutoStroke", Integer.valueOf(R.raw.icon_video_quality_auto_fill));
        map.put("liveIconVideQualityOriginStroke", Integer.valueOf(R.raw.icon_video_quality_origin_fill));
        map.put("liveIcon2ptGuessing", Integer.valueOf(R.raw.icon_questionmark_square_fill));
        if (Game2kSdkKeySetting.INSTANCE.enable()) {
            map.put("liveIconVideQuality1440Stroke", Integer.valueOf(R.raw.icon_video_quality_2k_fill));
        }
        return map;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean FG1() {
        C451450Hn5.LIZ();
        return C451440Hn4.LIZ(4);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final List<C1115500f8O> cq1() {
        C451450Hn5.LIZ();
        List<ImSysEmojiModel> listLIZIZ = C451440Hn4.LIZIZ(4);
        ArrayList arrayList = new ArrayList();
        if (listLIZIZ != null && (!listLIZIZ.isEmpty())) {
            for (ImSysEmojiModel imSysEmojiModel : listLIZIZ) {
                C1115500f8O c1115500f8O = new C1115500f8O();
                c1115500f8O.previewEmoji = imSysEmojiModel.getPreviewEmoji();
                List<String> emojiList = imSysEmojiModel.getEmojiList();
                if (emojiList == null) {
                    emojiList = new ArrayList<>();
                }
                c1115500f8O.emojiList.addAll(emojiList);
                c1115500f8O.miniSupportSysVersion = imSysEmojiModel.getMiniSupportSysVersion();
                c1115500f8O.businessType = imSysEmojiModel.getBusinessType();
                arrayList.add(c1115500f8O);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String dp() {
        return C1553670qX7.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.15Ds] */
    public static InterfaceC20485015Ds LIZ(FragmentManager fragmentManager) {
        Fragment next = 0;
        if (fragmentManager == null) {
            return null;
        }
        Iterator<Fragment> it2 = fragmentManager.LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if ((next instanceof InterfaceC20485015Ds) || (next = LIZ(next.getChildFragmentManager())) != 0) {
                break;
            }
        }
        return (InterfaceC20485015Ds) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC20573715ex LIZIZ(Context context) {
        C128Y c128yLIZLLL;
        Fragment fragmentBQ2;
        Fragment fragmentBQ22;
        if (context == 0) {
            return null;
        }
        if (context instanceof InterfaceC20573715ex) {
            return (InterfaceC20573715ex) context;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZ = C520150Kab.LIZ(context);
        if (abstractC1387200mCcLIZ != null) {
            c128yLIZLLL = abstractC1387200mCcLIZ.LIZLLL();
        } else {
            c128yLIZLLL = null;
        }
        if (c128yLIZLLL instanceof InterfaceC20573715ex) {
            return (InterfaceC20573715ex) c128yLIZLLL;
        }
        TabChangeManager tabChangeManagerLIZJ = LIZJ(context);
        if (tabChangeManagerLIZJ != null) {
            fragmentBQ2 = tabChangeManagerLIZJ.BQ2();
        } else {
            fragmentBQ2 = null;
        }
        if (fragmentBQ2 instanceof InterfaceC20573715ex) {
            TabChangeManager tabChangeManagerLIZJ2 = LIZJ(context);
            if (tabChangeManagerLIZJ2 != null) {
                fragmentBQ22 = tabChangeManagerLIZJ2.BQ2();
            } else {
                fragmentBQ22 = null;
            }
            if (!(fragmentBQ22 instanceof InterfaceC20573715ex)) {
                return null;
            }
            return (InterfaceC20573715ex) fragmentBQ22;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZIZ(((ContextWrapper) context).getBaseContext());
    }

    public static TabChangeManager LIZJ(Context context) {
        Activity activityLIZ;
        C19EG c19eg;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || !(c19eg instanceof InterfaceC1603190roz)) {
            return null;
        }
        return C343710Ddh.LIZ(c19eg);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String C5(String str) {
        C20573515ev.LIZ.getClass();
        return C20573515ev.LIZLLL(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String Dd1(String str) {
        C20573515ev.LIZ.getClass();
        return C20573515ev.LJ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean Mj2(String str) {
        return C439870HMr.LIZ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void NP0(String str) {
        String str2;
        C20573515ev.LIZ.getClass();
        if (!GeckoStorageOptSetting.INSTANCE.isOpt(str)) {
            C20573515ev.LJFF();
            C19866712oD c19866712oD = C20573515ev.LIZIZ;
            if (c19866712oD != null && (str2 = c19866712oD.LIZJ) != null) {
                C1537050q6J.LIZ.getClass();
                C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str2);
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(3);
                Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(str2, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str))));
                if (c1551950qULLIZ != null) {
                    c1551950qULLIZ.LIZ(null, mapLIZJ, optionCheckUpdateParams);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final Object NS(Context context) {
        return new GeckoXNetImpl();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void OP(boolean z) {
        C20573515ev.LIZ.getClass();
        C1551680qTu c1551680qTu = C20573515ev.LJI;
        if (c1551680qTu != null && !c1551680qTu.LIZIZ()) {
            c1551680qTu.LIZJ();
            C20573515ev.LIZIZ("pause");
        }
        if (z || C20573515ev.LJ) {
            C20573515ev.LIZJ = -1;
            C20573515ev.LJI = null;
            C20573515ev.LJFF = false;
            C20573515ev.LIZLLL = 0L;
        }
        C1551680qTu c1551680qTu2 = C20573515ev.LJIIL;
        if (c1551680qTu2 != null && !c1551680qTu2.LIZIZ()) {
            c1551680qTu2.LIZJ();
            C20573515ev.LIZIZ("pause");
        }
        if (z || C20573515ev.LJIIJ) {
            C20573515ev.LJIIIIZZ = -1;
            C20573515ev.LJIIL = null;
            C20573515ev.LJIIJJI = false;
            C20573515ev.LJIIIZ = 0L;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final String OQ1(Context context) {
        String string;
        if (context == null || (string = context.getString(2131857725)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final long Pr2(String str) {
        String str2;
        long jLongValue = 0;
        try {
            C20573515ev.LIZ.getClass();
            C19866712oD c19866712oD = C20573515ev.LIZIZ;
            if (c19866712oD != null) {
                str2 = c19866712oD.LIZJ;
            } else {
                str2 = null;
            }
            Long lLIZJ = C1550610qSB.LIZJ(str2, str);
            if (lLIZJ == null) {
                return 0L;
            }
            jLongValue = lLIZJ.longValue();
            return jLongValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return jLongValue;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean Xg1(String str) {
        String str2;
        C20573515ev.LIZ.getClass();
        if (!TextUtils.isEmpty(str)) {
            C20573515ev.LJFF();
            C19866712oD c19866712oD = C20573515ev.LIZIZ;
            if (c19866712oD != null) {
                str2 = c19866712oD.LIZJ;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C1553670qX7.LIZ.getClass();
                C1553670qX7.LIZLLL();
                return C1550610qSB.LIZ(str2, str);
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void pB(String str) {
        C20573515ev.LIZ.getClass();
        if (!TextUtils.isEmpty(str)) {
            C0X9F.LJ(new C0VSJ(str));
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean u61(String str) {
        String str2;
        C20573515ev.LIZ.getClass();
        if (!TextUtils.isEmpty(str)) {
            C20573515ev.LJFF();
            C19866712oD c19866712oD = C20573515ev.LIZIZ;
            if (c19866712oD != null) {
                str2 = c19866712oD.LIZJ;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C1553670qX7.LIZ.getClass();
                C1553670qX7.LIZLLL();
                return C1550600qSA.LIZ(str2, str);
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void ud2(String str) {
        String str2;
        C20573515ev.LIZ.getClass();
        if (!GeckoStorageOptSetting.INSTANCE.isOpt(str)) {
            C20573515ev.LJFF();
            C19866712oD c19866712oD = C20573515ev.LIZIZ;
            if (c19866712oD != null && (str2 = c19866712oD.LIZJ) != null) {
                C1537050q6J.LIZ.getClass();
                C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str2);
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(3);
                optionCheckUpdateParams.setLazyUpdate(true);
                Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(str2, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str))));
                if (c1551950qULLIZ != null) {
                    c1551950qULLIZ.LIZ(null, mapLIZJ, optionCheckUpdateParams);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final long ze(C0VSJ c0vsj) {
        return LiveMonitorService.LIZ().ze(c0vsj);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final File HX(String str, String str2) {
        try {
            C20573515ev.LIZ.getClass();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String strLJ = C20573515ev.LJ(str);
                if (!TextUtils.isEmpty(strLJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJ);
                    sbLIZ.append(File.separator);
                    sbLIZ.append(str2);
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                    if (c0vsj.exists()) {
                        return c0vsj;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final boolean Pw2(String str, String str2) {
        return C1552050qUV.LIZIZ(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final List<String> hT0(String str, String str2) {
        C20573515ev.LIZ.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TtLiveGeckoCdnBasePathOptSetting.INSTANCE.getUrlList(str, str2);
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final List<String> mN(String str, String str2) {
        C20573515ev.LIZ.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TTLiveGeckoBaseUrlSetting.getUrlList(str, str2);
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostResource
    public final void nd1(AbstractC1552040qUU abstractC1552040qUU, String str) {
        String str2;
        C20573515ev.LIZ.getClass();
        if (!GeckoStorageOptSetting.INSTANCE.isOpt(str)) {
            C20573515ev.LJFF();
            C19866712oD c19866712oD = C20573515ev.LIZIZ;
            if (c19866712oD != null && (str2 = c19866712oD.LIZJ) != null) {
                C1537050q6J.LIZ.getClass();
                C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str2);
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(3);
                optionCheckUpdateParams.setListener(abstractC1552040qUU);
                Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(str2, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str))));
                if (c1551950qULLIZ != null) {
                    c1551950qULLIZ.LIZ(null, mapLIZJ, optionCheckUpdateParams);
                }
            }
        }
    }
}
