// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface BatchCreateMediaItemsResponseOrBuilder
        extends
        // @@protoc_insertion_point(interface_extends:google.photos.library.v1.BatchCreateMediaItemsResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * [Output only] List of media items created.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.NewMediaItemResult new_media_item_results = 1;</code>
     */
    java.util.List<com.google.photos.library.v1.proto.NewMediaItemResult>
    getNewMediaItemResultsList();

    /**
     * <pre>
     * [Output only] List of media items created.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.NewMediaItemResult new_media_item_results = 1;</code>
     */
    com.google.photos.library.v1.proto.NewMediaItemResult getNewMediaItemResults(int index);

    /**
     * <pre>
     * [Output only] List of media items created.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.NewMediaItemResult new_media_item_results = 1;</code>
     */
    int getNewMediaItemResultsCount();

    /**
     * <pre>
     * [Output only] List of media items created.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.NewMediaItemResult new_media_item_results = 1;</code>
     */
    java.util.List<? extends com.google.photos.library.v1.proto.NewMediaItemResultOrBuilder>
    getNewMediaItemResultsOrBuilderList();

    /**
     * <pre>
     * [Output only] List of media items created.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.NewMediaItemResult new_media_item_results = 1;</code>
     */
    com.google.photos.library.v1.proto.NewMediaItemResultOrBuilder getNewMediaItemResultsOrBuilder(
            int index);
}
