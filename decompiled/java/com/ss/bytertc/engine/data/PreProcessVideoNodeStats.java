package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes21.dex */
public class PreProcessVideoNodeStats {
    public int adapted_resolution_height;
    public int adapted_resolution_width;
    public int average_bmf_process_time;
    public int average_effect_process_time;
    public int average_frame_interval_time;
    public int average_render_process_time;
    public String effect_process_details;
    public float frame_rate_camera_output;
    public float frame_rate_render_input;
    public float frame_rate_render_output;
    public int original_capture_height;
    public int original_capture_width;
    public String render_stall_details;
    public int up_render_stall_100;
    public int up_render_stall_200;
    public int up_render_stall_500;

    public int getAdaptedResolutionHeight() {
        return this.adapted_resolution_height;
    }

    public int getAdaptedResolutionWidth() {
        return this.adapted_resolution_width;
    }

    public int getAverageBmfProcessTime() {
        return this.average_bmf_process_time;
    }

    public int getAverageEffectProcessTime() {
        return this.average_effect_process_time;
    }

    public int getAverageFrameIntervalTime() {
        return this.average_frame_interval_time;
    }

    public int getAverageRenderProcessTime() {
        return this.average_render_process_time;
    }

    public String getEffectProcessDetails() {
        return this.effect_process_details;
    }

    public float getFrameRateCameraOutput() {
        return this.frame_rate_camera_output;
    }

    public float getFrameRateRenderInput() {
        return this.frame_rate_render_input;
    }

    public float getFrameRateRenderOutput() {
        return this.frame_rate_render_output;
    }

    public int getOriginalCaptureHeight() {
        return this.original_capture_height;
    }

    public int getOriginalCaptureWidth() {
        return this.original_capture_width;
    }

    public String getRenderStallDetails() {
        return this.render_stall_details;
    }

    public int getUpRenderStall100() {
        return this.up_render_stall_100;
    }

    public int getUpRenderStall200() {
        return this.up_render_stall_200;
    }

    public int getUpRenderStall500() {
        return this.up_render_stall_500;
    }

    public PreProcessVideoNodeStats(float f, float f2, float f3, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2, int i8, int i9, int i10, int i11) {
        this.frame_rate_camera_output = f;
        this.frame_rate_render_input = f2;
        this.frame_rate_render_output = f3;
        this.up_render_stall_100 = i;
        this.up_render_stall_200 = i2;
        this.up_render_stall_500 = i3;
        this.average_bmf_process_time = i4;
        this.average_effect_process_time = i5;
        this.average_render_process_time = i6;
        this.average_frame_interval_time = i7;
        this.render_stall_details = str;
        this.effect_process_details = str2;
        this.original_capture_width = i8;
        this.original_capture_height = i9;
        this.adapted_resolution_width = i10;
        this.adapted_resolution_height = i11;
    }
}
